package paquete2;

import paquete1.Clase1;

public class Clase4 {

    public Clase4() {

    }

    public void pruebaDesdeClase4() {
        System.out.println("acceso constructor Clase1 desde Clase4");
        Clase1 c1 = new Clase1(8);

        System.out.println("acceso atributos Clase1 desde Clase 4");
        System.out.println("atributo publico: " + c1.atrPublico);
        System.out.println("atributo protegido: acceso no permito");
        System.out.println("atributo default: acceso no permito");
        System.out.println("atributo privado: acceso no permito");

        System.out.println("acceso metodos Clase1 desde Clase4");
        System.out.println("metodo publico: " + c1.metodoPublico());
        System.out.println("metodo protegido: acceso no permito");
        System.out.println("metodo default: acceso no permito");
        System.out.println("metodo privado: acceso no permito");
    }
}
