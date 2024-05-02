public class Escritor extends Empleado {
    private final TipoEscritura tipoEscritura;

    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura) {
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura;
    }

    public TipoEscritura getTipoEscritura() {
        return tipoEscritura;
    }

    public String getTipoEscrituraTexto() {
        return tipoEscritura.getDescripcion();
    }

    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + "\n" +
                "tipo de escritura: " + tipoEscritura + "(" + tipoEscritura.getDescripcion() + ")";

    }
}
