package com.mitm.junoon.Home.Events.EventDetail;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.mitm.junoon.R;


public class vanmohatsav extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.events_vanmohatsav);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageView imageView200 =  findViewById(R.id.imageView200);
        Glide.with(this).load("https://i.ibb.co/1vD9F2w/finalgif.gif").placeholder(R.drawable.junooncircle).into(imageView200);



/*
        ImageView imageView1 =  findViewById(R.id.imageView1);
        Glide.with(this).load("https://scontent.fdel2-1.fna.fbcdn.net/v/t1.0-9/68514940_2383866041867586_3629551156746780672_n.jpg?_nc_cat=111&_nc_sid=110474&_nc_ohc=7l27YaeU_D8AX-E1zid&_nc_ht=scontent.fdel2-1.fna&oh=a88296d99a8dd8e7fe62e05f219145a2&oe=5EEDA191").placeholder(R.drawable.junooncircle).into(imageView1);

        ImageView imageView2 =  findViewById(R.id.imageView2);
        Glide.with(this).load("https://scontent.fdel2-1.fna.fbcdn.net/v/t1.0-9/68412266_2383866125200911_1344732648102166528_n.jpg?_nc_cat=111&_nc_sid=110474&_nc_ohc=XAolA8AjkJAAX93wR75&_nc_ht=scontent.fdel2-1.fna&oh=1250e523bba1fc7fe6fd71496ac10c1f&oe=5EEE402B").placeholder(R.drawable.junooncircle).into(imageView2);

        ImageView imageView3 =  findViewById(R.id.imageView3);
        Glide.with(this).load("https://scontent.fdel2-2.fna.fbcdn.net/v/t1.0-9/69089101_2383866238534233_3062346058966237184_n.jpg?_nc_cat=100&_nc_sid=110474&_nc_ohc=FEhEqVR1YwoAX-GGTpP&_nc_ht=scontent.fdel2-2.fna&oh=3e6e79f5d47d36c9fc7bd646e583c0f5&oe=5EEFACF0").placeholder(R.drawable.junooncircle).into(imageView3);

        ImageView imageView4 =  findViewById(R.id.imageView4);
        Glide.with(this).load("https://scontent.fdel2-1.fna.fbcdn.net/v/t1.0-9/68376369_2383866388534218_5412460414246060032_n.jpg?_nc_cat=102&_nc_sid=110474&_nc_ohc=dVPSHpCDygsAX_f7zo3&_nc_ht=scontent.fdel2-1.fna&oh=4091dc88e1b9d2f407ee46c47380b37e&oe=5EEC518C").placeholder(R.drawable.junooncircle).into(imageView4);

        ImageView imageView5 =  findViewById(R.id.imageView5);
        Glide.with(this).load("https://scontent.fdel2-2.fna.fbcdn.net/v/t1.0-9/68820608_2383866978534159_7338818736163389440_n.jpg?_nc_cat=103&_nc_sid=110474&_nc_ohc=b8EV-5NL3UkAX-8Dtay&_nc_ht=scontent.fdel2-2.fna&oh=9aaff87e09fc34f86f7ea4d147005990&oe=5EEDEAE4").placeholder(R.drawable.junooncircle).into(imageView5);

        ImageView imageView6 =  findViewById(R.id.imageView6);
        Glide.with(this).load("https://scontent.fdel2-2.fna.fbcdn.net/v/t1.0-9/68825785_2383868071867383_1284121227807424512_n.jpg?_nc_cat=103&_nc_sid=110474&_nc_ohc=AWh9yi8v4TwAX9zvRzz&_nc_ht=scontent.fdel2-2.fna&oh=72756f24e9a64f5734b1537fc286b87a&oe=5EEDB8DC").placeholder(R.drawable.junooncircle).into(imageView6);


        ImageView imageView7 =  findViewById(R.id.imageView7);
        Glide.with(this).load("https://scontent.fdel2-1.fna.fbcdn.net/v/t1.0-9/68870049_2383868191867371_8023344374622453760_n.jpg?_nc_cat=111&_nc_sid=110474&_nc_ohc=hkSlzewuQvkAX9aPWKJ&_nc_ht=scontent.fdel2-1.fna&oh=2eb55c1e0e96b2eb0b82aca0abb707e1&oe=5EEFDDF6").placeholder(R.drawable.junooncircle).into(imageView7);

        ImageView imageView8 =  findViewById(R.id.imageView8);
        Glide.with(this).load("https://scontent.fdel2-1.fna.fbcdn.net/v/t1.0-9/68489394_2383869785200545_8088785154929065984_n.jpg?_nc_cat=110&_nc_sid=110474&_nc_ohc=nd4vMCWZDRcAX-t1mAC&_nc_ht=scontent.fdel2-1.fna&oh=7178a8079fcd4dd9788df4aacffe4e69&oe=5EEE7D08").placeholder(R.drawable.junooncircle).into(imageView8);

        ImageView imageView9 =  findViewById(R.id.imageView9);
        Glide.with(this).load("https://scontent.fdel2-1.fna.fbcdn.net/v/t1.0-9/68375108_2383869951867195_3108605773026951168_n.jpg?_nc_cat=104&_nc_sid=110474&_nc_ohc=gbxc6DZuD5cAX9OODZs&_nc_ht=scontent.fdel2-1.fna&oh=d73f577c33c03f7854c6ff7afab5452a&oe=5EED6859").placeholder(R.drawable.junooncircle).into(imageView9);

        ImageView imageView10 =  findViewById(R.id.imageView10);
        Glide.with(this).load("https://scontent.fdel2-2.fna.fbcdn.net/v/t1.0-9/67926714_2383857501868440_848867167561580544_n.jpg?_nc_cat=105&_nc_sid=110474&_nc_ohc=sIPKJxlAedMAX-3VQ8T&_nc_ht=scontent.fdel2-2.fna&oh=06329375a91d903dd504f7b86ed77107&oe=5EEE5DB2").placeholder(R.drawable.junooncircle).into(imageView10);

        ImageView imageView11 =  findViewById(R.id.imageView11);
        Glide.with(this).load("https://scontent.fdel2-2.fna.fbcdn.net/v/t1.0-9/68682613_2383857728535084_3338468540058435584_n.jpg?_nc_cat=103&_nc_sid=110474&_nc_ohc=2MEhtxldPkoAX-zTsLf&_nc_ht=scontent.fdel2-2.fna&oh=b5dade76a1a0f3e3a456a7cc8ae756e8&oe=5EEC67F1").placeholder(R.drawable.junooncircle).into(imageView11);

        ImageView imageView12 =  findViewById(R.id.imageView12);
        Glide.with(this).load("https://scontent.fdel2-1.fna.fbcdn.net/v/t1.0-9/68388177_2383857281868462_396115363307192320_n.jpg?_nc_cat=107&_nc_sid=110474&_nc_ohc=IukLliBSOAwAX_I9Hbk&_nc_ht=scontent.fdel2-1.fna&oh=77e9b1a1cc1c179a9206c318db2088cb&oe=5EED1EBE").placeholder(R.drawable.junooncircle).into(imageView12);

        ImageView imageView13 =  findViewById(R.id.imageView13);
        Glide.with(this).load("https://scontent.fdel2-2.fna.fbcdn.net/v/t1.0-9/68481611_2383851398535717_8573034514165530624_n.jpg?_nc_cat=109&_nc_sid=110474&_nc_ohc=YW4O7XdDSxIAX-ywuh_&_nc_ht=scontent.fdel2-2.fna&oh=c366fc0640e849188b7eb1f579fa72cb&oe=5EEEABC7").placeholder(R.drawable.junooncircle).into(imageView13);

        ImageView imageView14 =  findViewById(R.id.imageView14);
        Glide.with(this).load("https://scontent.fdel2-1.fna.fbcdn.net/v/t1.0-9/69349521_2383851488535708_3133812480820641792_n.jpg?_nc_cat=107&_nc_sid=110474&_nc_ohc=HNOd9iBzeOUAX-BnX-z&_nc_ht=scontent.fdel2-1.fna&oh=a13291ccc3c2b22bde80adcd014fb19d&oe=5EECC9F5").placeholder(R.drawable.junooncircle).into(imageView14);
*/




    }



    public void vanpic(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/p/B1Nzc7pg0pA/" ));
        startActivity(browserIntent);
        overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
    }


}