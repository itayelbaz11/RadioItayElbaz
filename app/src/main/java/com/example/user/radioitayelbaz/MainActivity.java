package com.example.user.radioitayelbaz;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rb1,rb2,rb3;
    Button btn1,btn2;
    LinearLayout l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rb1=(RadioButton) findViewById(R.id.rb1);
        rb2=(RadioButton) findViewById(R.id.rb2);
        rb3=(RadioButton) findViewById(R.id.rb3);
        rg=(RadioGroup) findViewById(R.id.rg);
        btn1=(Button) findViewById(R.id.btn1);
        btn2=(Button) findViewById(R.id.btn2);
        l=(LinearLayout) findViewById(R.id.l);
    }

    public void btn1(View view) {
        if(rb1.isChecked()) l.setBackgroundColor(Color.BLUE);
        if(rb2.isChecked()) l.setBackgroundColor(Color.RED);
        if(rb3.isChecked()) l.setBackgroundColor(Color.GREEN);
    }

    public void btn2(View view) {
        l.setBackgroundColor(Color.WHITE);
    }
}
