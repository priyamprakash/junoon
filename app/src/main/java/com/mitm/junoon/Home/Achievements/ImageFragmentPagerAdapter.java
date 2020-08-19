package com.mitm.junoon.Home.Achievements;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import static com.mitm.junoon.Home.Achievements.Achievements.NUM_ITEMS;

public  class ImageFragmentPagerAdapter extends FragmentPagerAdapter {
    public ImageFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public int getCount() {
        return NUM_ITEMS;
    }

    @Override
    public Fragment getItem(int position) {
        SwipeFragment fragment = new SwipeFragment();
        return SwipeFragment.newInstance(position);
    }
}


