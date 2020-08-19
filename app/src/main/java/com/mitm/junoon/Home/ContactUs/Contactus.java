package com.mitm.junoon.Home.ContactUs;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.mitm.junoon.Extra.CallActivity;
import com.mitm.junoon.R;


public class Contactus extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactus);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }

    public void insta(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/junoon_mit/"));
        startActivity(browserIntent);
        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);

    }

    public void fb(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/junoonmit" ));
        startActivity(browserIntent);
        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
    }

public void mail(View view){

    String to = "junoonmit@gmail.com";
    Intent email = new Intent(Intent.ACTION_SEND);
    email.putExtra(Intent.EXTRA_EMAIL  , new String[]{to});
    email.setType("message/rfc822");
    startActivity(Intent.createChooser(email, "Choose an Email client :"));
    overridePendingTransition(R.anim.goup,R.anim.godown);



}
    public void call(View view){

        Intent intent = new Intent(getBaseContext(), CallActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.dekh1, R.anim.dekh2);
    }

    public void find(View view){

       Uri uri = Uri.parse("geo:0,0?q=\""+26.1413+","+85.3654+"\"");
        Intent intent = new Intent(android.content.Intent.ACTION_VIEW, uri);
        intent.setPackage("com.google.android.apps.maps");
        startActivity(intent);

    }  public void youtube(View view){

        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/channel/UC90KBMC-3rEDgwiOVESGOHw/videos" ));
        startActivity(browserIntent);

    }  public void tweet(View view){

        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/junoonmit"));
        startActivity(browserIntent);

    }

}