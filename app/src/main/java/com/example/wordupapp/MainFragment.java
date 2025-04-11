package com.example.wordupapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {

    public MainFragment() {
        // Constructor rỗng
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        //  xử lý khi click bên trái
        Button addDeckButton = view.findViewById(R.id.button2);
        if (addDeckButton != null) {
            addDeckButton.setOnClickListener(v -> {
                // Gọi fragment bên phải
                if (getActivity() instanceof TwoPaneActivity) {
                    ((TwoPaneActivity) getActivity()).showRightFragment(new DetailFragment());
                }
            });
        }



    }
}
