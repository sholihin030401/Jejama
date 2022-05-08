package com.dikasihnama.jejama.forum;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dikasihnama.jejama.R;

import java.util.ArrayList;
import java.util.List;

public class ForumFragment extends Fragment {

    List<ForumItem> itemList;
    RecyclerView recyclerView;
    ForumAdapter adapter;

    public ForumFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_forum, container, false);

        recyclerView = view.findViewById(R.id.rv_forum);
        itemList = new ArrayList<>();
        itemList.add(new ForumItem("Ahmad Imaduddin","1 jam yang lalu","3 komentar","12","Apakah ada yg pernha",R.drawable.thalasemia2));

        adapter = new ForumAdapter(itemList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}