package com.ps08516.lab3_ps08516_mob1032;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
TextView lblKq;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
lblKq = findViewById(R.id.lblKq);
        Intent intent = getIntent();
        int a = Integer.parseInt(intent.getExtras().getString("hsa"));
        int b = Integer.parseInt(intent.getExtras().getString("hsb"));
        int c = Integer.parseInt(intent.getExtras().getString("hsc"));

        float delta = b*b-4*a*c;
        if(delta<0){
lblKq.setText("Phuong trinh vo nghiem");
        }
        else if(delta == 0){
            lblKq.setText("Phuong trinh co nghiem kep x= "+(-b)/(2*a));
        }
        else {
            float x1 = (float) ((-b+Math.sqrt(delta))/(2*a));
            float x2 = (float) ((-b-Math.sqrt(delta))/(2*a));
            lblKq.setText("PT co 2 nghiem x1= "+x1+"; x2="+x2);
        }
    }
}
