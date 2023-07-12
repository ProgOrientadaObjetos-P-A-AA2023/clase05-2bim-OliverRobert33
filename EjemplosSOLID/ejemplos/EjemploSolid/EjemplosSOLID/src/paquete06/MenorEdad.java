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
public class MenorEdad extends Persona{
    
    private MayorEdad representante;
           
    public MenorEdad(String n, MayorEdad repre){
        super(n);
        representante = repre;
    }
    
    public void establecerRepresentante(MayorEdad m){
        representante = m;
    }
    
    public MayorEdad obtenerRepresentante(){
        return representante;
    }
    
}
