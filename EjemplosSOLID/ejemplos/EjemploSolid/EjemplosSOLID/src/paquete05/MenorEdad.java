/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete05;

/**
 *
 * @author reroes
 */
public class MenorEdad extends Persona{
    
    public MenorEdad(String n){
        super(n, null);
    }
    
    @Override
    public String obtenerTarjeta(){
        throw new RuntimeException("un niño no tiene tarjeta");
    }
    
    
}
