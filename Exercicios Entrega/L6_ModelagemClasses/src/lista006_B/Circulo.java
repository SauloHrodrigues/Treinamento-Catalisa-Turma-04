package lista006_B;

public class Circulo extends FiguraGeometrica{
    private float areaCirculo;
    private float raioCirculo;

    public Circulo(float raioCirculo) {
        this.raioCirculo = raioCirculo;
    }

    public Circulo(float lado_a, float lado_b, float lado_c, float raio, float pI, float raioCirculo) {
        super(lado_a, lado_b, lado_c, raio, pI);
        this.raioCirculo = raioCirculo;
    }

    @Override
    public void Area() {
        float pI= getpI();
        this.areaCirculo = (float) (pI * Math.pow(raioCirculo,2));
    }

    public float getAreaCirculo() {
        return areaCirculo;
    }
}
