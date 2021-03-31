package com.example.jastipin.activity;

import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

        import com.example.jastipin.MainActivity;
        import com.example.jastipin.R;

public class SignInActivity extends BaseActivity {

    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        findView();
        initView();
        initListener();
    }

    @Override
    public void findView() {
        buttonLogin = findViewById(R.id.button_login);
    }

    @Override
    public void initView() {

    }

    @Override
    public void initListener() {
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}