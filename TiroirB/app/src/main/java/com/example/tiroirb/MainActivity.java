package com.example.tiroirb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.tiroirb.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        NavigationView nv = binding.navigationView;
        nv.setNavigationItemSelectedListener(item -> {
            if (item.getItemId() == R.id.accueil) {
                this.finish();
            } else if (item.getItemId() == R.id.profil) {
                Toast.makeText(this, "Mbacké Mboup", Toast.LENGTH_SHORT).show();
            } else if (item.getItemId() == R.id.deconnexion) {
                Log.println(Log.INFO, "DECO", "Deconnexion");
            }
            return true;
        });
    }
}