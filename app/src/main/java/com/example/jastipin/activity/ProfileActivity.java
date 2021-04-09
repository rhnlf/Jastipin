package com.example.jastipin.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

import com.example.jastipin.R;
import com.example.jastipin.fragment.PostFragment;
import com.example.jastipin.fragment.ProfileFragment;

public class ProfileActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        findView();
        initView();
        initListener();

        ProfileFragment fragment = new ProfileFragment();
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.profileFragment, fragment).commit();
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