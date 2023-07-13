/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
 /*
        Usar el txt llamado usuarios.txt; por cada línea del archivo
        crer un API en función de su servicio; 
        además el API ahora genera información estática (no cambia el API), 
        se debe buscar la forma que el API sea dinámico totalmente (usar alguna 
        librería propia de JAVA, tipo Random); 
        La url final debe contener el tipo de servicio y el user
        Por cada objeto de tipo GeneradoPelicula presentar la información 
        a través de un toString
 */
package paquete11;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        String nombreArchivo = "usuarios.txt";
        String url = "http://api.movie?api=";

//        GeneradorPelicula gp = new GeneradorPelicula();
        ArchivoLectura archivo = new ArchivoLectura(nombreArchivo);
        archivo.cerrarArchivo();

        ArrayList<GeneradorPelicula> lista = new ArrayList<>();
        ArrayList<String[]> datos = archivo.obtenerDatos();

        for (int i = 0; i < datos.size(); i++) {
            String[] dato = datos.get(i);

            GeneradorPelicula gp = new GeneradorPelicula();

            gp.establecerUsuario(dato[1]);
            String apikey = dato[1] + dato[2];

            String valorBuscado = dato[2];

            if (valorBuscado.equals("Netflix")) {
//                System.out.println("true");
                APINetflix apiN = new APINetflix();
                apiN.establecerApiKey(apikey);
                gp.establecerLlave(apiN);
            } else if (dato[2].equals("Disney")) {
//                System.out.println("true");
                APIDisney apiD = new APIDisney();
                apiD.establecerApiKey(apikey);
                gp.establecerLlave(apiD);
            } else if (dato[2].equals("Amazon")) {
//                System.out.println("true");
                APIAmazonMovie apiA = new APIAmazonMovie();
                apiA.establecerApiKey(apikey);
                gp.establecerLlave(apiA);
            } else if (dato[2].equals("Startplus")) {
//                System.out.println("true");
                APIStartplus apiS = new APIStartplus();
                apiS.establecerApiKey(apikey);
                gp.establecerLlave(apiS);
            }
            gp.establecerUrl(url);
            lista.add(gp);
        }

//        for (GeneradorPelicula parte : lista) {
        for (int i = 0; i < lista.size(); i++) {

            System.out.printf("%d) %s",
                    (i + 1),
                    lista.get(i));
            System.out.print("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n");
        }

    }
}
