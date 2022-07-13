package lista006_B;

public class Triangulo extends FiguraGeometrica {
    private float areaTriangulo;
    private float baseTriangulo;
    private float alturaTriangulo;

    public Triangulo(float base, float altura) {
        this.baseTriangulo = base;
        this.alturaTriangulo = altura;
    }

    public Triangulo(float lado_a, float lado_b, float lado_c, float raio, float pI, float base, float altura) {
        super(lado_a, lado_b, lado_c, raio, pI);

        this.baseTriangulo = base;
        this.alturaTriangulo = altura;
    }

    @Override
    public void Area() {
        areaTriangulo = (this.baseTriangulo * this.alturaTriangulo)/2;
    }

    public void setBaseTriangulo(float base) {
        this.baseTriangulo = base;
    }

    public void setAltura(float altura) {
        this.alturaTriangulo = altura;
    }

    public float getAreaTriangulo() {
        return areaTriangulo;
    }
}
