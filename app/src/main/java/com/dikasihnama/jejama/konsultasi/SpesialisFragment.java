package com.dikasihnama.jejama.konsultasi;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dikasihnama.jejama.R;

public class SpesialisFragment extends Fragment {

    public SpesialisFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_spesialis, container, false);

        view.findViewById(R.id.chatspesialis).setOnClickListener(
                v -> startActivity(new Intent(getActivity(), ChatActivity.class)));

        return view;
    }
}