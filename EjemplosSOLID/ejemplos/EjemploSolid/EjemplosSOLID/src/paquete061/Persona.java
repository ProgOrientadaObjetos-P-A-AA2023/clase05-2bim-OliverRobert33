
package paquete061;

/**
 *
 * @author reroes
 */
public class Persona {
    protected String nombre;
    protected String tarjeta;
    
    public Persona(String n){
        nombre = n;
        
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public void establecerTarjeta(String n){
        tarjeta = n;
    }
    
    public String obtenerTarjeta(){
        return tarjeta;
    }
    
}
