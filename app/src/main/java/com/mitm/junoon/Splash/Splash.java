package com.mitm.junoon.Splash;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.mitm.junoon.Home.HomeActivity;
import com.mitm.junoon.R;


public class Splash extends AppCompatActivity {
    Animation anim;
    ImageView splash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        splash=findViewById(R.id.splash);




                anim = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fade_in);
                anim.setAnimationListener(new Animation.AnimationListener()

                {
                    @Override
                    public void onAnimationStart(Animation animation)
                    {

                    }

                    @Override
                    public void onAnimationEnd(Animation animation)
                    {

                       startActivity(new Intent(getBaseContext(),
                               HomeActivity.class));
                        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation)
                    {

                    }
                });
                splash.startAnimation(anim);

            }


        }
