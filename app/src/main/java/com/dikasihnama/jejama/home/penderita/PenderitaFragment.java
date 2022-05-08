package com.dikasihnama.jejama.home.penderita;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.dikasihnama.jejama.R;
import com.dikasihnama.jejama.home.ModelAdapter;
import com.dikasihnama.jejama.home.ModelItem;

import java.util.ArrayList;
import java.util.List;

public class PenderitaFragment extends Fragment {

    List<ModelItem> modelItems;

    public PenderitaFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_penderita, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.rv_penderita);

        modelItems = new ArrayList<>();
        modelItems.add(new ModelItem("Makan-makanan bergizi",R.drawable.ic_vegetable,"Mengonsumsi makanan sumber karbohidrat, protein, lemak, vitamin, dan mineral dalam jumlah yang cukup.","Buat Pengingat"));
        modelItems.add(new ModelItem("Olahraga",R.drawable.ic_dumbbell,"Pasien thalasemia juga tetap boleh melakukan olahraga rutin setiap minggu. Yang perlu diingat, jangan lakukan olahraga dengan kontak yang terlalu keras, seperti karate, sepak bola dan lain-lain. Alternatifnya dapat memilih olahraga yang aman yaitu berenang atau bersepeda. Meski sedang sakit, penderita thalasemia juga wajib memiliki pikiran positif.","Buat Pengingat"));
        modelItems.add(new ModelItem("Keperluan transfusi darah",R.drawable.ic_transfuse,"*Thalasemia mayor umumnya diketahui sejak bayi, dengan gejala antara lain: tampak pucat, lemah, lesu, sering sakit, kadang disertai perut yang membuncit. Pasien ini membutuhkan transfusi darah terus menerus seumur hidupnya, setiap 2-4 minggu sekali.\n*Thalasemia intermedia biasanya baru terdiagnosis pada anak yg lebih besar, dan biasanya tidak membutuhkan transfusi darah rutin.\n*Thalasemia minor/trait/pembawa sifat biasanya tidak bergejala, tampak normal, namun pada pemeriksaan darah dapat ditemukan kadar Hb yang sedikit dibawah normal.","Buat Pengingat"));
        modelItems.add(new ModelItem("Transplantasi sum-sum tulang belakang",R.drawable.ic_marrow,"Thalasemia berisiko menimbulkan berbagai komplikasi serius pada pengidapnya. Transplantasi sumsum tulang sering dijadikan opsi terakhir apabila thalasemia semakin memburuk seperti mengalami anemia akut, mengidap masalah jantung, terlambat pubertas dan mengalami pertumbuhan tulang yang abnormal.","Buat Pengingat"));

        ModelAdapter adapter = new ModelAdapter(modelItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}