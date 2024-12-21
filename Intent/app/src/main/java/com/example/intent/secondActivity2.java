package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class secondActivity2 extends AppCompatActivity {

     Button btnPre;
     TextView tvName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnPre=findViewById(R.id.btnPre);
        tvName=findViewById(R.id.tvName);

        Intent intent=getIntent();
       // String name=intent.getStringExtra("NAME");
        tvName.setText(intent.getStringExtra("NAME"));

        btnPre.setOnClickListener(v -> {
            Intent I2= new Intent(this, MainActivity.class);
            startActivity(I2);
        });
    }
}