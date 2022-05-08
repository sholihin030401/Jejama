package com.dikasihnama.jejama;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.dikasihnama.jejama.artikel.ArtikelFragment;
import com.dikasihnama.jejama.forum.ForumFragment;
import com.dikasihnama.jejama.home.HomeFragment;
import com.dikasihnama.jejama.konsultasi.KonsulFragment;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class MainActivity extends AppCompatActivity {

    ChipNavigationBar chipNavigationBar;
    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chipNavigationBar = findViewById(R.id.chipbar);

        if (savedInstanceState == null){
            chipNavigationBar.setItemSelected(R.id.home, true);
            fragmentManager = getSupportFragmentManager();
            HomeFragment homeFragment = new HomeFragment();
            fragmentManager.beginTransaction().replace(R.id.menu_container,homeFragment).commit();
        }

        chipNavigationBar.setOnItemSelectedListener(id -> {
            Fragment fragment = null;

            switch (id){
                case R.id.home:
                    fragment = new HomeFragment();
                    break;
                case R.id.konsul:
                    fragment = new KonsulFragment();
                    break;
                case R.id.forum:
                    fragment = new ForumFragment();
                    break;
                case R.id.artikel:
                    fragment = new ArtikelFragment();
                    break;
            }

            if (fragment != null){
                fragmentManager = getSupportFragmentManager();
                fragmentManager.beginTransaction().replace(R.id.menu_container, fragment).commit();
            }
        });
    }
}