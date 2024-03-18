package vn.phamthang.miniproject;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class RegisActivity extends AppCompatActivity {
    private TextView tvLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_regis);

        getVariable();
        onClick();
    }

    private void getVariable() {
        tvLogin = findViewById(R.id.tvLogin);
    }

    private void onClick() {
        tvLogin.setOnClickListener(v -> {
            finish();
        });

    }
}