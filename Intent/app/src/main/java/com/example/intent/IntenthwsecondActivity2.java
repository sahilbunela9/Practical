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

public class IntenthwsecondActivity2 extends AppCompatActivity {

    TextView tvName,tvAge,tvCono,tvEmail,tvPass;
    Button btnExit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intenthwsecond2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnExit=findViewById(R.id.btnExit);
        tvName=findViewById(R.id.tvName);
        tvAge=findViewById(R.id.tvAge);
        tvCono=findViewById(R.id.tvCono);
        tvEmail=findViewById(R.id.tvEmail);
        tvPass=findViewById(R.id.tvPass);

        Intent intent=getIntent();
        tvName.setText(intent.getStringExtra("Name"));
        tvAge.setText(intent.getIntExtra("Age",0)+"");
        tvCono.setText(intent.getLongExtra("Contactno",0)+"");
        tvEmail.setText(intent.getStringExtra("Email"));
        tvPass.setText(intent.getStringExtra("Password"));

        btnExit.setOnClickListener(v -> {
            Intent I2=new Intent(this,IntenthwMainActivity2.class);
            startActivity(I2);

        });
    }
}