package com.example.wordupapp;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<DataClass> dataList;
    MyAdapter adapter;
    DataClass androidData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,1);
        recyclerView.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();

        androidData = new DataClass(R.drawable.numbers, "Numbers", 8, 2);
        dataList.add(androidData);

        androidData = new DataClass(R.drawable.img_animals, "Animals", 10, 0);
        dataList.add(androidData);

        androidData = new DataClass(R.drawable.img_fruits, "Fruits", 10, 0);
        dataList.add(androidData);

        androidData = new DataClass(R.drawable.img_clothes, "Clothes", 10, 0);
        dataList.add(androidData);

        adapter = new MyAdapter(dataList, MainActivity.this);
        recyclerView.setAdapter(adapter);

        Log.d("DEBUG", "Total decks: " + dataList.size());
        for (DataClass d : dataList) {
            Log.d("DEBUG", d.getDeckName());
        }

        //Kiểm tra kích thước
        recyclerView.post(new Runnable() {
            @Override
            public void run() {
                Log.d("DEBUG", "RecyclerView height: " + recyclerView.getHeight());
            }
        });

    }
}