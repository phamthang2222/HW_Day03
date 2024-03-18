package vn.phamthang.miniproject;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class LoginActivity extends AppCompatActivity {
    private TextView tvFogotPassword;
    private Button btnLogin;
    private TextView tvCreatAcc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        getVariable();
        onClick();
    }

    private void onClick() {
        tvFogotPassword.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this, OTPActivity.class));
        });
        tvCreatAcc.setOnClickListener(v -> {
            startActivity(new Intent(LoginActivity.this,RegisActivity.class));
        });
    }


    private void getVariable() {
        tvFogotPassword = findViewById(R.id.tvFogotPassword);
        btnLogin = findViewById(R.id.btLogin);
        tvCreatAcc = findViewById(R.id.tvRegis);
    }
}