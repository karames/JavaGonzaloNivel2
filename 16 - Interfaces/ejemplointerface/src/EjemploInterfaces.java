import datos.AccesoDatos;
import datos.ImplementacionMySql;
import datos.ImplementacionOracle;

public class EjemploInterfaces {
    public static void main(String[] args) throws Exception {
        AccesoDatos datos1 = new ImplementacionOracle();
        ejecutar(datos1, "listar");

        AccesoDatos datos2 = new ImplementacionMySql();
        ejecutar(datos2, "insertar");

        System.out.println("maximo regitro: " + AccesoDatos.MAX_REGISTROS);
    }

    private static void ejecutar(AccesoDatos datos, String accion) {
        if ("listar".equals(accion)) {
            datos.listarRegistros();
        } else if ("insertar".equals(accion)) {
            datos.insertarRegistros();
        }
    }
}
