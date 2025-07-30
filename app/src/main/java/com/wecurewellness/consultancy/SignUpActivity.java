package com.wecurewellness.consultancy;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.wecurewellness.consultancy.databinding.ActivitySignUpBinding;

public class SignUpActivity extends AppCompatActivity {

    ActivitySignUpBinding binding;
    Animation user_register_anim, doctor_register_anim;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_sign_up);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        binding = ActivitySignUpBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        user_register_anim = AnimationUtils.loadAnimation(this, R.anim.signup_user_register_anim);
        binding.userSignUpButton.setAnimation(user_register_anim);

        doctor_register_anim = AnimationUtils.loadAnimation(this, R.anim.signup_doctor_register_anim);
        binding.doctorSignUpButton.setAnimation(doctor_register_anim);

        binding.userSignUpButton.setOnClickListener(v -> {
            Intent userSignUp = new Intent(SignUpActivity.this, UserSignUpActivity.class);
            startActivity(userSignUp);
        });

        binding.doctorSignUpButton.setOnClickListener(v -> {
            Intent doctorSignUp = new Intent(SignUpActivity.this, DoctorSignUpActivity.class);
            startActivity(doctorSignUp);
        });


    }
}