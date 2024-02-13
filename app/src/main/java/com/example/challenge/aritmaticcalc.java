package com.example.challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class aritmaticcalc extends AppCompatActivity {

    EditText edit1;
    EditText edit2;
    Spinner spinner;
    Button button;
    TextView hasil;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aritmaticcalc);

        edit1 = findViewById(R.id.satu);
        edit2 = findViewById(R.id.dua);
        spinner = findViewById(R.id.spin);
        hasil = findViewById(R.id.hasil);
        button = findViewById(R.id.btnHitung);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(edit1.getText().toString());
                double number2 = Double.parseDouble(edit2.getText().toString());
                double result = 0;

                String text = spinner.getSelectedItem().toString();
                switch (text) {
                    case "Penjumlahan":
                        result = number1 + number2;
                        hasil.setText(Double.toString(result));
                        break;
                    case "Pengurangan":
                        result = number1 - number2;
                        hasil.setText(Double.toString(result));
                        break;
                    case "Perkalian":
                        result = number1 * number2;
                        hasil.setText(Double.toString(result));
                        break;
                    case "Pembagian":
                        if (number2 == 0) {
                            Toast.makeText(aritmaticcalc.this, "Pembagi tidak boleh 0", Toast.LENGTH_SHORT).show();
                            return;
                        } else {
                            result = number1 / number2;
                            hasil.setText(Double.toString(result));
                        }
                        break;
                }

            }
        });


    }
}