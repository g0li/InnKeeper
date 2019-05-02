package com.lilliemountain.innkeeper;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.internal.BottomNavigationItemView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

public class MasterActivity extends AppCompatActivity  implements CityFragment.OnFragmentInteractionListener {
    BottomNavigationView bottomNavigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_master);
        loadFragment(new CityFragment());
        bottomNavigationView=findViewById(R.id.navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.navigation_map:
                                loadFragment(new CityFragment());
                            break;
                            case R.id.navigation_search:
                            break;
                            case R.id.navigation_favourite:
                            break;
                            case R.id.navigation_profile:
                            break;
                            case R.id.navigation_dashboard:
                            break;
                        }
                        return true;
                    }
                });    }
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
    public void onFragmentInteraction(Uri uri) {
        Log.e("onFragmentInteraction: ", uri.getPath() );
    }
}
