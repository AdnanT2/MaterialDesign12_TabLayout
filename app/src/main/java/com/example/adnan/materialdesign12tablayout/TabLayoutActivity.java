package com.example.adnan.materialdesign12tablayout;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

public class TabLayoutActivity extends AppCompatActivity {

    Toolbar toolbar;
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab_layout);

        toolbar = (Toolbar)findViewById(R.id.toolbar_id);
        setSupportActionBar(toolbar);

        viewPager = (ViewPager)findViewById(R.id.view_pager_id);
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        //You can add as much layout as you want.
        // but you have to define tabMode="fixed" to tabMode="scrollable" in xml.
        // You have add that much layout as well as fragment java file.

        adapter.addFragment(new OneFragment(), "Item One");
        adapter.addFragment(new TwoFragment(), "Item two");
        adapter.addFragment(new ThreeFragment(), "Item three");
        viewPager.setAdapter(adapter);

        tabLayout = (TabLayout)findViewById(R.id.tab_layout_id);
        tabLayout.setupWithViewPager(viewPager);
    }
}
