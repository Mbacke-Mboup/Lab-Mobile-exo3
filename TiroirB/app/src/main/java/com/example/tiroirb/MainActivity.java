package com.example.tiroirb;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.Toast;

import com.example.tiroirb.databinding.ActivityMainBinding;
import com.google.android.material.navigation.NavigationView;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    ActionBarDrawerToggle abToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        NavigationView nv = binding.navigationView;
        DrawerLayout dl = binding.drawerLayout;
        Objects.requireNonNull(getSupportActionBar()).setDisplayHomeAsUpEnabled(true);
        abToggle = new ActionBarDrawerToggle(this, dl,R.string.draw_open, R.string.draw_close);
        dl.addDrawerListener(abToggle);
        abToggle.syncState();
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

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if(abToggle.onOptionsItemSelected(item)) return true;
        return super.onOptionsItemSelected(item);
    }
}