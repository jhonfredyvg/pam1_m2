package com.example.calculadoraestadistica.calculadora;

public class CalculadoraDesviacionEstandar extends CalculadoraEstadistica{
    public CalculadoraDesviacionEstandar(double[] datos) {
        super(datos);
    }

    @Override
    public double calcular() {
        double media = new CalculadoraMedia(datos).calcular();
        double desviacionCuadraticaMedia = 0;

        for (double dato : datos) {
            desviacionCuadraticaMedia += Math.pow(dato - media, 2);
        }

        return Math.sqrt(desviacionCuadraticaMedia / datos.length);
    }
}
