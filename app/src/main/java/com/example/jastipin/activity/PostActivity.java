package com.example.jastipin.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.FragmentManager;

import com.example.jastipin.R;
import com.example.jastipin.fragment.PostFragment;

public class PostActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        findView();
        initView();
        initListener();

        PostFragment fragment = new PostFragment();
        FragmentManager fm = getSupportFragmentManager();
        fm.beginTransaction().add(R.id.postFragment, fragment).commit();
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
