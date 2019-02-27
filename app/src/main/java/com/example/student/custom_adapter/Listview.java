package com.example.student.custom_adapter;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class Listview extends BaseAdapter {
    TextView txtht,txtns;
    Context myContext;
    int myLayout;
    List<Sinhvien> arraySinhVien;
    public  Listview(Context context, int layout, List<Sinhvien> sinhvienList) {
    myContext = context;
    myLayout = layout;
    arraySinhVien = sinhvienList;
    }
    @Override
    public int getCount() {
        return arraySinhVien.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View convertview, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    convertview = inflater.inflate(myLayout, null);
        TextView txtht = (TextView) convertview.findViewById(R.id.a);
        txtht.setText(arraySinhVien.get(i).HoTen);
        TextView txtns = (TextView) convertview.findViewById(R.id.b);
        txtht.setText(arraySinhVien.get(i).NamSinh);
        return null;
    }
}
