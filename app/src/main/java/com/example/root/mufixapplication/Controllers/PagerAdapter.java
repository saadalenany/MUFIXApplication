package com.example.root.mufixapplication.Controllers;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.root.mufixapplication.Fragments.ApplicationsFragment;
import com.example.root.mufixapplication.Fragments.ChatFragment;
import com.example.root.mufixapplication.Fragments.HomeFragment;
import com.example.root.mufixapplication.Fragments.JobsFragment;
import com.example.root.mufixapplication.Fragments.ProfileFragment;

/**
 * Created by Saad Alenany on 3/11/2018.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                HomeFragment tab1 = new HomeFragment();
                return tab1;
            case 1:
                ApplicationsFragment tab2 = new ApplicationsFragment();
                return tab2;
            case 2:
                ChatFragment tab3 = new ChatFragment();
                return tab3;
            case 3:
                JobsFragment tab4 = new JobsFragment();
                return tab4;
            case 4:
                ProfileFragment tab5 = new ProfileFragment();
                return tab5;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
