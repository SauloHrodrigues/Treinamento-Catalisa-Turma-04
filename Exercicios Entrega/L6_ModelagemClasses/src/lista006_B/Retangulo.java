package lista006_B;

public class Retangulo extends FiguraGeometrica {
    private float areaRetangulo;
    private float base;
    private float altura;

    public Retangulo( float base, float altura) {
        this.base = base;
        this.altura = altura;
    }

    public Retangulo(float lado_a, float lado_b, float lado_c, float raio, float pI, float base, float altura) {
        super(lado_a, lado_b, lado_c, raio, pI);

        this.base = base;
        this.altura = altura;
    }

    @Override
    public void Area() {
        areaRetangulo = this.base * this.altura;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getAreaRetangulo() {
        return areaRetangulo;
    }
}
