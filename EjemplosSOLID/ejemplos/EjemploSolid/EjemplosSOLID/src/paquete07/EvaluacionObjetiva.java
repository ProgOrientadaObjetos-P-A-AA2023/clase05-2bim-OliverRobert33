/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete07;

/**
 *
 * @author reroes
 */
public class EvaluacionObjetiva extends Evaluacion {

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

    public void establecerPromedioObjetivas() {
        promedioObjetivas = obtenerTotalPreguntas() / obtenerNumeroPreguntas();
    }

    public double obtenerPromedioObjetivas() {
        return promedioObjetivas;
    }

    public void establecerPromedioEnsayo() {
        // pass
    }

    public double obtenerPromedioEnsayo() {
        return 0.0;
    }
}
