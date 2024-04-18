package paquete1;

public class Clase1 {
    // atributos
    public int atrPublico = 10;
    protected int atrProtegido = 9;
    int atrDefault = 8;
    private int atrPrivado = 5;

    // contructores
    public Clase1() {
        System.out.println("constructor publico Clase1 vacio");
    }

    public Clase1(int i) {
        System.out.println("constructor publico Clase1 con 1 parametro");
    }

    protected Clase1(int i, int j) {
        System.out.println("constructor protegido Clase1 con 2 parametro");
    }

    Clase1(int i, int j, int k) {
        System.out.println("constructor default Clase1 con 3 parametro");
    }

    private Clase1(int i, int j, int k, int l) {
        System.out.println("constructor privado Clase1 con 4 parametro");
    }

    // metodos
    public String metodoPublico() {
        return "metodo publico Clase1";
    }

    protected String metodoProtegido() {
        return "metodo protegido Clase1";
    }

    String metodoDefault() {
        return "metodo default Clase1";
    }

    private String metodoPrivado() {
        return "metodo privado Clase1";
    }
}
