public class SobreEscrituraMetodos {
    public static void main(String[] args) throws Exception {
        System.out.println("Empleado");
        Empleado empleado = new Empleado("berto", 2000);
        System.out.println(empleado.obtenerDetalles());

        System.out.println("gerente");
        Gerente gerente = new Gerente("dani", 2500, "informatica");
        System.out.println(gerente.obtenerDetalles());
    }
}
