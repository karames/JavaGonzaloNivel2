import paquete1.Clase2;
import paquete2.Clase3;
import paquete2.Clase4;

public class ModificadoresAcceso {
    public static void main(String[] args) throws Exception {
        System.out.println("acceso desde Clase2 ha Clase1 (mismo paquete)");
        new Clase2().pruebaDesdeClase2();

        System.out.println("acceso desde Clase3 ha Clase1 (distinto paquete pero es subclase)");
        new Clase3().pruebaDesdeClase3();

        System.out.println("acceso desde Clase4 ha Clase1 (distinto paquete y no subclase)");
        new Clase4().pruebaDesdeClase4();

    }
}
