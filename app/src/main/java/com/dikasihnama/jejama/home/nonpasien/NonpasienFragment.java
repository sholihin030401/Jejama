package com.dikasihnama.jejama.home.nonpasien;

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

public class NonpasienFragment extends Fragment {

    List<ModelItem> modelItems;

    public NonpasienFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_nonpasien, container, false);

        RecyclerView recyclerView = view.findViewById(R.id.rv_nonpasien);

        modelItems = new ArrayList<>();
        modelItems.add(new ModelItem("Cek kadar hemoglobin (Hb)",R.drawable.ic_hemoglobin,"Tes hemoglobin dilakukan untuk mengukur jenis hemoglobin atau sel darah merah dalam tubuh. Orang dengan kondisi thalasemia biasanya ditandai dengan gejala anemia. Kondisi ini bisa disebabkan oleh beberapa hal, misalnya kehilangan darah, gangguan fungsi ginjal dan sumsum tulang, paparan radiasi, atau kekurangan nutrisi.","Cek Rumah Sakit Terdekat"));
        modelItems.add(new ModelItem("Pemeriksaan genetik keluarga",R.drawable.ic_dna,"Setiap pasangan disarankan untuk melakukan pemeriksaan setidaknya tiga bulan sebelum tanggal pernikahan. Perlu diketahui jika salah satu orang tua pembawa gen thlasemia minor maka akan beresiko mempunyai anak 50 % thalasemia minor dan tidak memiliki anak thalasemia mayor. sedangkan jika kedua orang tua membawa gen thalasemia minor (pembawa sifat) maka kemungkinan 50 % anaknya thalasemia minor, 25 % sehat dan sisanya 25 % thalasemia mayor.","Cek Rumah Sakit Terdekat"));
        modelItems.add(new ModelItem("Tes prenatal",R.drawable.ic_prenatal,"Pemeriksaan bagi ibu hamil yang didiagnosa mengidap thalasemia dapat dilakukan sebelum bayi lahir. Solusi untuk pencegahan dapat dilakukan melalui proses bayi tabung","Cek Rumah Sakit Terdekat"));

        ModelAdapter adapter = new ModelAdapter(modelItems);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));
        recyclerView.setAdapter(adapter);

        return view;
    }
}