package com.example.student.custom_adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.student.custom_adapter.R.*;
import static com.example.student.custom_adapter.R.layout.sinh_vien;

public class MainActivity extends AppCompatActivity {
    private Button btnLit,btnDt;
    ListView lssv;
    ArrayList<Sinhvien> mangsv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
        btnLit = (Button) findViewById(id.btnlit);
        btnDt = (Button) findViewById(id.btndt);
        lssv = (ListView) findViewById(id.lstsv);
        mangsv = new ArrayList<Sinhvien>();
        mangsv.add(new Sinhvien(" Ronaldo  ", "1987"));
        mangsv.add(new Sinhvien(" Messi  ", "1985"));
        mangsv.add(new Sinhvien(" Neymar  ", "1987"));

       // ListView adapter = new ListView(MainActivity.this,layout.sinh_vien, mangsv);
  //  lssv.setAdapter((ListAdapter) adapter);

    }

    public void btnl(View view) {
        Intent intent = new Intent(MainActivity.this, Listview.class);
        startActivity(intent);
    }
}
