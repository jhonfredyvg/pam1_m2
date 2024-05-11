package com.example.calculadoraestadistica.calculadora;

public class CalculadoraMedia extends CalculadoraEstadistica{
    public CalculadoraMedia(double[] datos) {
        super(datos);
    }

    @Override
    public double calcular() {
        double suma = 0;
        for (double dato : datos) {
            suma += dato;
        }
        return suma / datos.length;
    }
}
