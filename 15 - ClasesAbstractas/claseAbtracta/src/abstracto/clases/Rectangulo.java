package abstracto.clases;

public class Rectangulo extends FiguraGeometrica {
    public Rectangulo(String tipoFigura) {
        super(tipoFigura);
    }

    public void dibujar() {
        System.out.println("figura dibujada: " + this.getClass().getSimpleName());
    }
}
