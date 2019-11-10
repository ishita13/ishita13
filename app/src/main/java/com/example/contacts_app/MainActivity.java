package com.example.contacts_app;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.viewpager.widget.ViewPager;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity  {
    TextView contacts,logs,favourites;
    private ViewPager viewPager;
    private PagerViewAdapter pagerAdapter;
    private TabLayout tabLayout;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout=(TabLayout)findViewById(R.id.tablayout_id) ;
        contacts=(TextView)findViewById(R.id.contacts);
        logs=(TextView)findViewById(R.id.calls);
        favourites=(TextView)findViewById(R.id.favourites);
        viewPager=(ViewPager)findViewById(R.id.viewpagerid);
        pagerAdapter=new PagerViewAdapter(getSupportFragmentManager());

        pagerAdapter.AddFragment(new Fragment_Contacts(),"Contacts");
        pagerAdapter.AddFragment(new Fragment_favourites(),"Add Contact");
        pagerAdapter.AddFragment(new Fragment_logs(),"Call Logs");
        viewPager.setAdapter(pagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setText("Contact");
        tabLayout.getTabAt(1).setText("Add Contact");
        tabLayout.getTabAt(2).setText("Logs");
    }

    private void setPermissions(){
        if(ActivityCompat.checkSelfPermission(this, Manifest.permission.READ_CALL_LOG)!= PackageManager.PERMISSION_GRANTED)
        {
            ActivityCompat.requestPermissions(this,new String[]

                    {Manifest.permission.READ_CONTACTS},1);
            ActivityCompat.requestPermissions(this,new String[]

                    {Manifest.permission.READ_CALL_LOG},1);


        }
    }
}
