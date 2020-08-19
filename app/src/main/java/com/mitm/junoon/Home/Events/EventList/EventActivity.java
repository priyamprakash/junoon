package com.mitm.junoon.Home.Events.EventList;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.mitm.junoon.Home.Events.EventDetail.Earlyevents;
import com.mitm.junoon.Home.Events.EventDetail.fiestaone;
import com.mitm.junoon.Home.Events.EventDetail.fiestatwo;
import com.mitm.junoon.Home.Events.EventDetail.vanmohatsav;
import com.mitm.junoon.R;

public class EventActivity  extends AppCompatActivity {
Button button1,button2,button3,button4,button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.events);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), fiestaone.class);
                startActivity(intent);
                overridePendingTransition(R.anim.dekh1, R.anim.dekh2);
            }

        });


        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), fiestatwo.class);
                startActivity(intent);
                overridePendingTransition(R.anim.dekh1, R.anim.dekh2);
            }

        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), vanmohatsav.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
            }

        });
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Earlyevents.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_from_right,R.anim.slide_to_left);
            }

        });


    }
}
