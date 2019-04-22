package com.example.esportinformation;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.FirebaseApp;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements BottomNavigationView.OnNavigationItemSelectedListener {

    public static final String DETAIL_MESSAGE = "More Detail";
    public static final String SEARCH_MESSAGE = "Do Search";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Get the bottom navigation ready to go
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(this);
        FirebaseApp.initializeApp(this);
        Fragment fragment = null;
        fragment = new MainFragment();
        loadFragment(fragment);
    }

    // Use fragment to avoid implement multiple views, will return true if fragment is not null
    private boolean loadFragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // When item in bottom navigation being clicked, switch between different views
        Fragment fragment = null;
        switch(item.getItemId()){
            case R.id.navigation_home:
                fragment = new MainFragment();
                break;

            case R.id.navigation_schedule:
                fragment = new ScheduleFragment();
                break;

            case R.id.navigation_search:
                fragment = new SearchFragment();
                break;

            case R.id.navigation_settings:
                fragment = new SettingFragment();
                break;
        }
        return loadFragment(fragment);
    }

}