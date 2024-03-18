package vn.phamthang.miniproject;

import android.media.Image;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class OTPActivity extends AppCompatActivity {
    private Button btResend,btVerify;
    private ImageView ic_back;

    private TextView tvCode1, tvCode2, tvCode3, tvCode4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);

        getVariable();
        onClick();

    }

    private void onClick() {
        Random randomNumber = new Random();
        btResend.setOnClickListener(v -> {
            tvCode1.setText(randomNumber.nextInt(10)+"");
            tvCode2.setText(randomNumber.nextInt(10)+"");
            tvCode3.setText(randomNumber.nextInt(10)+"");
            tvCode4.setText(randomNumber.nextInt(10)+"");
        });
        ic_back.setOnClickListener(v -> {
            finish();
        });
        btVerify.setOnClickListener(v -> {
            Toast.makeText(this, "onClick", Toast.LENGTH_SHORT).show();
        });
    }

    private void getVariable() {
        btResend = findViewById(R.id.btResend);
        btVerify =findViewById(R.id.btVerify);
        tvCode1 =findViewById(R.id.tvCode1);
        tvCode2 =findViewById(R.id.tvCode2);
        tvCode3 =findViewById(R.id.tvCode3);
        tvCode4 =findViewById(R.id.tvCode4);
        ic_back = findViewById(R.id.btBack);
    }
}