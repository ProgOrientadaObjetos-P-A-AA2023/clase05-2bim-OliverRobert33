/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete09;

/**
 *
 * @author reroes
 */
public class APINetflix {
    
    private String apiKey;
    
    public void establecerApiKey(String ak){
        apiKey = ak+123123;
    }
    
    public String obtenerApiKey(){
        return apiKey;
    }
    
}
