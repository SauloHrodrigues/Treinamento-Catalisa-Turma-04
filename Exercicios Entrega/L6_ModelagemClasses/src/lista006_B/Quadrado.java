package lista006_B;

public class Quadrado extends FiguraGeometrica{
    private float areaQuadrado;
    private float ladoQuadrado;

    public Quadrado(float ladoQuadrado) {
        this.ladoQuadrado = ladoQuadrado;
    }

    public Quadrado() {
        super();
        this.ladoQuadrado = ladoQuadrado;
    }

    public float getAreaQuadrado() {
        return areaQuadrado;
    }

    @Override
    public void Area() {
        areaQuadrado = this.ladoQuadrado*this.ladoQuadrado;
    }

}
