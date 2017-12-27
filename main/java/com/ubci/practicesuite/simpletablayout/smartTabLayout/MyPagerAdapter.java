package com.ubci.practicesuite.simpletablayout.smartTabLayout;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;
import java.util.Vector;

/**
 * Created by dooth-user on 12/27/2017.
 */

class MyPagerAdapter extends FragmentPagerAdapter {
    public List<String> fragmentsA;
    public List<String> title;
    Context context;
    public MyPagerAdapter(Context mContext, FragmentManager fm, List<String> fragments, List<String> titles) {
        super(fm);
        fragmentsA = fragments;
        context=mContext;
        title=titles;
    }

    @Override
    public Fragment getItem(int position) {
        //return MyFragment.newInstance();
        return Fragment.instantiate(context, fragmentsA.get(position));

    }

    @Override
    public CharSequence getPageTitle(int position) {
        //return CONTENT[position % CONTENT.length].toUpperCase();
        //return mEntries.get(position % CONTENT.length).toUpperCase();
        //return title.get(position);
        return "fdfds";
    }

    @Override
    public int getCount() {
        return fragmentsA.size();
    }

    @Override
    public int getItemPosition(Object object) {
        return POSITION_NONE;
    }
}