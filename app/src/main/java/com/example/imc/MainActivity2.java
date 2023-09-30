package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    private TextView resultado;
    private ImageView imagen;
    private Button button2;
    private Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button2=findViewById(R.id.button2);

        resultado=findViewById(R.id.resultado);
        imagen=findViewById(R.id.imageView3);

        double IMC=getIntent().getDoubleExtra("BMI",0);


        String resul="Tu Indice de Masa Corporal es: "+String.format("%.2f",IMC)+"\n"+"\n";
        if (IMC < 18.5) {
            resul += "PESO BAJO. Debes aumentar tu ingesta de alimentos ricos en grasas."+"\n"+"\n";
            resul +="Haz ejercicio y toma licuados y batidos de frutas que te ayudaran a subir de peso";
            imagen.setImageResource(R.drawable.pesobajo);

        } else if (IMC >= 18.5 && IMC < 24.9) {
            resul += "PESO SALUDABLE. ¡Sigue así! come mucha fruta y consume agua diariamente"+"\n"+"\n";
            resul +="evita las bebidas azucaradas, evita consumir grasas saturdas y trans por que son nocivas para tu salud ";
            imagen.setImageResource(R.drawable.pesosaludable);
        } else if (IMC >= 25 && IMC < 29.9) {
            resul += "SOBREPESO. Considera hacer ejercicio regularmente, recomendablemente 30 minutos"+"\n"+"\n";
            resul +="procura no consumir azucares como jugos o cualquie  bebida que contenga azucar"+"\n"+"\n";
            imagen.setImageResource(R.drawable.sobrepeso);
        } else {
            resul += "OBESIDAD. Consulta a un médico para obtener orientación."+"\n"+"\n";
            resul+="Realizar actividad fisica todos los dias ademas comer varias veces al dia frutas y verduras permiten evitar que la persona caiga en la tentacion de consumir grasas "+"\n"+"\n";

            imagen.setImageResource(R.drawable.obesidad);
        }
        resultado.setText(resul);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }

}