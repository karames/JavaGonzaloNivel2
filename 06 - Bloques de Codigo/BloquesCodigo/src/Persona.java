public class Persona {
    private final int idPersona;
    private static int contadorPersonas;

    static {
        System.out.println("Ejecutando bloque anonimo statico");
        contadorPersonas = 10;
    }

    {
        System.out.println("ejecutando bloque anonimo");
        idPersona = ++contadorPersonas;
    }

    public Persona() {
        System.out.println("ejecutando coonstructor");
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona [idPersona=" + idPersona + "]";
    }

}
