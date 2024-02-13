package com.example.challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtUsername;
    EditText txtPassword;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        txtUsername = findViewById(R.id.txtUsername);
        txtPassword = findViewById(R.id.txtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = txtUsername.getText().toString();
                String password = txtPassword.getText().toString();

                if (username.equals("Daffa") && password.equals("Ganteng")){
                    Toast.makeText(MainActivity.this, "Login Sukses", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, aritmaticcalc.class );
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Login Gagal", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}