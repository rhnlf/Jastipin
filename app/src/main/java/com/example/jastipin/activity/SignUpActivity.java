package com.example.jastipin.activity;

import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

        import com.example.jastipin.MainActivity;
        import com.example.jastipin.R;

public class SignUpActivity extends BaseActivity {

    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        findView();
        initView();
        initListener();
    }

    @Override
    public void findView() {
        buttonRegister = findViewById(R.id.button_register);
    }

    @Override
    public void initView() {

    }

    @Override
    public void initListener() {
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}