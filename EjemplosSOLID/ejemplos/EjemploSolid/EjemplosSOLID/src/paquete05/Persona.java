
package paquete05;

/**
 *
 * @author reroes
 */
public class Persona {
    private String nombre;
    private String tarjeta;
    
    public Persona(String n, String e){
        nombre = n;
        tarjeta = e;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerTarjeta(String n){
        tarjeta = n;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTarjeta(){
        return tarjeta;
    }
    
}
