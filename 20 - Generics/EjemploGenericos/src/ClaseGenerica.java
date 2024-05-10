public class ClaseGenerica<T> {
    T atrGenerico;

    public ClaseGenerica(T atrGenerico) {
        this.atrGenerico = atrGenerico;
    }

    public void obtenerTipo() {
        System.out.println("el tipo T es: " + atrGenerico.getClass().getName());
    }
}
