package com.example.jastipin.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.fragment.app.Fragment;

import com.example.jastipin.R;
import com.example.jastipin.activity.JualBarangActivity;
import com.example.jastipin.activity.PostJadwalActivity;
import com.example.jastipin.activity.RequestBarangActivity;
import com.example.jastipin.activity.TitipTravellerActivity;

public class HomeFragment extends BaseFragment {

    private Button button_carinegara;
    private Button button_caritraveller;
    private Button button_trendingrequest;

    private Button button_titip1;
    private Button button_titip2;
    private Button button_titip3;

    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        findView(view);
        initView(view);
        initListener(view);
        return view;
    }

    @Override
    public void findView(View view) {
        button_carinegara = view.findViewById(R.id.button_carinegara);
        button_caritraveller = view.findViewById(R.id.button_caritraveller);
        button_trendingrequest = view.findViewById(R.id.button_trendingrequest);

        button_titip1 = view.findViewById(R.id.button_titip1);
        button_titip2 = view.findViewById(R.id.button_titip2);
        button_titip3 = view.findViewById(R.id.button_titip3);
    }

    @Override
    public void initView(View view) {

    }

    @Override
    public void initListener(View view) {
        button_titip1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TitipTravellerActivity.class));
            }
        });

        button_titip2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TitipTravellerActivity.class));
            }
        });

        button_titip3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), TitipTravellerActivity.class));
            }
        });

    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
