public enum TipoEscritura {
    CLASICO("escritura ha mano"),
    MODERNO("escritura digital");

    private final String descripcion;

    private TipoEscritura(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
