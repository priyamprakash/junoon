package com.mitm.junoon.Home.Team.TeamDetails;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.mitm.junoon.R;


public class secondyear extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_secondyear);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ImageView imageView1 = findViewById(R.id.imageView1);
        Glide.with(this).load("https://i.ibb.co/jhWPKHT/rahul18.jpg").placeholder(R.drawable.junooncircle).into(imageView1);

        ImageView imageView2 = findViewById(R.id.imageView2);
        Glide.with(this).load("https://i.ibb.co/JQnsXPt/abhinav1.jpg").placeholder(R.drawable.junooncircle).into(imageView2);

        ImageView imageView3 = findViewById(R.id.imageView3);
        Glide.with(this).load("https://i.ibb.co/L6xKkx3/yashshvi1.jpg").placeholder(R.drawable.junooncircle).into(imageView3);

        ImageView imageView4 = findViewById(R.id.imageView4);
        Glide.with(this).load("https://i.ibb.co/dfTW9Dm/yash2.png").placeholder(R.drawable.junooncircle).into(imageView4);

        ImageView imageView5 = findViewById(R.id.imageView5);
        Glide.with(this).load("https://i.ibb.co/QfKYFTz/juhi2.jpg").placeholder(R.drawable.junooncircle).into(imageView5);

        ImageView imageView6 = findViewById(R.id.imageView6);
        Glide.with(this).load("https://i.ibb.co/vXwZzfQ/rupin2.jpg").placeholder(R.drawable.junooncircle).into(imageView6);

        ImageView imageView7 = findViewById(R.id.imageView7);
        Glide.with(this).load("https://i.ibb.co/ftH29QD/nikita1.jpg").placeholder(R.drawable.junooncircle).into(imageView7);

        ImageView imageView8 = findViewById(R.id.imageView8);
        Glide.with(this).load("https://i.ibb.co/QM34xsH/shruti1.jpg").placeholder(R.drawable.junooncircle).into(imageView8);

        ImageView imageView9 = findViewById(R.id.imageView9);
        Glide.with(this).load(R.drawable.priyamprakash).placeholder(R.drawable.junooncircle).into(imageView9);

        ImageView imageView10 = findViewById(R.id.imageView10);
        Glide.with(this).load("https://i.ibb.co/y0TsDsm/sujittiwari2.jpg").placeholder(R.drawable.junooncircle).into(imageView10);

        ImageView imageView11 = findViewById(R.id.imageView11);
        Glide.with(this).load("https://i.ibb.co/f47bnDf/haidar.jpg").placeholder(R.drawable.junooncircle).into(imageView11);

        ImageView imageView12 = findViewById(R.id.imageView12);
        Glide.with(this).load("https://i.ibb.co/WKtZ8p5/abhishek2.png").placeholder(R.drawable.junooncircle).into(imageView12);

        ImageView imageView13 = findViewById(R.id.imageView13);
        Glide.with(this).load("https://i.ibb.co/B2JL30s/tej4.jpg").placeholder(R.drawable.junooncircle).into(imageView13);

        ImageView imageView14 = findViewById(R.id.imageView14);
        Glide.with(this).load("https://i.ibb.co/YP3SGKC/raviranjan1.jpg").placeholder(R.drawable.junooncircle).into(imageView14);

        ImageView imageView15 = findViewById(R.id.imageView15);
        Glide.with(this).load("https://i.ibb.co/gySZ3Xt/vishay2.jpg").placeholder(R.drawable.junooncircle).into(imageView15);

        ImageView imageView16 = findViewById(R.id.imageView16);
        Glide.with(this).load("https://i.ibb.co/LhMR9Kv/ayush1.jpg").placeholder(R.drawable.junooncircle).into(imageView16);

        ImageView imageView17 = findViewById(R.id.imageView17);
        Glide.with(this).load("https://i.ibb.co/h8qjb7q/sumitshek.jpg").placeholder(R.drawable.junooncircle).into(imageView17);

        ImageView imageView18 = findViewById(R.id.imageView18);
        Glide.with(this).load("https://i.ibb.co/sWtbCqh/pritam2.jpg").placeholder(R.drawable.junooncircle).into(imageView18);

        ImageView imageView19 = findViewById(R.id.imageView19);
        Glide.with(this).load("https://i.ibb.co/mzvs0Nr/rusi.jpg").placeholder(R.drawable.junooncircle).into(imageView19);

        ImageView imageView20 = findViewById(R.id.imageView20);
        Glide.with(this).load("https://i.ibb.co/NtYyRc6/rinki2.png").placeholder(R.drawable.junooncircle).into(imageView20);

        ImageView imageView21 = findViewById(R.id.imageView21);
        Glide.with(this).load("https://i.ibb.co/3NpRGcN/aradhya1.jpg").placeholder(R.drawable.junooncircle).into(imageView21);

    }


    public void one(View view) {

        String to = "rahulkr102014@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup, R.anim.godown);


    }

    public void two(View view) {

        String to = "abhinand1910@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup, R.anim.godown);


    }

    public void three(View view) {

        String to = "yashshvikumarsingh@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup, R.anim.godown);


    }

    public void four(View view) {

        String to = "yeshwantsingh2000@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup, R.anim.godown);


    }

    public void five(View view) {

        String to = "kumarijuhi0204@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup, R.anim.godown);


    }

    public void six(View view) {

        String to = "shashikantrupin123@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup, R.anim.godown);


    }

    public void seven(View view) {

        String to = "nikitamishra0718@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup, R.anim.godown);


    }

    public void eight(View view) {

        String to = "Shrutikumaribihat@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup, R.anim.godown);


    }

    public void nine(View view) {

        String to = "priyamprakash99@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup, R.anim.godown);


    }

    public void ten(View view) {

        String to = "sujittiwarinainijore@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup, R.anim.godown);


    }

    public void eleven(View view) {

        String to = "haidarindian9956@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup, R.anim.godown);


    }

    public void twelve(View view) {

        String to = "abhishekgupta0003.in@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup, R.anim.godown);


    }

    public void thirteen(View view) {

        String to = "tejpratap053@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup, R.anim.godown);


    }

    public void fourteen(View view) {

        String to = "ravirvarma1842000@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup, R.anim.godown);


    }

    public void fifteen(View view) {

        String to = "vishaykaushik10@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup, R.anim.godown);


    }

    public void sixteen(View view) {

        String to = "ayushvats2017@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup, R.anim.godown);


    }

    public void seveenteen(View view) {

        String to = "sumitshekhar0099@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup, R.anim.godown);


    }

    public void eighteen(View view) {

        String to = "pritam120910@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup, R.anim.godown);


    }

    public void nineteen(View view) {

        String to = "rajputrushali02@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup, R.anim.godown);


    }

    public void twenty(View view) {

        String to = "rinkirani170999@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup, R.anim.godown);


    }

    public void twentyone(View view) {

        String to = "roysandhya062@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL, new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup, R.anim.godown);


    }


}