package com.example.jastipin.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.jastipin.R;
import com.example.jastipin.fragment.NotificationsFragment;

public class NotificationsActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notifications);
        getSupportFragmentManager().beginTransaction().replace(R.id.notificationscontainer, new NotificationsFragment()).commit();
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