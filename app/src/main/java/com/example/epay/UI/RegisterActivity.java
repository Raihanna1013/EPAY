package com.example.epay.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.epay.R;

public class RegisterActivity extends AppCompatActivity {
    ImageView back;
    Button btnreges;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        back = findViewById(R.id.back);
        btnreges = findViewById(R.id.btnRegis);

        back.setOnClickListener(v -> {
            Intent i = new Intent(this, LoginActivity.class );
            startActivity(i);
        });

        btnreges.setOnClickListener(v -> {
            Intent i = new Intent(this, Nomor_rekening.class );
            startActivity(i);
        });
    }
}