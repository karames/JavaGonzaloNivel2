package paquete2;

import paquete1.Clase1;

public class Clase3 extends Clase1 {
    // constructor
    public Clase3() {
        // super();
        // super(3);
        super(2, 5);
        // super(5, 5, 7, 7);
    }

    // metodos
    public void pruebaDesdeClase3() {
        System.out.println("acceso constructor de clase 1 desde clase3");
        Clase1 c1 = new Clase1();

        System.out.println("acceso atributos Clase1 desde Clase3");
        System.out.println("atributo publico: " + c1.atrPublico);
        System.out.println("atributo publico heredado: " + atrPublico);
        System.out.println("atributo protegido heredado: " + atrProtegido);
        System.out.println("atributo default: no permitido");
        System.out.println("atributo privado: no permitido");

        System.out.println("acceso metodos Clase1 desde Clase3");
        System.out.println("metodo publico: " + c1.metodoPublico());
        System.out.println("metodo protegido heredado: " + metodoProtegido());
        System.out.println("metodo default: acceso no permitido");
        System.out.println("metodo privado: acceso no permitido ");
    }
}
