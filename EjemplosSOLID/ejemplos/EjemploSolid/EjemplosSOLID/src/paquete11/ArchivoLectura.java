package paquete11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ArchivoLectura {

    private Scanner entrada;
    private String nombreArchivo;
    private String rutaArchivo;
    ArrayList<String[]> datos = new ArrayList<>();

    public ArchivoLectura(String n) {
        nombreArchivo = n;
        rutaArchivo = String.format("datos/%s", nombreArchivo);
        File f = new File(rutaArchivo);
        if (f.exists()) {
            try {

                Scanner entrada = new Scanner(f);

                while (entrada.hasNextLine()) {
                    String linea = entrada.nextLine();
                    String[] partes = linea.split(";");
                    datos.add(partes);
                }

            } catch (FileNotFoundException e) {
                System.err.println("Error al leer del archivo: " + e);
            }
        }
    }

    public void establecerNombreArchivo(String n) {
        nombreArchivo = n;
    }

    public void establecerRutaArchivo() {
        rutaArchivo = String.format("datos/%s.txt",
                obtenerNombreArchivo());;
    }

    public void establecerDatos(ArrayList<String[]> datos) {
        this.datos = datos;
    }

    public String obtenerNombreArchivo() {
        return nombreArchivo;
    }

    public String obtenerRutaArchivo() {
        return rutaArchivo;
    }

    public ArrayList<String[]> obtenerDatos() {
        return datos;
    }

    public void cerrarArchivo() {
        if (entrada != null) {
            entrada.close();
        } // cierra el archivo

    }

}
