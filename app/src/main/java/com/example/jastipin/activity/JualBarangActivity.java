package com.example.jastipin.activity;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.jastipin.R;
import com.example.jastipin.adapter.JualPagerAdapter;
import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;

public class JualBarangActivity extends BaseActivity {

    private TabLayout tabLayout;
    private TabItem tabBarangJual;
    private TabItem tabNegaraJual;
    private TabItem tabHargaJual;
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jual_barang);
        findView();
        initView();
        initListener();

        JualPagerAdapter pagerAdapter = new JualPagerAdapter(getSupportFragmentManager(),
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
        tabLayout = findViewById(R.id.tabBarJual);
        tabBarangJual = findViewById(R.id.tabBarangJual);
        tabNegaraJual = findViewById(R.id.tabNegaraJual);
        tabHargaJual = findViewById(R.id.tabHargaJual);
        viewPager = findViewById(R.id.viewPagerJual);
    }

    @Override
    public void initView() {

    }

    @Override
    public void initListener() {
    }
}