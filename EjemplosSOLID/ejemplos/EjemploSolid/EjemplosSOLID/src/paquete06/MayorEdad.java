/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

/**
 *
 * @author reroes
 */
public class MayorEdad extends Persona{
    private String tarjeta;
    
    public MayorEdad(String n, String tar){
        super(n);
        tarjeta = tar;
    }
    
    public void establecerTarjeta(String n){
        tarjeta = n;
    }
    
    public String obtenerTarjeta(){
        return tarjeta;
    }

    
}
