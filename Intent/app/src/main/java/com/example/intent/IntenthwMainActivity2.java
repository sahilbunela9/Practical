package com.example.intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class IntenthwMainActivity2 extends AppCompatActivity {

    Button btnSub;
    EditText etName,etAge,etCono,etEmail,etPass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_intenthw_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        btnSub=findViewById(R.id.btnSub);
        etName=findViewById(R.id.etName);
        etAge=findViewById(R.id.etAge);
        etCono=findViewById(R.id.etCono);
        etEmail=findViewById(R.id.etEmail);
        etPass=findViewById(R.id.etPass);

        btnSub.setOnClickListener(v -> {
            String name=etName.getText().toString();
            Integer age=Integer.parseInt(etAge.getText().toString());
            long cono=Long.parseLong(etCono.getText().toString());
            String email=etEmail.getText().toString();
            String pass=etPass.getText().toString();

            Intent I1=new Intent(this,IntenthwsecondActivity2.class);
            I1.putExtra("Name",name);
            I1.putExtra("Age",age);
            I1.putExtra("Contactno",cono);
            I1.putExtra("Email",email);
            I1.putExtra("Password",pass);
            startActivity(I1);

        });
    }
}