package com.example.e_bus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.material.navigation.NavigationView;

public class Search_bus extends AppCompatActivity   {
    DrawerLayout layDL;
    NavigationView vNV;
    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_bus);



        layDL = findViewById(R.id.layDL);
        vNV = findViewById(R.id.vNV);
        toolbar = findViewById(R.id.toolbar);

        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, layDL, toolbar, R.string.nav_open, R.string.nav_close);

        layDL.addDrawerListener(toggle);
        toggle.syncState();

        if (savedInstanceState == null) {
            vNV.setCheckedItem(R.id.nav_home);
        }
        NavClick();
    }
    private void NavClick() {
        vNV.setNavigationItemSelectedListener(item -> {
            Fragment frag = null;
            int itemId = item.getItemId();

            if (itemId == R.id.nav_home) {
                Intent intent =new Intent(this, Home.class);
                startActivity(intent);
            } else if (itemId == R.id.setting) {
                Intent intent =new Intent(this, Setting.class);
                startActivity(intent);
            }else if (itemId == R.id.search) {
                Intent intent =new Intent(this, Search_bus.class);
                startActivity(intent);
            }

            layDL.closeDrawer(GravityCompat.START);
            return true;
        });
    }

    @Override
    public void onBackPressed() {
        Fragment currFrag = getSupportFragmentManager().findFragmentById(R.id.layFL);
        if (layDL.isDrawerOpen(GravityCompat.START)){
            layDL.closeDrawer(GravityCompat.START);
        }
        else {
            super.onBackPressed();
        }
    }


}