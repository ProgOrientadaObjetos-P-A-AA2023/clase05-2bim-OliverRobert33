
package paquete06;

/**
 *
 * @author reroes
 */
public class Persona {
    private String nombre;
    
    
    public Persona(String n){
        nombre = n;
        
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    
    public String obtenerNombre(){
        return nombre;
    }
    
    
    
}
