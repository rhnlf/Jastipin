package com.example.jastipin.activity;

import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.jastipin.R;
import com.google.android.material.tabs.TabLayout;

public class RequestBarangActivity extends BaseActivity {

    private TabLayout tabLayout;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_barang);
        findView();
        initView();
        initListener();
    }

    @Override
    public void findView() {

    }

    @Override
    public void initView() {

    }

    @Override
    public void initListener() {

    }
}