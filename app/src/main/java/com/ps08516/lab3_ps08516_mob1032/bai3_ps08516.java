package com.ps08516.lab3_ps08516_mob1032;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class bai3_ps08516 extends AppCompatActivity {
    ArrayList<String> arrayList = new ArrayList<>();
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bai3_ps08516);
        list = (ListView) findViewById(R.id.listview);
        arrayList.add("Android co ban");
        arrayList.add("Android nang cao");
        arrayList.add("Thiet ke giao dien tren Android");
        arrayList.add("Test va trien khi ung dung Android");
        arrayList.add("Node js");
        arrayList.add("game 2D");
        ArrayAdapter adapter = new ArrayAdapter(bai3_ps08516.this, android.R.layout.simple_list_item_1, arrayList);
        list.setAdapter(adapter);
    }


}
