package datos;

public interface AccesoDatos {

    public static final int MAX_REGISTROS = 10;

    public abstract void insertarRegistros();

    public abstract void listarRegistros();
}
