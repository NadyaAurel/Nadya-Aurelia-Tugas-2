package com.example.tugas2login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class activity2register extends AppCompatActivity {

    Button pindahlogin;
    Button pindahregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity2register);

        pindahlogin = findViewById(R.id.btnlogin);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        pindahlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahlogin = new Intent(activity2register.this, login3tugas.class);
                startActivity(pindahlogin);
            }
        });

        pindahregister = findViewById(R.id.btnregister);

        pindahregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent pindahregister = new Intent(activity2register.this, register3tugas.class);
                startActivity(pindahregister);
            }
        });
    }
}
