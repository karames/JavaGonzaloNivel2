public class AutoboxingUnboxing {
    public static void main(String[] args) throws Exception {
        // autoboxing (envolver)
        Integer enteroObj = 10;
        Float flotanteObj = 4.5f;
        Double dobleObj = 0.34d;
        System.out.println("autoboxing");
        System.out.println("entero obj: " + enteroObj.intValue());
        System.out.println("flotante obj: " + flotanteObj.floatValue());
        System.out.println("doble obj: " + dobleObj.doubleValue());

        // unboxing (desenvolver)
        int entero = enteroObj;
        float flotante = flotanteObj;
        double doble = dobleObj;
        System.out.println("unboxing");
        System.out.println("entero: " + entero);
        System.out.println("flotante: " + flotante);
        System.out.println("doble: " + doble);
    }
}
