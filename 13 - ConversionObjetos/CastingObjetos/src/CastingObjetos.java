public class CastingObjetos {
    public static void main(String[] args) throws Exception {
        Empleado empleado1 = new Escritor("gonazlo", 20000, TipoEscritura.MODERNO);

        // empleado1.getTipoEscrituraTexto();
        imprimirDetalles(empleado1);
        Empleado empleado2 = new Gerente("GONZALO", 230, "informatico");
        imprimirDetalles(empleado2);
    }

    private static void imprimirDetalles(Empleado empleado) {
        String resultado = null;
        System.out.println("\n detalle empleado\n" + empleado.obtenerDetalles());
        if (empleado instanceof Escritor) {
            resultado = ((Escritor) empleado).getTipoEscrituraTexto();
            System.out.println("resultado tipo escritura; " + resultado);
        } else if (empleado instanceof Gerente) {
            resultado = ((Gerente) empleado).getDepartamento();
            System.out.println("resultado departamento: " + resultado);
        }
    }
}
