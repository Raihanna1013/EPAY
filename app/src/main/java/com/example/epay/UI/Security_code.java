package com.example.epay.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.example.epay.R;

public class Security_code extends AppCompatActivity {
    ImageView back;
    Button btnsecurity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_security_code);
        back = findViewById(R.id.back);
        btnsecurity = findViewById(R.id.btnSecurity);

        back.setOnClickListener(v -> {
            Intent i = new Intent(this, Nomor_rekening.class );
            startActivity(i);
        });

        btnsecurity.setOnClickListener(v -> {
            Intent i = new Intent(this, MainActivity.class );
            startActivity(i);
        });
    }
}