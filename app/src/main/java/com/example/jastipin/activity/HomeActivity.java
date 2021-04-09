package com.example.jastipin.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.jastipin.R;
import com.example.jastipin.fragment.HomeFragment;
import com.example.jastipin.fragment.PostFragment;

public class HomeActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        findView();
        initView();
        initListener();

        HomeFragment fragment = new HomeFragment();
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.homeFragment, fragment).commit();
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