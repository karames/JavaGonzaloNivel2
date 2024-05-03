package abstracto.clases;

public abstract class FiguraGeometrica {
    protected String tipoFigura;

    protected FiguraGeometrica(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    public String getTipoFigura() {
        return tipoFigura;
    }

    public void setTipoFigura(String tipoFigura) {
        this.tipoFigura = tipoFigura;
    }

    public abstract void dibujar();

    @Override
    public String toString() {
        return "FiguraGeometrica [tipoFigura=" + tipoFigura + "]";
    }

}
