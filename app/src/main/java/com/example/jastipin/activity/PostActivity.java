package com.example.jastipin.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.jastipin.R;
import com.example.jastipin.fragment.NotificationsFragment;

public class PostActivity extends BaseActivity {

    private Button buttonJadwalTravel;
    private Button buttonRequestBarang;
    private Button buttonJualBarang;
    private Button buttonTitipTraveller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post);
        findView();
        initView();
        initListener();
    }

    @Override
    public void findView() {
        buttonJadwalTravel = findViewById(R.id.button_jadwalTravel);
        buttonRequestBarang = findViewById(R.id.button_requestBarang);
        buttonJualBarang = findViewById(R.id.button_jualBarang);
        buttonTitipTraveller = findViewById(R.id.button_titipTraveller);
    }

    @Override
    public void initView() {

    }

    @Override
    public void initListener() {
        buttonJadwalTravel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PostActivity.this, PostJadwalActivity.class);
                startActivity(intent);
            }
        });
    }
}
