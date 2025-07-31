package com.wecurewellness.consultancy;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.wecurewellness.consultancy.databinding.ActivitySplashscreenBinding;

public class SplashScreenActivity extends AppCompatActivity {

    ActivitySplashscreenBinding binding;
    Animation app_name_anim, divider_slide_right_anim, divider_slide_left_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        EdgeToEdge.enable(this);
//        setContentView(R.layout.activity_splashscreen);
//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });

        binding = ActivitySplashscreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        app_name_anim = AnimationUtils.loadAnimation(this, R.anim.splashscreen_app_name_anim);
        binding.textView.setAnimation(app_name_anim);

        divider_slide_right_anim = AnimationUtils.loadAnimation(this, R.anim.splashscreen_divider_slide_right_anim);
        binding.materialDivider1.setAnimation(divider_slide_right_anim);

        divider_slide_left_anim = AnimationUtils.loadAnimation(this, R.anim.splashscreen_divider_slide_left_anim);
        binding.materialDivider2.setAnimation(divider_slide_left_anim);

        divider_slide_left_anim = AnimationUtils.loadAnimation(this, R.anim.splashscreen_divider_slide_left_anim);
        binding.materialDivider3.setAnimation(divider_slide_left_anim);

        divider_slide_right_anim = AnimationUtils.loadAnimation(this, R.anim.splashscreen_divider_slide_right_anim);
        binding.materialDivider4.setAnimation(divider_slide_right_anim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent signupIntent = new Intent(SplashScreenActivity.this, SignUpActivity.class);
                SplashScreenActivity.this.startActivity(signupIntent);
                SplashScreenActivity.this.finish();
            }
        }, 2000);

    }
}