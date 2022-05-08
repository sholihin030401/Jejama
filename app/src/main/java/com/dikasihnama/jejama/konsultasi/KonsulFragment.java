package com.dikasihnama.jejama.konsultasi;

import android.graphics.Color;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.dikasihnama.jejama.R;
import com.dikasihnama.jejama.forum.ForumFragment;

public class KonsulFragment extends Fragment {

    FragmentManager manager;

    public KonsulFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_konsul, container, false);

        TextView txSpesialis = view.findViewById(R.id.spesialis);
        TextView txRelawan = view.findViewById(R.id.relawan);

        if(savedInstanceState == null){
            manager = getChildFragmentManager();
            SpesialisFragment spesialisFragment = new SpesialisFragment();
            manager.beginTransaction().replace(R.id.konsul_container, spesialisFragment).commit();
        }

        txRelawan.setOnClickListener(v -> {
            txRelawan.setBackgroundResource(R.drawable.bg_square_tab);
            txSpesialis.setBackgroundResource(R.drawable.bg_square_primary);
            txRelawan.setTextColor(Color.parseColor("#2B648C"));
            txSpesialis.setTextColor(Color.WHITE);
            RelawanFragment relawanFragment = new RelawanFragment();
            manager = getChildFragmentManager();
            manager.beginTransaction().replace(R.id.konsul_container, relawanFragment).commit();
        });

        txSpesialis.setOnClickListener(v -> {
            txRelawan.setBackgroundResource(R.drawable.bg_square_primary);
            txSpesialis.setBackgroundResource(R.drawable.bg_square_tab);
            txRelawan.setTextColor(Color.WHITE);
            txSpesialis.setTextColor(Color.parseColor("#2B648C"));
            manager = getChildFragmentManager();
            SpesialisFragment spesialisFragment = new SpesialisFragment();
            manager.beginTransaction().replace(R.id.konsul_container, spesialisFragment).commit();
        });
        return view;
    }
}