package com.dikasihnama.jejama.home;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dikasihnama.jejama.R;
import com.dikasihnama.jejama.home.penderita.PenderitaFragment;
import com.dikasihnama.jejama.konsultasi.SpesialisFragment;

public class HomeFragment extends Fragment {

    FragmentManager manager;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);


        if(savedInstanceState == null){
            manager = getChildFragmentManager();
            PenderitaFragment penderitaFragment = new PenderitaFragment();
            manager.beginTransaction().replace(R.id.home_container, penderitaFragment).commit();
        }
        return view;
    }
}