package abstracto.clases;

public class Triangulo extends FiguraGeometrica {
    public Triangulo(String tipoFigura) {
        super(tipoFigura);
    }

    public void dibujar() {
        System.out.println("figura dibujada: " + this.getClass().getSimpleName());
    }
}
