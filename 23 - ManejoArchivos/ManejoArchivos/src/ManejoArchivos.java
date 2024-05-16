import tools.Archivo;

public class ManejoArchivos {

    private static final String NOMBRE_ARCHIVO = "D:\\JavaGonzaloNivel2\\23 - ManejoArchivos\\ManejoArchivos\\src\\PruebaJava.txt";

    // Prueba1.csv"
    public static void main(String[] args) throws Exception {
        // crear un archivo
        Archivo.crearArchivo(NOMBRE_ARCHIVO);
        Archivo.escribirArchivo(NOMBRE_ARCHIVO);
        Archivo.leerArchivo(NOMBRE_ARCHIVO);
        Archivo.anexarArchivo(NOMBRE_ARCHIVO);
        Archivo.leerArchivo(NOMBRE_ARCHIVO);
    }
}
