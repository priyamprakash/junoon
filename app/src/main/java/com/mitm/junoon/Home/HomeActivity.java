package com.mitm.junoon.Home;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.widget.AdapterViewFlipper;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.mitm.junoon.Extra.MyAdapterFlipper;
import com.mitm.junoon.Home.About.Activityoneone;
import com.mitm.junoon.Home.Achievements.Achievements;
import com.mitm.junoon.Home.AppTheme.AppTheme;
import com.mitm.junoon.Home.ContactUs.Contactus;
import com.mitm.junoon.Home.Developers.Developers;
import com.mitm.junoon.Home.Events.EventDetail.Earlyevents;
import com.mitm.junoon.Home.Events.EventList.EventActivity;
import com.mitm.junoon.Home.Events.EventList.Youtube;
import com.mitm.junoon.Home.Founder.Founder;
import com.mitm.junoon.Home.Team.TeamList.Activityonethree;
import com.mitm.junoon.Home.society.SocietyList.LoginActivity;
import com.mitm.junoon.PostListActivity;
import com.mitm.junoon.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;

import java.util.Locale;
import java.util.Objects;

 @Keep
public class HomeActivity extends AppCompatActivity {
    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button12;
    AdapterViewFlipper adapterViewFlipper;
    Locale myLocale;
    Switch aSwitch;
    Toolbar toolbar;
    TextView e1,h1,e2,h2,e3,h3,e4,h4,e5,h5,e6,h6,e7,h7,e8,h8,e9,h9,e10,h10,e11,h11,e12,h12;


    int[] images={R.drawable.flipone, R.drawable.flip2, R.drawable.flip3};


     @Override
    protected void onCreate(Bundle savedInstanceState)
     {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);


          e1=findViewById(R.id.e1);
          h1=findViewById(R.id.h1);
          e2=findViewById(R.id.e2);
          h2=findViewById(R.id.h2);

          e3=findViewById(R.id.e3);
          h3=findViewById(R.id.h3);
          e4=findViewById(R.id.e4);
          h4=findViewById(R.id.h4);
          e5=findViewById(R.id.e5);
          h5=findViewById(R.id.h5);
          e6=findViewById(R.id.e6);
          h6=findViewById(R.id.h6);
          e7=findViewById(R.id.e7);
          h7=findViewById(R.id.h7);
          e8=findViewById(R.id.e8);
          h8=findViewById(R.id.h8);
          e9=findViewById(R.id.e9);
          h9=findViewById(R.id.h9);
          e10=findViewById(R.id.e10);
          h10=findViewById(R.id.h10);
          e11=findViewById(R.id.e11);
          h11=findViewById(R.id.h11);
          e12=findViewById(R.id.e12);
          h12=findViewById(R.id.h12);

        toolbar=findViewById(R.id.toolbarCustom);
        setSupportActionBar(toolbar);

       getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


         aSwitch=findViewById(R.id.switch1);
         //---push notification------
         if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
         {

             NotificationChannel channel=
                     new NotificationChannel("MyNotifications","MyNotifications",
                             NotificationManager.IMPORTANCE_DEFAULT);

             NotificationManager manager=getSystemService(NotificationManager.class);
             Objects.requireNonNull(manager).createNotificationChannel(channel);
         }


//subscribing to push notification , topic= general

         FirebaseMessaging.getInstance().subscribeToTopic("general")
                     .addOnCompleteListener(new OnCompleteListener<Void>() {
                     @Override
                     public void onComplete(@NonNull Task<Void> task) {
                         String msg = "Successful";
                         if (!task.isSuccessful()) {
                             msg = "Failed";
                         }
                         // Log.d(TAG, msg);
                         Toast.makeText(HomeActivity.this, "Welcome to JUNNON", Toast.LENGTH_LONG).show();
                     }
                 });


        //----------flipper,for changing images-------
             adapterViewFlipper=findViewById(R.id.adapter_view_flipper);
            MyAdapterFlipper myAdapterFlipper=new MyAdapterFlipper(this,images);
            adapterViewFlipper.setAdapter(myAdapterFlipper);
            adapterViewFlipper.setFlipInterval(2000);
            adapterViewFlipper.setAutoStart(true);
//-------intent-----------------------


        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Activityoneone.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }

        });


        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
            }

        });


        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), EventActivity.class);
                startActivity(intent);

                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }

        });
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Founder.class);
                startActivity(intent);

                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }

        });


        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Activityonethree.class);
                startActivity(intent);

                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }

        });
        button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Achievements.class);
                startActivity(intent);

                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }

        });

        button7 = findViewById(R.id.button7);
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Contactus.class);
                startActivity(intent);

                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }

        });


        button8 = findViewById(R.id.button8);
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Developers.class);
                startActivity(intent);

                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }

        });
        button9 = findViewById(R.id.button9);
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), AppTheme.class);
                startActivity(intent);

                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }

        });
        button10 = findViewById(R.id.button10);
        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), PostListActivity.class);
                startActivity(intent);

                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }

        });
        button11 = findViewById(R.id.button11);
        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Earlyevents.class);
                startActivity(intent);

                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }

        });
        button12 = findViewById(R.id.button12);
        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Youtube.class);
                startActivity(intent);

                overridePendingTransition(R.anim.slide_from_right, R.anim.slide_to_left);
            }

        });





//this is for transition of background


        /* myLayout= findViewById(R.id.myLayout);
         animationDrawable=(AnimationDrawable) myLayout.getBackground();
        animationDrawable.setEnterFadeDuration(4500);*/
        //animationDrawable.setExitFadeDuration(4000);
        //animationDrawable.start();


