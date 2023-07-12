/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete08;

/**
 *
 * @author reroes
 */
public class EvaluacionObjetiva implements EvaluacionTipoUno {

    protected double promedioObjetivas;
    private int numeroPreguntas;
    private double totalPreguntas;

    public void establecerNumeroPreguntas(int n) {
        numeroPreguntas = n;
    }

    public void establecerTotalPreguntas(double n) {
        totalPreguntas = n;
    }

    public int obtenerNumeroPreguntas() {
        return numeroPreguntas;
    }

    public double obtenerTotalPreguntas() {
        return totalPreguntas;
    }

    @Override
    public void establecerPromedioObjetivas() {
        promedioObjetivas = obtenerTotalPreguntas() / obtenerNumeroPreguntas();
    }

    @Override
    public double obtenerPromedioObjetivas() {
        return promedioObjetivas;
    }

    
}
