package com.dicoding.picodipoma.myprojectssaya;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvFlim;

    private ArrayList<Flim> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvFlim = findViewById(R.id.rv_flim);
        rvFlim.setHasFixedSize(true);

        list.addAll(FlimData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList() {
       rvFlim.setLayoutManager(new LinearLayoutManager(this));
        ListFlimAdapter listFlimAdapter = new ListFlimAdapter(list);
        rvFlim.setAdapter(listFlimAdapter);
    }

}




