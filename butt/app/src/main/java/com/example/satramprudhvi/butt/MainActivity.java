package com.example.satramprudhvi.butt;



import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.graphics.Color;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    View txt_sqr;
    Animation slideUpAnimation, slideDownAnimation;
    Button btn1,btn2,btn3,btnstp,btnleft,btnright,btnup,btndown;

    public static final int TRANSLATION_DISTANCE_DP = 500;
    long durationslide=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txt_sqr = findViewById(R.id.textView);


        btn1=findViewById(R.id.button);
        btn2=findViewById(R.id.button2);
        btn3=findViewById(R.id.button4);
        btnleft=findViewById(R.id.left);
        btnright=findViewById(R.id.right);
        btnup=findViewById(R.id.ups);
        btndown=findViewById(R.id.down);


        startanimation();

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                txt_sqr.setBackgroundColor(color);
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                durationslide=durationslide-50;
                if(durationslide<0){
                    Toast.makeText(getApplicationContext(),"speed cannot be negative",Toast.LENGTH_SHORT).show();
                }
                else{
                    startanimation();
                }


            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                durationslide=durationslide+50;
                startanimation();
            }
        });



        btnleft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                durationslide=durationslide+50;
                leftanimation();
            }
        });


        btnright.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                durationslide=durationslide+50;
                rightanimation();
            }
        });

        btnup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                durationslide=durationslide+50;
                upanimation();
            }
        });


        btndown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                durationslide=durationslide+50;
                downanimation();
            }
        });



    }




    private void startanimation() {
        Log.e("durations:", durationslide+"");
        slideDownAnimation=new TranslateAnimation(0,0,0,1000);
        slideDownAnimation.setDuration(durationslide);
        slideDownAnimation.setFillAfter(true);
        slideDownAnimation.setRepeatCount(-1);
        slideDownAnimation.setRepeatMode(Animation.REVERSE);

        txt_sqr.setAnimation(slideDownAnimation);



    }


    private void leftanimation() {
        Log.e("durations:", durationslide+"");
        slideDownAnimation=new TranslateAnimation(0,-500,0,0);
        slideDownAnimation.setDuration(durationslide);
        slideDownAnimation.setFillAfter(true);
        slideDownAnimation.setRepeatCount(-1);
        slideDownAnimation.setRepeatMode(Animation.RELATIVE_TO_PARENT);

        txt_sqr.setAnimation(slideDownAnimation);


    }

    private void rightanimation() {
        Log.e("durations:", durationslide+"");
        slideDownAnimation=new TranslateAnimation(0,500,0,0);
        slideDownAnimation.setDuration(durationslide);
        slideDownAnimation.setFillAfter(true);
        slideDownAnimation.setRepeatCount(-1);
        slideDownAnimation.setRepeatMode(Animation.RELATIVE_TO_PARENT);

        txt_sqr.setAnimation(slideDownAnimation);


    }
    private void upanimation() {
        Log.e("durations:", durationslide+"");
        slideDownAnimation=new TranslateAnimation(0,0,-500,0);
        slideDownAnimation.setDuration(durationslide);
        slideDownAnimation.setFillAfter(true);
        slideDownAnimation.setRepeatCount(-1);
        slideDownAnimation.setRepeatMode(Animation.RELATIVE_TO_PARENT);

        txt_sqr.setAnimation(slideDownAnimation);


    }
    private void downanimation() {
        Log.e("durations:", durationslide+"");
        slideDownAnimation=new TranslateAnimation(0,0,500,0);
        slideDownAnimation.setDuration(durationslide);
        slideDownAnimation.setFillAfter(true);
        slideDownAnimation.setRepeatCount(-1);
        slideDownAnimation.setRepeatMode(Animation.RELATIVE_TO_PARENT);

        txt_sqr.setAnimation(slideDownAnimation);


    }


}
