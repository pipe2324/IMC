package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  private EditText texto1;

  private EditText texto2;
  private  EditText texto3;

  private Button button;

  private Intent intent;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        texto1 = findViewById(R.id.texto1);
        texto2 = findViewById(R.id.texto2);
        texto3=findViewById(R.id.texto3);

        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                double peso=Double.parseDouble(texto1.getText().toString());
                double altura=Double.parseDouble(texto2.getText().toString());

                double IMC=peso/(altura*altura);
                intent = new Intent(getApplicationContext(), MainActivity2.class);
                intent.putExtra("BMI", IMC);
                startActivity(intent);
            }
        });
    }

    }
