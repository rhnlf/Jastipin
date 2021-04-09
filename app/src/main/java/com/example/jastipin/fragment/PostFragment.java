package com.example.jastipin.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.jastipin.R;
import com.example.jastipin.activity.JualBarangActivity;
import com.example.jastipin.activity.PostJadwalActivity;
import com.example.jastipin.activity.RequestBarangActivity;
import com.example.jastipin.activity.TitipTravellerActivity;

public class PostFragment extends BaseFragment {

    private Button buttonJadwalTravel;
    private Button buttonRequestBarang;
    private Button buttonJualBarang;

    public static PostFragment newInstance() {
        PostFragment fragment = new PostFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_post, container, false);
        findView(view);
        initView(view);
        initListener(view);
        return view;
    }

    @Override
    public void findView(View view) {
        buttonJadwalTravel = view.findViewById(R.id.button_jadwalTravel);
        buttonRequestBarang = view.findViewById(R.id.button_requestBarang);
        buttonJualBarang = view.findViewById(R.id.button_jualBarang);
    }

    @Override
    public void initView(View view) {

    }

    @Override
    public void initListener(View view) {
        buttonJadwalTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), PostJadwalActivity.class));
            }
        });

        buttonRequestBarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), RequestBarangActivity.class));
            }
        });

        buttonJualBarang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), JualBarangActivity.class));
            }
        });

    }
}