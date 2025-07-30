package com.wecurewellness.consultancy;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

import android.os.Bundle;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.wecurewellness.consultancy.databinding.ActivityDoctorSignupBinding;

public class DoctorSignUpActivity extends AppCompatActivity {

    ActivityDoctorSignupBinding binding;
    Animation doctor_logo_anim, register_anim, yourself_anim, details_container_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_doctor_signup);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        binding = ActivityDoctorSignupBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setupAnimations();

    }

    private void setupAnimations() {

        doctor_logo_anim = AnimationUtils.loadAnimation(this, R.anim.doctor_signup_logo_anim);
        binding.doctorIconAnim.setAnimation(doctor_logo_anim);

        register_anim = AnimationUtils.loadAnimation(this, R.anim.doctor_signup_register_anim);
        binding.registerText.setAnimation(register_anim);

        yourself_anim = AnimationUtils.loadAnimation(this, R.anim.doctor_signup_yourself_anim);
        binding.yourselfText.setAnimation(yourself_anim);

        binding.doctorDetailsContainer.setVisibility(GONE);

        binding.doctorDetailsContainer.postDelayed(new Runnable() {
            @Override
            public void run() {

                binding.doctorDetailsContainer.setVisibility(VISIBLE);
                details_container_anim = AnimationUtils.loadAnimation(DoctorSignUpActivity.this, R.anim.doctor_details_container_anim);
                binding.doctorDetailsContainer.setAnimation(details_container_anim);

            }
        }, 500);

    }
}