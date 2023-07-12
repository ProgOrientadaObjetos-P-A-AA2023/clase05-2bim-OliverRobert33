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
public abstract class Evaluacion {
    
    protected double promedioObjetivas;
    protected double promedioEnsayo;
    
    public abstract void establecerPromedioObjetivas();
    public abstract double obtenerPromedioObjetivas();
    
    public abstract void establecerPromedioEnsayo();
    public abstract double obtenerPromedioEnsayo();
    
}
