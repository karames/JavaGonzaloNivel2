package tools;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Archivo {

    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
            System.out.println("archivo creado correctamente");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void escribirArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo));
            String contenido = "entrado de dattos";
            salida.println(contenido);
            salida.println();
            salida.println("fin escritura");
            salida.close();

            System.out.println("sa escrito en el archivo correctamente");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo));
            String lectura;
            lectura = entrada.readLine();
            while (lectura != null) {
                System.out.println("lectura: " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public static void anexarArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true));
            String contenido = "anexo de dattos";
            salida.println(contenido);
            salida.println();
            salida.println("fin anexar");
            salida.close();

            System.out.println("sa anexo en el archivo correctamente");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

}
