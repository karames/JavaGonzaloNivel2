public class EjemIstanceOf {
    public static void main(String[] args) throws Exception {
        FiguraGeometrica figura;
        figura = new Circulo();
        figura.dibujar();

        System.out.println("tipo especifico: ");
        determinarTipo(figura);
        System.out.println("todos sus tipos: ");
        determinarTodosTipos(figura);
    }

    private static void determinarTipo(FiguraGeometrica figura) {
        if (figura instanceof Elipse) {
            System.out.println("Elipse");
        } else if (figura instanceof Circulo) {
            System.out.println("Circulo");
        } else if (figura instanceof Rectangulo) {
            System.out.println("Rectangulo");
        } else if (figura instanceof Triangulo) {
            System.out.println("Triangulo");
        } else if (figura instanceof FiguraGeometrica) {
            System.out.println("FIgura geometrica");
        } else if (figura instanceof Object) {
            System.out.println("Objeto");
        } else {
            System.out.println("No se encontro el tipo");
        }
    }

    private static void determinarTodosTipos(FiguraGeometrica figura) {
        if (figura instanceof Elipse) {
            System.out.println("Elipse");
        }
        if (figura instanceof Circulo) {
            System.out.println("Circulo");
        }
        if (figura instanceof Rectangulo) {
            System.out.println("Rectangulo");
        }
        if (figura instanceof Triangulo) {
            System.out.println("Triangulo");
        }
        if (figura instanceof FiguraGeometrica) {
            System.out.println("FIgura geometrica");
        }
        if (figura instanceof Object) {
            System.out.println("Objeto");
        } else {
            System.out.println("No se encontro el tipo");
        }
    }
}
