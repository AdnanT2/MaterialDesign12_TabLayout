package com.example.adnan.materialdesign12tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Adnan on 03/10/2017.
 */

public class ViewPagerAdapter extends FragmentPagerAdapter {
    //create list inside ViewPagerAdapter class to store item fragment.
    private final List<Fragment> fragmentList = new ArrayList<>();

    //createw list to store item title.
    private final List<String> fragmentTitleList = new ArrayList<>();

    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragmentList.get(position); // returns fragment list
    }

    @Override
    public int getCount() {
        return fragmentTitleList.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragmentTitleList.get(position);
    }

    public void addFragment(Fragment fragment, String title){
        fragmentList.add(fragment);
        fragmentTitleList.add(title);
    }
}
