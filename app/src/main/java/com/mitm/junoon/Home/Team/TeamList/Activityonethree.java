package com.mitm.junoon.Home.Team.TeamList;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.mitm.junoon.Home.Team.TeamDetails.Family;
import com.mitm.junoon.R;
import com.mitm.junoon.Home.Team.TeamDetails.Central;
import com.mitm.junoon.Home.Team.TeamDetails.Faculty;
import com.mitm.junoon.Home.Team.TeamDetails.secondyear;
import com.mitm.junoon.Home.Team.TeamDetails.thirdyear;


@SuppressWarnings("WeakerAccess")
public class Activityonethree  extends AppCompatActivity {
    Button button1,button2,button3,button4,button5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.team_list);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Faculty.class);
                startActivity(intent);
                overridePendingTransition(R.anim.dekh1, R.anim.dekh2);
            }

        });


        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Central.class);
                startActivity(intent);
                overridePendingTransition(R.anim.dekh1, R.anim.dekh2);
            }

        });
        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), thirdyear.class);
                startActivity(intent);
                overridePendingTransition(R.anim.dekh1, R.anim.dekh2);
            }

        });
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), secondyear.class);
                startActivity(intent);
                overridePendingTransition(R.anim.dekh1, R.anim.dekh2);
            }

        });

        button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Family.class);
                startActivity(intent);
                overridePendingTransition(R.anim.dekh1, R.anim.dekh2);
            }

        });


    }
}
