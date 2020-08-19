package com.mitm.junoon.Home.Events.EventList;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.mitm.junoon.PostListActivity;
import com.mitm.junoon.R;


public class Youtube  extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.youtube);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        toolbar=findViewById(R.id.toolbarCustom);
        setSupportActionBar(toolbar);
    }

    public void tukka(View view){
        Intent intent = new Intent(getBaseContext(), PostListActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
    }


    public void rate(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id=com.mitm.junoon"));
        startActivity(browserIntent);

    }

    public void share(View view){
        Intent shareintent = new Intent(Intent.ACTION_SEND);
        shareintent.setType("text/plain");
        String shareBody = "Download this Application now :- http://play.google.com/store/apps/details?id=com.mitm.junoon&hl=en";
        String sharesub="JUNOON";
        shareintent.putExtra(Intent.EXTRA_SUBJECT,sharesub);
        shareintent.putExtra(Intent.EXTRA_TEXT,shareBody);
        startActivity(Intent.createChooser(shareintent,"Share Using:"));

    }

}