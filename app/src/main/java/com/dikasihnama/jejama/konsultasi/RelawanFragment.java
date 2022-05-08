package com.dikasihnama.jejama.konsultasi;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dikasihnama.jejama.R;

public class RelawanFragment extends Fragment {


    public RelawanFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_relawan, container, false);

        TextView txdetail = view.findViewById(R.id.detail);
        txdetail.setOnClickListener(v -> {
            startActivity(new Intent(getActivity(), DetailRelawanActivity.class));
        });
        return view;
    }
}