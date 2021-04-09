package com.example.jastipin.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.jastipin.fragment.JualDetailBarangFragment;
import com.example.jastipin.fragment.JualDetailHargaFragment;
import com.example.jastipin.fragment.JualDetailNegaraFragment;

public class JualPagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    public JualPagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new JualDetailBarangFragment();
            case 1:
                return new JualDetailNegaraFragment();
            case 2:
                return new JualDetailHargaFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
