package com.example.calculadoraestadistica;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.calculadoraestadistica.calculadora.CalculadoraDesviacionEstandar;
import com.example.calculadoraestadistica.calculadora.CalculadoraEstadistica;
import com.example.calculadoraestadistica.calculadora.CalculadoraMedia;
import com.example.calculadoraestadistica.calculadora.CalculadoraMediana;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        //Prueba CalculadoraEstadistica por consola
        double[] datos = {10, 5, 12, 7, 9};

        CalculadoraEstadistica calculadoraMedia = new CalculadoraMedia(datos);
        System.out.println("Media: " + calculadoraMedia.calcular());

        CalculadoraEstadistica calculadoraMediana = new CalculadoraMediana(datos);
        System.out.println("Mediana: " + calculadoraMediana.calcular());

        CalculadoraEstadistica calculadoraDesviacionEstandar = new CalculadoraDesviacionEstandar(datos);
        System.out.println("Desviación estándar: " + calculadoraDesviacionEstandar.calcular());
    }
}