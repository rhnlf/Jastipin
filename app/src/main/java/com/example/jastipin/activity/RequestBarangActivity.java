package com.example.jastipin.activity;

import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.jastipin.R;
import com.example.jastipin.adapter.JualPagerAdapter;
import com.example.jastipin.adapter.RequestPagerAdapter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class RequestBarangActivity extends BaseActivity {

    private TabLayout tabLayout;
    private TabItem tabBarangRequest;
    private TabItem tabNegaraRequest;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_barang);
        findView();
        initView();
        initListener();

        RequestPagerAdapter pagerAdapter = new RequestPagerAdapter(getSupportFragmentManager(),
                tabLayout.getTabCount());
        viewPager.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }

    @Override
    public void findView() {
        tabLayout = findViewById(R.id.tabBarRequest);
        tabBarangRequest = findViewById(R.id.tabBarangRequest);
        tabNegaraRequest = findViewById(R.id.tabNegaraRequest);
        viewPager = findViewById(R.id.viewPagerRequest);
    }

    @Override
    public void initView() {

    }

    @Override
    public void initListener() {

    }
}