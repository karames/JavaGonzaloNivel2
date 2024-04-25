public class EjemploPolimorfismo {
    public static void main(String[] args) throws Exception {
        Empleado emp = new Empleado("BERTO", 3000);
        imprimirDetalles(emp);

        Gerente ger = new Gerente("Dani", 100, "informatica");
        imprimirDetalles(ger);
    }

    public static void imprimirDetalles(Empleado emp) {
        System.out.println(emp.obtenerDetalles());
    }
}
