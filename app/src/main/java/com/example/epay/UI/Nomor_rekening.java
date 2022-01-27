package com.example.epay.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.example.epay.R;

public class Nomor_rekening extends AppCompatActivity {
    Button btnnorek;
    ImageView back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nomor_rekening);
        btnnorek = findViewById(R.id.btnrekening);

        btnnorek.setOnClickListener(v -> {
            Intent i = new Intent(this, Security_code.class );
            startActivity(i);
        });

        back.setOnClickListener(v -> {
            Intent i = new Intent(this, RegisterActivity.class );
            startActivity(i);
        });

    }
}