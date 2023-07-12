/*
 * I — Interface segregation principle (Principio de segregación de interfaces)
 */
package paquete08;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        /*
            Analice la solución del paquete08 en relación al paquete07
        */
        
        EvaluacionEnsayo ensayo = new EvaluacionEnsayo();
        ensayo.establecerNumeroProblemas(10);
        ensayo.establecerTotalProblemas(20);
        ensayo.establecerPromedioEnsayo();
        System.out.println(ensayo.obtenerPromedioEnsayo());
        
        EvaluacionObjetiva ensayo2 = new EvaluacionObjetiva();
        ensayo2.establecerNumeroPreguntas(10);
        ensayo2.establecerTotalPreguntas(30);
        ensayo2.establecerPromedioObjetivas();
        System.out.println(ensayo2.obtenerPromedioObjetivas());
        
    }
}
