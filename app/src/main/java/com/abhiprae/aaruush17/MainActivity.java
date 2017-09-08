package com.abhiprae.aaruush17;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.NavigationView;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.abhiprae.aaruush17.AboutUs.about_us;
import com.abhiprae.aaruush17.Championships.championship_fragment;
import com.abhiprae.aaruush17.Domains.domains_fragment;
import com.abhiprae.aaruush17.Initiative.Initiatives;
import com.abhiprae.aaruush17.Workshops.workshops_fragment;

import Model.Session;
import de.hdodenhof.circleimageview.CircleImageView;

public class MainActivity extends AppCompatActivity {

    static int backpress = 0;
    protected OnBackPressedListener onBackPressedListener;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle actionBarDrawerToggle;
    FragmentTransaction fragmentTransaction;
    NavigationView navigationView;
    CircleImageView profile;
    TextView uname;
    int permission = 0;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            overridePendingTransition(R.anim.fadein, R.anim.fadeout);
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

        FontsOverride.setDefaultFont(this, "MONOSPACE", "avenir.otf");

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.drawer_open, R.string.drawer_close);
        drawerLayout.setDrawerListener(actionBarDrawerToggle);
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.main_container, new Home_zero());
        fragmentTransaction.commit();
        getSupportActionBar().setTitle("Aaruush 17");
        navigationView = (NavigationView) findViewById(R.id.navigation_view);
        View hView = navigationView.getHeaderView(0);
        profile = (CircleImageView) hView.findViewById(R.id.logo);
        uname = (TextView) hView.findViewById(R.id.uname);
        uname.setText(Session.getUser().getName());
        //uname.setText("Abhiprae Choudhury");

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.home_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new Home_zero());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Aaruush 17");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.domains_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new domains_fragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Events");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.workshops_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new workshops_fragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Workshops");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.championship_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new championship_fragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Championships");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;


                    case R.id.game:
                        /*fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new GameLoading());
                        fragmentTransaction.commit();*/
                        Intent intent = new Intent(MainActivity.this, GameLoading.class);
                        startActivity(intent);
                        getSupportActionBar().setTitle("Stock Market");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.favourites_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new Sponsors_fragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Sponsors");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.gallery_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new Gallery_Fragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Gallery");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;


                    case R.id.highlights_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new highlights_fragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Highlights");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.sponsors_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new about_us());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("About Us");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.patrons_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new Initiatives());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Initiatives");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.patrons_id_tab:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new PatronsFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Patrons");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.team_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new TeamFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Team");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.credits_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new credits_fragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Credits");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    case R.id.contactus_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new Contactus());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Contact Us");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;

                    //case R.id.camera:
                      //  check();
                        //break;
                    case R.id.settings_id:
                        fragmentTransaction = getSupportFragmentManager().beginTransaction();
                        fragmentTransaction.replace(R.id.main_container, new SettingsFragment());
                        fragmentTransaction.commit();
                        getSupportActionBar().setTitle("Settings");
                        item.setChecked(true);
                        drawerLayout.closeDrawers();
                        break;
                    case R.id.exit:
                        Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                        homeIntent.addCategory(Intent.CATEGORY_HOME);
                        homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(homeIntent);
                        break;
                }
                return true;
            }
        });
    }

    private void check() {
        ActivityCompat.requestPermissions(MainActivity.this,
                new String[]{android.Manifest.permission.CAMERA, Manifest.permission.WRITE_EXTERNAL_STORAGE},
                1);
    }

    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        switch (requestCode) {
            case 1: {
                // If request is cancelled, the result arrays are empty.
                if (grantResults.length > 0
                        && grantResults[0] == PackageManager.PERMISSION_GRANTED && grantResults[1] == PackageManager.PERMISSION_GRANTED) {
                    permission = 1;
                    granted();
                } else {
                    Toast.makeText(MainActivity.this, "Permission denied", Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    void granted() {
        if (permission == 1)
            startActivity(new Intent(MainActivity.this, Camera.class));
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        actionBarDrawerToggle.syncState();
    }

    public void setOnBackPressedListener(OnBackPressedListener onBackPressedListener) {
        this.onBackPressedListener = onBackPressedListener;
    }

    @Override
    public void onBackPressed() {
        if (onBackPressedListener != null)
            onBackPressedListener.doBack();
        else {
            backpress = (backpress + 1);
            Toast.makeText(getApplicationContext(), " Press Back again to Exit ", Toast.LENGTH_SHORT).show();

            if (backpress > 1) {
                Intent homeIntent = new Intent(Intent.ACTION_MAIN);
                homeIntent.addCategory(Intent.CATEGORY_HOME);
                homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(homeIntent);
            }
        }
    }

    /*@Override
    public void onBackPressed() {
        backpress = (backpress + 1);
        Toast.makeText(getApplicationContext(), " Press Back again to Exit ", Toast.LENGTH_SHORT).show();

        if (backpress > 1) {
            Intent homeIntent = new Intent(Intent.ACTION_MAIN);
            homeIntent.addCategory(Intent.CATEGORY_HOME);
            homeIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(homeIntent);
        }
    }*/
}
