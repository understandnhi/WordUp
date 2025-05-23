package com.example.wordupapp;

import android.content.Intent;
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

        // Kiểm tra nếu là tablet thì chuyển sang TwoPaneActivity
        if (getResources().getConfiguration().smallestScreenWidthDp >= 600) {
            Intent intent = new Intent(this, TwoPaneActivity.class);
            startActivity(intent);
            finish();
            return;
        }

        // Nếu không phải tablet thì tiếp tục như cũ
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.recyclerView);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this, 1);
        recyclerView.setLayoutManager(gridLayoutManager);
        dataList = new ArrayList<>();

        androidData = new DataClass(R.drawable.img_numbers, "Numbers", 8, 2);
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

        // Debug height
        recyclerView.post(() -> Log.d("DEBUG", "RecyclerView height: " + recyclerView.getHeight()));
    }
}
