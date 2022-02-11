package com.example.shiba_inu_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.shiba_inu_app.Fragment.AccountFragment;
import com.example.shiba_inu_app.Fragment.HomePageFragment;
import com.example.shiba_inu_app.Fragment.NotifyFragment;
import com.example.shiba_inu_app.Fragment.TaskListFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Botton nav
        BottomNavigationView bottomNav=findViewById(R.id.bottom_navigation);
        bottomNav.setOnNavigationItemSelectedListener(navListener);

        // Setting Home Fragment as main Fragment
        getSupportFragmentManager().beginTransaction()
        .replace(R.id.fragmant_container,new HomePageFragment()).commit();

        /*
        //添加Fragment到Activity中
        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        // Add operations here
        //FrameLayout id = fragmant_container
        HomeFragment homefragment = new HomeFragment();
        //fragmentTransaction.replace(R.id.fragmant_container,,"HOME");

        fragmentTransaction.commit();
*/

    }

    //Listener Nav Bar
    BottomNavigationView.OnNavigationItemSelectedListener navListener=
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    Fragment selectedFragment=null;
                    Activity selectedActivity=null;

                switch (item.getItemId()){
                    case R.id.nav_home_page:
                        selectedFragment=new HomePageFragment(); //首頁
                         break;
                    case R.id.nav_Task_List:
                        selectedFragment=new TaskListFragment(); //任務列表
                        break;
                    case R.id.nav_notify:
                        selectedFragment=new NotifyFragment(); //通知
                        break;
                    case R.id.nav_account:
                        selectedFragment=new AccountFragment(); //我的帳戶
                        break;
                  }
                  //Begin Transaction
                getSupportFragmentManager().beginTransaction().replace(R.id.fragmant_container,selectedFragment).commit();
                return true;
                }
            };




}