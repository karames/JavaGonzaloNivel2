/**
 * Ejemplo de uso de argumentos variables
 *
 * @author Gonzalo
 * @version 1.0.0
 */
public class EjemploVarArgs {
    public static void main(String[] args) throws Exception {
        imprimiNumeros(2, 1, 3, 2, 1, 334, 5);
        variosParametros("gonzalo", false, 3, 4, 5, 6, 7, 8, 4, 56);
    }

    public static void imprimiNumeros(int... numeros) {
        for (int i : numeros) {
            System.out.println("el numeros es: " + i);
        }
    }

    public static void variosParametros(String nombre, boolean valido, int... numeros) {
        System.out.println("nombre: " + nombre);
        System.out.println("valido: " + valido);
        for (int i : numeros) {
            System.out.println("el numero es: " + i);
        }
    }
}
