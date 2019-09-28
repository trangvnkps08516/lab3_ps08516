package com.ps08516.lab3_ps08516_mob1032;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class lab3_ps08516_giaipt extends AppCompatActivity {
Button btnGiai;
EditText txtA,txtB,txtC;
Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lab3_ps08516_giaipt);

        btnGiai = findViewById(R.id.btnGiai);
        txtA = (EditText) findViewById(R.id.edA);
        txtB = (EditText) findViewById(R.id.edB);
        txtC =  findViewById(R.id.edC);
    }
    public void giai(View view){
intent = new Intent(lab3_ps08516_giaipt.this,Main3Activity.class);
  intent.putExtra("hsa",txtA.getText().toString());
  intent.putExtra("hsb",txtB.getText().toString());
  intent.putExtra("hsc",txtC.getText().toString());
startActivity(intent);

    }
}
