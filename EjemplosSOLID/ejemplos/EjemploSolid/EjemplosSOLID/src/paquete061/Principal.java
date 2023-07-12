/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete061;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
        
        MayorEdad representante = new MayorEdad("José", "Visa");
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        menor.establecerTarjeta();
        
        ArrayList<Persona> personas = new ArrayList<>();
        personas.add(representante);
        personas.add(menor);
        
        for (int i = 0; i < personas.size(); i++) {
            Persona p = personas.get(i);
            System.out.printf("Nombre:%s - Tarjeta:%s\n",
                p.obtenerNombre(), 
                p.obtenerTarjeta());
        }
        
        
    }
}
