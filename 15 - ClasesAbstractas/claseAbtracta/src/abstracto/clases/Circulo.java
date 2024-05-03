package abstracto.clases;

public class Circulo extends FiguraGeometrica {
    public Circulo(String tipoFigura) {
        super(tipoFigura);
    }

    public void dibujar() {
        System.out.println("figura dibujada: " + this.getClass().getSimpleName());
    }
}
