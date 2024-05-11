package com.example.calculadoraestadistica.calculadora;

public abstract class CalculadoraEstadistica {
    protected double[] datos; // Arreglo para almacenar los datos numéricos

    public CalculadoraEstadistica(double[] datos) {
        this.datos = datos;
    }

    // Método abstracto para calcular la medida estadística específica
    public abstract double calcular();
}
