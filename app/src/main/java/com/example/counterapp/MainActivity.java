package com.example.counterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnplus,btnminus;
    TextView textView,resetView;
    int counternum;
public void darkMOde(View view){
    AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnplus=findViewById(R.id.btnplus);
        btnminus=findViewById(R.id.btnminus);
        textView=findViewById(R.id.textView);
        resetView=findViewById(R.id.resetView);
        btnminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(counternum==0){
                    counternum=0;
                }else {
                    counternum = counternum - 1;
                    textView.setText(counternum + "");
                }
            }
        });
        btnplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counternum=counternum+1;
                textView.setText(counternum+"");

            }
        });
        resetView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counternum=0;
                textView.setText(counternum+"");
                Toast.makeText(MainActivity.this, "Count is reseted", Toast.LENGTH_SHORT).show();





            }
        });
    }
}