package com.example.jastipin.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jastipin.R;

public class PostJadwalFragment extends BaseFragment {

    public static PostJadwalFragment newInstance(String param1, String param2) {
        PostJadwalFragment fragment = new PostJadwalFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_post_jadwal, container, false);
        findView(view);
        initView(view);
        initListener(view);
        return view;
    }

    @Override
    public void findView(View view) {

    }

    @Override
    public void initView(View view) {

    }

    @Override
    public void initListener(View view) {

    }
}