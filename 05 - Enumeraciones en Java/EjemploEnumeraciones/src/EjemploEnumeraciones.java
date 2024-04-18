public class EjemploEnumeraciones {
    public static void main(String[] args) throws Exception {

        System.out.println("valor 1: " + Dias.LUNES);

        System.out.println("continente 4: " + Continentes.AMERICA);
        System.out.println("Numero de paises en " + Continentes.AMERICA + ": " + Continentes.AMERICA.getNumPaises());
        System.out.println("");
        imprimirContinentes();
    }

    public static void imprimirContinentes() {
        for (Continentes c : Continentes.values()) {
            System.out.println(c + " contiene " + c.getNumPaises() + " paises");

        }
    }

}
