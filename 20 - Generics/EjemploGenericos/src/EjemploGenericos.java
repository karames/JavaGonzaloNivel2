public class EjemploGenericos {
    public static void main(String[] args) throws Exception {
        ClaseGenerica<String> objetString = new ClaseGenerica<String>("valor");
        objetString.obtenerTipo();

        ClaseGenerica<Integer> objetInt = new ClaseGenerica<Integer>(34);
        objetInt.obtenerTipo();

        ClaseGenerica<Double> objetDob = new ClaseGenerica<Double>(45.8);
        objetDob.obtenerTipo();
    }
}
