package paquete1;

public class Clase2 {
    // constructor
    public Clase2() {
        new Clase1();
        new Clase1(2);
        new Clase1(1, 2);
        new Clase1(0, 2, 4);
        // new Clase1(4, 5, 4, 5);

    }

    // metodos
    public void pruebaDesdeClase2() {
        System.out.println("acceso contructor clase1 desde clase2");
        Clase1 c1 = new Clase1();

        System.out.println("acseso atrbutos Clase1 desde Clase2");
        System.out.println("atributo publico: " + c1.atrPublico);
        System.out.println("atributo protegido: " + c1.atrProtegido);
        System.out.println("atributo default: " + c1.atrDefault);
        System.out.println("atributo privado: acceso no permitido ");

        System.out.println("acceso metodos Clase1 desde Clase2");
        System.out.println("metodo publico: " + c1.metodoPublico());
        System.out.println("metodo protegido: " + c1.metodoProtegido());
        System.out.println("metodo default: " + c1.metodoDefault());
        System.out.println("metodo privado: acceso no permitido ");

    }

}
