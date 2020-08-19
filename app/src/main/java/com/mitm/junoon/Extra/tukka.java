package com.mitm.junoon.Extra;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.mitm.junoon.R;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

@Keep
public class tukka  extends AppCompatActivity {
    FirebaseRemoteConfig mFirebaseRemoteConfig;

TextView textView,textView2,textView3,textView4,textView5,textView6,textView7,textView8,textView9
        ,textView10,textView11,textView12,textView13,textView14,textView15,textView16,textView17,
        textView18,textView19,textView20;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tukka);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

     textView=findViewById(R.id.message_view);
     textView2=findViewById(R.id.message_view2);
     textView3=findViewById(R.id.message_view3);
     textView4=findViewById(R.id.message_view4);
     textView5=findViewById(R.id.message_view5);
     textView6=findViewById(R.id.message_view6);
     textView7=findViewById(R.id.message_view7);
     textView8=findViewById(R.id.message_view8);
     textView9=findViewById(R.id.message_view9);
     textView10=findViewById(R.id.message_view10);
     textView11=findViewById(R.id.message_view11);
     textView12=findViewById(R.id.message_view12);
     textView13=findViewById(R.id.message_view13);
     textView14=findViewById(R.id.message_view14);
     textView15=findViewById(R.id.message_view15);
     textView16=findViewById(R.id.message_view16);
     textView17=findViewById(R.id.message_view17);
     textView18=findViewById(R.id.message_view18);
     textView19=findViewById(R.id.message_view19);
     textView20=findViewById(R.id.message_view20);

        mFirebaseRemoteConfig  =FirebaseRemoteConfig.getInstance();
        mFirebaseRemoteConfig.setDefaults(R.xml.price_tool);

     long exp = 0;
        mFirebaseRemoteConfig.fetch(exp)
                .addOnCompleteListener(this, new OnCompleteListener<Void>() {

                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()) {
                            String price = mFirebaseRemoteConfig.getString("price");
                            String price2 = mFirebaseRemoteConfig.getString("price2");
                            String price3 = mFirebaseRemoteConfig.getString("price3");
                            String price4 = mFirebaseRemoteConfig.getString("price4");
                            String price5 = mFirebaseRemoteConfig.getString("price5");
                            String price6 = mFirebaseRemoteConfig.getString("price6");
                            String price7 = mFirebaseRemoteConfig.getString("price7");
                            String price8 = mFirebaseRemoteConfig.getString("price8");
                            String price9 = mFirebaseRemoteConfig.getString("price9");
                            String price10 = mFirebaseRemoteConfig.getString("price10");
                            String price11 = mFirebaseRemoteConfig.getString("price11");
                            String price12 = mFirebaseRemoteConfig.getString("price12");
                            String price13 = mFirebaseRemoteConfig.getString("price13");
                            String price14 = mFirebaseRemoteConfig.getString("price14");
                            String price15 = mFirebaseRemoteConfig.getString("price15");
                            String price16 = mFirebaseRemoteConfig.getString("price16");
                            String price17 = mFirebaseRemoteConfig.getString("price17");
                            String price18 = mFirebaseRemoteConfig.getString("price18");
                            String price19 = mFirebaseRemoteConfig.getString("price19");
                            String price20 = mFirebaseRemoteConfig.getString("price20");
                            Toast.makeText(getApplicationContext(), "Notifications",
                                    Toast.LENGTH_LONG).show();
                            mFirebaseRemoteConfig.activateFetched();
                        }
                        displayWelcomeMessage();
                        displayWelcomeMessage2();
                        displayWelcomeMessage3();
                        displayWelcomeMessage4();
                        displayWelcomeMessage5();
                        displayWelcomeMessage6();
                        displayWelcomeMessage7();
                        displayWelcomeMessage8();
                        displayWelcomeMessage9();
                        displayWelcomeMessage10();
                        displayWelcomeMessage11();
                        displayWelcomeMessage12();
                        displayWelcomeMessage13();
                        displayWelcomeMessage14();
                        displayWelcomeMessage15();
                        displayWelcomeMessage16();
                        displayWelcomeMessage17();
                        displayWelcomeMessage18();
                        displayWelcomeMessage19();
                        displayWelcomeMessage20();
                    }
                });


    }

    private void displayWelcomeMessage() {
 textView.setText(mFirebaseRemoteConfig.getString("price"));
    }
    private void displayWelcomeMessage2() {
 textView2.setText(mFirebaseRemoteConfig.getString("price2"));
    }
    private void displayWelcomeMessage3() {
 textView3.setText(mFirebaseRemoteConfig.getString("price3"));
    }
    private void displayWelcomeMessage4() {
 textView4.setText(mFirebaseRemoteConfig.getString("price4"));
    }
    private void displayWelcomeMessage5() {
 textView5.setText(mFirebaseRemoteConfig.getString("price5"));
    }
    private void displayWelcomeMessage6() {
 textView6.setText(mFirebaseRemoteConfig.getString("price6"));
    }
    private void displayWelcomeMessage7() {
 textView7.setText(mFirebaseRemoteConfig.getString("price7"));
    }
    private void displayWelcomeMessage8() {
 textView8.setText(mFirebaseRemoteConfig.getString("price8"));
    }
    private void displayWelcomeMessage9() {
 textView9.setText(mFirebaseRemoteConfig.getString("price9"));
    }
    private void displayWelcomeMessage10() {
 textView10.setText(mFirebaseRemoteConfig.getString("price10"));
    }


    private void displayWelcomeMessage11() {
 textView11.setText(mFirebaseRemoteConfig.getString("price11"));
    }
    private void displayWelcomeMessage12() {
 textView12.setText(mFirebaseRemoteConfig.getString("price12"));
    }
    private void displayWelcomeMessage13() {
 textView13.setText(mFirebaseRemoteConfig.getString("price13"));
    }
    private void displayWelcomeMessage14() {
 textView14.setText(mFirebaseRemoteConfig.getString("price14"));
    }
    private void displayWelcomeMessage15() {
 textView15.setText(mFirebaseRemoteConfig.getString("price15"));
    }
    private void displayWelcomeMessage16() {
 textView16.setText(mFirebaseRemoteConfig.getString("price16"));
    }
    private void displayWelcomeMessage17() {
 textView17.setText(mFirebaseRemoteConfig.getString("price17"));
    }
    private void displayWelcomeMessage18() {
 textView18.setText(mFirebaseRemoteConfig.getString("price18"));
    }
    private void displayWelcomeMessage19() {
 textView19.setText(mFirebaseRemoteConfig.getString("price19"));
    }
    private void displayWelcomeMessage20() {
 textView20.setText(mFirebaseRemoteConfig.getString("price20"));
    }




    public void insta(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/junoon_mit/"));
        startActivity(browserIntent);
        overridePendingTransition(R.anim.goup,R.anim.godown);

    }

    public void fb(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/junoonmit" ));
        startActivity(browserIntent);
        overridePendingTransition(R.anim.goup,R.anim.godown);
    }

    public void mail(View view){

        String to = "junoonmit@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL  , new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup,R.anim.godown);

    }

}


