package com.example.contacts_app;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PagerViewAdapter extends FragmentPagerAdapter {

    private final List<Fragment> first=new ArrayList<>();
    private final List<String> Titles=new ArrayList<>();

    public PagerViewAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)

    {return first.get(position);
//        Fragment fragment=null;
//        switch (position)
//        {
//            case 0:
//                fragment=new Fragment_Contacts();
//                break;
//            case 1:
//                fragment=new Fragment_favourites();
//                break;
//            case 2:
//                fragment=new Fragment_logs();
//                break;
//        }
//        return fragment;
    }

    @Override
    public int getCount() {
        return Titles.size();

    }

    public CharSequence getPage(int position)
    {
        return Titles.get(position);
    }
    public void AddFragment(Fragment fg,String tt)
    {
        first.add(fg);
        Titles.add(tt);
    }




}
