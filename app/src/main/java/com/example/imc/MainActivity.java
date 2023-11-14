package com.example.imc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    private EditText editPeso, editAltura;
    private TextView textResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editPeso = findViewById(R.id.pesoo);
        editAltura = findViewById(R.id.altura);
        textResult = findViewById(R.id.result);
    }

    public void calcularImcButtonOnClick(View v){
        double altura = Double.parseDouble(editAltura.getText().toString());
        double peso = Double.parseDouble(editPeso.getText().toString());
        double result = peso/Math.pow(altura, 2);
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(2);
        textResult.setText(df.format(result));
    }
}