// fade in fadeout wla ,just change the float value to 0.0
// -----------------------------------------------------------------------------
        // imageview100 = findViewById(R.id.imageView100);
        Animation animation = new AlphaAnimation(1, (float) 1.0); //to change visibility
        // from
        // visible to
        // invisible
        animation.setDuration(1000); //1 second duration for each animation cycle
        animation.setInterpolator(new LinearInterpolator());
        animation.setRepeatCount(Animation.INFINITE); //repeating indefinitely
        animation.setRepeatMode(Animation.REVERSE); //animation will start from end point once ended.
        // imageview100.startAnimation(animation); //to start animation
//-------------------------------------------------------------
        blink();

    }


//-----to blink, welcome to junoon---------
    private void blink() {
        final Handler handler = new Handler();
        new Thread(new Runnable() {
            @Override
            public void run() {
                int timeToBlink = 1000;
                //noinspection CatchMayIgnoreException
                try {
                    Thread.sleep(timeToBlink);
                } catch (InterruptedException e) {

                }
                handler.post(new Runnable() {
                    @Override
                    public void run() {
                        TextView txt = findViewById(R.id.textView99);

                        if (txt.getVisibility() == View.VISIBLE)
                        {
                            txt.setVisibility(View.INVISIBLE);

                        }
                        else
                        {
                            txt.setVisibility(View.VISIBLE);
                        }
                        blink();
                    }
                });
            }
        }).start();
    }

//switch position , on= hindi , off=english
    public void OnSwitchClick(View view) {
        if (aSwitch.isChecked()) {
            Toast.makeText(HomeActivity.this, "Language switched to Hindi", Toast.LENGTH_LONG).show();
            setLocale("hi");
            h1.setVisibility(View.VISIBLE);
            e1.setVisibility(View.INVISIBLE);
            h2.setVisibility(View.VISIBLE);
            e2.setVisibility(View.INVISIBLE);
            h3.setVisibility(View.VISIBLE);
            e3.setVisibility(View.INVISIBLE);
            h4.setVisibility(View.VISIBLE);
            e4.setVisibility(View.INVISIBLE);
            h5.setVisibility(View.VISIBLE);
            e5.setVisibility(View.INVISIBLE);
            h6.setVisibility(View.VISIBLE);
            e6.setVisibility(View.INVISIBLE);
            h7.setVisibility(View.VISIBLE);
            e7.setVisibility(View.INVISIBLE);
            h8.setVisibility(View.VISIBLE);
            e8.setVisibility(View.INVISIBLE);
            h9.setVisibility(View.VISIBLE);
            e9.setVisibility(View.INVISIBLE);
            h10.setVisibility(View.VISIBLE);
            e10.setVisibility(View.INVISIBLE);
            h11.setVisibility(View.VISIBLE);
            e11.setVisibility(View.INVISIBLE);
            h12.setVisibility(View.VISIBLE);
            e12.setVisibility(View.INVISIBLE);
        } else {
            Toast.makeText(HomeActivity.this, "Language switched to English", Toast.LENGTH_LONG).show();
            setLocale("en");
            h1.setVisibility(View.INVISIBLE);
            e1.setVisibility(View.VISIBLE);
            h2.setVisibility(View.INVISIBLE);
            e2.setVisibility(View.VISIBLE);
            h3.setVisibility(View.INVISIBLE);
            e3.setVisibility(View.VISIBLE);
            h4.setVisibility(View.INVISIBLE);
            e4.setVisibility(View.VISIBLE);
            h5.setVisibility(View.INVISIBLE);
            e5.setVisibility(View.VISIBLE);
            h6.setVisibility(View.INVISIBLE);
            e6.setVisibility(View.VISIBLE);
            h7.setVisibility(View.INVISIBLE);
            e7.setVisibility(View.VISIBLE);
            h8.setVisibility(View.INVISIBLE);
            e8.setVisibility(View.VISIBLE);
            h9.setVisibility(View.INVISIBLE);
            e9.setVisibility(View.VISIBLE);
            h10.setVisibility(View.INVISIBLE);
            e10.setVisibility(View.VISIBLE);
            h11.setVisibility(View.INVISIBLE);
            e11.setVisibility(View.VISIBLE);
            h12.setVisibility(View.INVISIBLE);
            e12.setVisibility(View.VISIBLE);

        }
    }

    public void setLocale(String lang) {

        myLocale = new Locale(lang);
        Resources res = getResources();
        DisplayMetrics dm = res.getDisplayMetrics();
        Configuration conf = res.getConfiguration();
        conf.locale = myLocale;
        res.updateConfiguration(conf, dm);
        // Intent refresh = new Intent(this,HomeActivity.class);
        //startActivity(refresh);

    }

//notifications
    public void tukka(View view){
        Intent intent = new Intent(getBaseContext(), PostListActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
    }

//rate app
    public void rate(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=com.mitm.junoon"));
        startActivity(browserIntent);

    }
//share app
    public void share(View view){
        Intent shareintent = new Intent(Intent.ACTION_SEND);
        shareintent.setType("text/plain");
        String shareBody = "Download this Application now :- http://play.google.com/store/apps/details?id=com.mitm.junoon&hl=en";
        String sharesub="JUNOON";
        shareintent.putExtra(Intent.EXTRA_SUBJECT,sharesub);
        shareintent.putExtra(Intent.EXTRA_TEXT,shareBody);
        startActivity(Intent.createChooser(shareintent,"Share Using:"));

    }


//dialog box
    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.junoon1);
        builder.setIcon(R.drawable.junooncircle);

        builder.setMessage(getString(R.string.exit)).setCancelable(false).setPositiveButton(
                getString(R.string.yes),
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        HomeActivity.super.onBackPressed();

                    }
                })
                .setNegativeButton(getString(R.string.no),
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int which) {
                                dialogInterface.cancel();
                            }
                        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();

    }


}




