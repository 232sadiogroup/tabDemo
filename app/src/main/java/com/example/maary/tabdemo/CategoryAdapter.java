package com.example.maary.tabdemo;

import android.support.v4.app.FragmentManager;
import android.support.v4.view.PagerAdapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class CategoryAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public CategoryAdapter(Context context,FragmentManager fm){
        super(fm);
        mContext = context;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Fragment_One();
            case 1:
                return new Fragment_two();
            case 2:
                return new Fragment_three();
            default:
                return null;
        }
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return mContext.getString(R.string.one);
            case 1:
                return mContext.getString(R.string.two);
            case 2:
                return mContext.getString(R.string.three);
            default: return null;
        }
    }
}
