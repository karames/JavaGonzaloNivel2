package abstracto.clases;

public class Elipse extends Circulo {
    public Elipse(String tipoFigura) {
        super(tipoFigura);
    }

    public void dibujar() {
        System.out.println("figura dibujada: " + this.getClass().getSimpleName());
    }
}
