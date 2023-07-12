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
public class GeneradorPeliculas {

    private APINetflix llave;
    private String url;

    public void establecerLlave(APINetflix l) {
        llave = l;
    }

    public void establecerUrl(String l) {
        url = String.format("%s%s", l, obtenerLlave().obtenerApiKey());
    }

    public APINetflix obtenerLlave() {
        return llave;
    }

    public String obtenerUrl() {
        return url;
    }

}
