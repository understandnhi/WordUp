package com.example.wordupapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class DetailActivity extends AppCompatActivity {

    TextView detailDeckName, detailKnow, detailNotKnow;
//    ImageView detailImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        detailDeckName = findViewById(R.id.detailDeckName);
        detailKnow = findViewById(R.id.detailKnown);
        detailNotKnow = findViewById(R.id.detailNotKnown);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null){
            detailDeckName.setText(bundle.getString("DeckName"));
            detailKnow.setText(String.valueOf(bundle.getInt("Known")));
            detailNotKnow.setText(String.valueOf(bundle.getInt("NotKnown")));
        }

    }
}
