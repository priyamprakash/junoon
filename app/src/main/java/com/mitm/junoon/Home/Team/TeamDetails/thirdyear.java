package com.mitm.junoon.Home.Team.TeamDetails;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.mitm.junoon.R;



public class thirdyear extends AppCompatActivity {


    //Team k lye
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_thirdyear);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ImageView imageView1 =  findViewById(R.id.imageView1);
        Glide.with(this).load("https://i.ibb.co/BN77dgy/pratyush1.jpg").placeholder(R.drawable.junooncircle).into(imageView1);

        ImageView imageView2 =  findViewById(R.id.imageView2);
        Glide.with(this).load("https://i.ibb.co/dfZc3MP/gaurav3.jpg").placeholder(R.drawable.junooncircle).into(imageView2);

        ImageView imageView3 =  findViewById(R.id.imageView3);
        Glide.with(this).load("https://i.ibb.co/92xjF53/prem4.jpg").placeholder(R.drawable.junooncircle).into(imageView3);

        ImageView imageView4 =  findViewById(R.id.imageView4);
        Glide.with(this).load("https://i.ibb.co/1JPQfTz/rahuulsir1.jpg").placeholder(R.drawable.junooncircle).into(imageView4);

        ImageView imageView5 =  findViewById(R.id.imageView5);
        Glide.with(this).load("https://i.ibb.co/GP2vYTL/shivangi.png").placeholder(R.drawable.junooncircle).into(imageView5);

        ImageView imageView6 =  findViewById(R.id.imageView6);
        Glide.with(this).load("https://i.ibb.co/8rY4GCg/vandana1.jpg").placeholder(R.drawable.junooncircle).into(imageView6);


        ImageView imageView7 =  findViewById(R.id.imageView7);
        Glide.with(this).load("https://i.ibb.co/5szLg82/saubhik7.jpg").placeholder(R.drawable.junooncircle).into(imageView7);

        ImageView imageView8 =  findViewById(R.id.imageView8);
        Glide.with(this).load("https://i.ibb.co/Kz0PrLf/adityamishra1.jpg").placeholder(R.drawable.junooncircle).into(imageView8);

        ImageView imageView9 =  findViewById(R.id.imageView9);
        Glide.with(this).load("https://i.ibb.co/1Q4zZTz/aadil2.jpg").placeholder(R.drawable.junooncircle).into(imageView9);

        ImageView imageView10 =  findViewById(R.id.imageView10);
        Glide.with(this).load("https://i.ibb.co/3R4ymqd/shivam1.jpg").placeholder(R.drawable.junooncircle).into(imageView10);

        ImageView imageView11 =  findViewById(R.id.imageView11);
        Glide.with(this).load("https://i.ibb.co/jv3g9xq/tamanna.png").placeholder(R.drawable.junooncircle).into(imageView11);

        ImageView imageView12 =  findViewById(R.id.imageView12);
        Glide.with(this).load("https://i.ibb.co/sQ8WJKg/aparna2.jpg").placeholder(R.drawable.junooncircle).into(imageView12);
 ImageView imageView13 =  findViewById(R.id.imageView13);
        Glide.with(this).load("https://i.ibb.co/tZ58sTg/shashi2.jpg").placeholder(R.drawable.junooncircle).into(imageView13);






    }

    public void one(View view){

        String to = "chandrapratyush10@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL  , new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup,R.anim.godown);



    }   public void two(View view){

        String to = "gaurav.gs1199@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL  , new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup,R.anim.godown);



    }
    public void three(View view){

        String to = "premprakash61107@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL  , new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup,R.anim.godown);



    }
    public void four(View view){

        String to = "sinharahul220@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL  , new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup,R.anim.godown);



    }
    public void five(View view){

        String to = "2129shivangi@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL  , new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup,R.anim.godown);



    }
    public void six(View view){

        String to = "vandanabharti753@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL  , new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup,R.anim.godown);



    }
    public void seven(View view){

        String to = "saubhikgolu@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL  , new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup,R.anim.godown);



    }
    public void eight(View view){

        String to = "dityaraj001213@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL  , new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup,R.anim.godown);



    }
    public void nine(View view){

        String to = "";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL  , new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup,R.anim.godown);



    }
    public void ten(View view){

        String to = "aadilr090@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL  , new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup,R.anim.godown);



    }
    public void eleven(View view){

        String to = "tamannachoudhary919@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL  , new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup,R.anim.godown);



    }
    public void twelve(View view){

        String to = "aparna.1998sen05@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL  , new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup,R.anim.godown);



    }
    public void thirteen(View view){

        String to = "Shashiranjan9854@gmail.com";
        Intent email = new Intent(Intent.ACTION_SEND);
        email.putExtra(Intent.EXTRA_EMAIL  , new String[]{to});
        email.setType("message/rfc822");
        startActivity(Intent.createChooser(email, "Choose an Email client :"));
        overridePendingTransition(R.anim.goup,R.anim.godown);



    }




}