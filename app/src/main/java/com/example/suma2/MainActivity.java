package com.example.suma2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    boolean cambio = true;
    TextView texto, op1, op2;
    Button cambiar, sumar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sumar = findViewById(R.id.buttonSumar);
        op1 = findViewById(R.id.editTextNumberOp1);
        op2 = findViewById(R.id.editTextNumberOp2);
        cambiar = findViewById(R.id.buttonCambiar);
        texto = findViewById(R.id.texto);


        sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                texto.setText("Suma: " + (Integer.parseInt(op1.getText().toString()) + Integer.parseInt(op2.getText().toString())));

            }
        });


        cambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*
                if(cambio) {
                    texto.setText("Adiós Mundo");
                    cambio = false;
                }else{
                    texto.setText("Hola Mundo");
                    cambio = true;
                }

                 */
                texto.setText(cambio ? "Adiós Mundo" : "Hola Mundo.");
                cambio = !cambio;

            }
        });


    }
}