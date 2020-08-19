package com.mitm.junoon.Home.society.SocietyList;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import androidx.annotation.Keep;
import androidx.appcompat.app.AppCompatActivity;
import com.mitm.junoon.R;
import com.mitm.junoon.Home.society.SocietyDetail.Act;
import com.mitm.junoon.Home.society.SocietyDetail.Fine;
import com.mitm.junoon.Home.society.SocietyDetail.Lit;
import com.mitm.junoon.Home.society.SocietyDetail.Mad;

@SuppressWarnings("WeakerAccess")
//@Keep
public class LoginActivity extends AppCompatActivity {

    Button button1,button2,button3,button4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.society);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Lit.class);
                startActivity(intent);
                overridePendingTransition(R.anim.dekh1, R.anim.dekh2);
            }

        });


        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Act.class);
                startActivity(intent);
                overridePendingTransition(R.anim.dekh1, R.anim.dekh2);
            }

        });


        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Mad.class);
                startActivity(intent);
                overridePendingTransition(R.anim.dekh1, R.anim.dekh2);
            }

        });
        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getBaseContext(), Fine.class);
                startActivity(intent);
                overridePendingTransition(R.anim.dekh1, R.anim.dekh2);
            }

        });

    }
}
