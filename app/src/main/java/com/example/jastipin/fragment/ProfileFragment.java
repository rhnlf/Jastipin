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
import com.example.jastipin.activity.LoginActivity;
import com.example.jastipin.activity.PostJadwalActivity;
import com.example.jastipin.activity.RequestBarangActivity;

public class ProfileFragment extends BaseFragment {

    private Button button_premium;
    private Button button_signout;

    public static ProfileFragment newInstance() {
        ProfileFragment fragment = new ProfileFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container, false);
        findView(view);
        initView(view);
        initListener(view);
        return view;
    }

    @Override
    public void findView(View view) {
        button_premium = view.findViewById(R.id.button_premium);
        button_signout = view.findViewById(R.id.button_signout);
    }

    @Override
    public void initView(View view) {

    }

    @Override
    public void initListener(View view) {
        button_signout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), LoginActivity.class));
            }
        });

    }
}