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
public class Principal {

    public static void main(String[] args) {
        /*
            Agregar un objeto de tipo EvaluacionObjetiva
            Verificar los métodos que no se implementan
        */
        EvaluacionEnsayo ensayo = new EvaluacionEnsayo();
        ensayo.establecerNumeroProblemas(10);
        ensayo.establecerTotalProblemas(20);
        ensayo.establecerPromedioEnsayo();
        ensayo.establecerPromedioObjetivas();

        System.out.printf("%d\n", ensayo.obtenerNumeroProblemas());

    }
}
