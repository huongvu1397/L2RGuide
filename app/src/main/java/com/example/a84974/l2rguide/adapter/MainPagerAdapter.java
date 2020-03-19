package com.example.a84974.l2rguide.adapter;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.a84974.l2rguide.fragment.FragmentMystic;
import com.example.a84974.l2rguide.fragment.FragmentRogue;
import com.example.a84974.l2rguide.fragment.FragmentWarrior;

public class MainPagerAdapter extends FragmentPagerAdapter {
    public MainPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new FragmentWarrior();
            case 1:
                return new FragmentRogue();
            case 2:
                return new FragmentMystic();
            default:
                return new FragmentWarrior();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Warrior";
            case 1:
                return "Rogue";
            case 2:
                return "Mystic";
            default:
                return "Warrior";
        }
    }
}
