package paquete11;

public class GeneradorPelicula {

    private APIMovie llave;
    private String url;
    // agregar un user (tipo String)
    private String usuario;

    public void establecerLlave(APIMovie llave) {
        this.llave = llave;
    }

    public void establecerUrl(String l) {
        url = String.format("%s%s",
                l,
                obtenerLlave().obtenerApiKey());
    }

    public void establecerUsuario(String usuario) {
        this.usuario = usuario;
    }

    public APIMovie obtenerLlave() {
        return llave;
    }

    public String obtenerUrl() {
        return url;
    }

    public String obtenerUsuario() {
        return usuario;
    }

    @Override
    public String toString() {

        String cadena = String.format(""
                + "%s %s\n"
                + "Url: %s\n\n",
                obtenerUsuario(),
                llave.obtenerApiKey(),
                obtenerUrl());
        return cadena;
    }

}
