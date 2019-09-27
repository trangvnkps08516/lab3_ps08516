package com.ps08516.lab3_ps08516_mob1032;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUserName, edtPassWord;
    TextView tvUserName, tvPassWord;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUserName = findViewById(R.id.edtUserName);
        edtPassWord = findViewById(R.id.edtPassWord);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String edtUser = edtUserName.getText().toString();
                String edtPass = edtPassWord.getText().toString();
                if (edtUser.equalsIgnoreCase("admin") && edtPass.equalsIgnoreCase("admin")) {
                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Rat tiec ban nhap khong dung ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
