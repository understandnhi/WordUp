package com.example.wordupapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class DetailFragment extends Fragment {

    public DetailFragment() {
        // Constructor rỗng
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Dùng layout fragment_detail.xml
        return inflater.inflate(R.layout.fragment_detail, container, false);
    }
}
