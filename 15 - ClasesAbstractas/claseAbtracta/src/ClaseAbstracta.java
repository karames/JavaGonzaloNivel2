import abstracto.clases.Circulo;
import abstracto.clases.FiguraGeometrica;
import abstracto.clases.Rectangulo;
import abstracto.clases.Triangulo;

public class ClaseAbstracta {
    public static void main(String[] args) throws Exception {
        FiguraGeometrica rectangulo = new Rectangulo("rectángulo");
        FiguraGeometrica triangulo = new Triangulo("triangulo");
        FiguraGeometrica circulo = new Circulo("circulo");

        System.out.println("");
        System.out.println(rectangulo);
        rectangulo.dibujar();

        System.out.println("");
        System.out.println(triangulo);
        triangulo.dibujar();

        System.out.println("");
        System.out.println(circulo);
        circulo.dibujar();

    }
}
