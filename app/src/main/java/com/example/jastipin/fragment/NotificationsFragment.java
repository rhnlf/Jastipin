package com.example.jastipin.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.jastipin.Notifications;
import com.example.jastipin.R;
import com.example.jastipin.adapter.NotificationsAdapter;

import java.util.ArrayList;

public class NotificationsFragment extends BaseFragment {

    private ArrayList<Notifications> notificationsArrayList;
    private RecyclerView recyclerView;
    private NotificationsAdapter notificationsAdapter;

    public static NotificationsFragment newInstance() {
        NotificationsFragment fragment = new NotificationsFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_notifications, container, false);
        getData();
        findView(view);
        initView(view);
        initListener(view);
        notificationsAdapter = new NotificationsAdapter(notificationsArrayList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(notificationsAdapter);
        getData();
        return view;
    }

    @Override
    public void findView(View view) {
        recyclerView = view.findViewById(R.id.recycleview);
    }

    @Override
    public void initView(View view) {

    }

    @Override
    public void initListener(View view) {

    }

    public void getData(){
        notificationsArrayList = new ArrayList<>();
        notificationsArrayList.add(new Notifications("Sam", "Mulai mengikutimu"));
        notificationsArrayList.add(new Notifications("Jessica", "Merequest barang titipan"));
        notificationsArrayList.add(new Notifications("Ron", "Mulai mengikutimu"));
        notificationsArrayList.add(new Notifications("Nina", "Merequest barang titipan"));
        notificationsArrayList.add(new Notifications("Ann", "Merequest barang titipan"));
        notificationsArrayList.add(new Notifications("Andrew", "Mulai mengikutimu"));
        notificationsArrayList.add(new Notifications("David", "Mulai mengikutimu"));
        notificationsArrayList.add(new Notifications("Josh", "Merequest barang titipan"));
        notificationsArrayList.add(new Notifications("Smith", "Jajang"));
        notificationsArrayList.add(new Notifications("Gabriel", "Mulai mengikutimu"));
        notificationsArrayList.add(new Notifications("Sam", "Mulai mengikutimu"));
        notificationsArrayList.add(new Notifications("Jessica", "Merequest barang titipan"));
        notificationsArrayList.add(new Notifications("Ron", "Mulai mengikutimu"));
        notificationsArrayList.add(new Notifications("Nina", "Merequest barang titipan"));
        notificationsArrayList.add(new Notifications("Ann", "Merequest barang titipan"));
        notificationsArrayList.add(new Notifications("Andrew", "Mulai mengikutimu"));
        notificationsArrayList.add(new Notifications("David", "Mulai mengikutimu"));
        notificationsArrayList.add(new Notifications("Josh", "Merequest barang titipan"));
        notificationsArrayList.add(new Notifications("Smith", "Jajang"));
        notificationsArrayList.add(new Notifications("Gabriel", "Mulai mengikutimu"));
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}