package com.example.jastipin.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jastipin.R;

public class JualDetailHargaFragment extends BaseFragment {

    public static JualDetailHargaFragment newInstance() {
        JualDetailHargaFragment fragment = new JualDetailHargaFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_jual_detail_harga, container, false);
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