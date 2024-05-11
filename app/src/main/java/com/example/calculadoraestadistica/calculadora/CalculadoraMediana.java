package com.example.calculadoraestadistica.calculadora;

import java.util.Arrays;

public class CalculadoraMediana extends CalculadoraEstadistica{
    public CalculadoraMediana(double[] datos) {
        super(datos);
    }

    @Override
    public double calcular() {
        Arrays.sort(datos); // Ordenar el arreglo de datos
        int mitad = datos.length / 2;

        if (datos.length % 2 == 0) {
            return (datos[mitad - 1] + datos[mitad]) / 2;
        } else {
            return datos[mitad];
        }
    }
}
