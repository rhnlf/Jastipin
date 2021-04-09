package com.example.jastipin.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import com.example.jastipin.R;

public class TitipTravellerActivity extends BaseActivity {

    private Button button_kirimpesan;
    private Spinner spinner;
    private Button button_titip;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_titip_traveller);
        findView();
        initView();
        initListener();

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(TitipTravellerActivity.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.spinner));
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
    }

    @Override
    public void findView() {
        button_kirimpesan = findViewById(R.id.button_kirimpesan);
        spinner = findViewById(R.id.spinner);
        button_titip = findViewById(R.id.button_titip);
    }

    @Override
    public void initView() {

    }

    @Override
    public void initListener() {

    }
}