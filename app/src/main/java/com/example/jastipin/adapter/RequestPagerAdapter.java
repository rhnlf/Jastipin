package com.example.jastipin.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.jastipin.fragment.JualDetailBarangFragment;
import com.example.jastipin.fragment.JualDetailHargaFragment;
import com.example.jastipin.fragment.JualDetailNegaraFragment;
import com.example.jastipin.fragment.RequestDetailBarangFragment;
import com.example.jastipin.fragment.RequestDetailNegaraFragment;

public class RequestPagerAdapter extends FragmentPagerAdapter {

    private int numOfTabs;

    public RequestPagerAdapter(FragmentManager fm, int numOfTabs) {
        super(fm);
        this.numOfTabs = numOfTabs;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new RequestDetailBarangFragment();
            case 1:
                return new RequestDetailNegaraFragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return numOfTabs;
    }
}
