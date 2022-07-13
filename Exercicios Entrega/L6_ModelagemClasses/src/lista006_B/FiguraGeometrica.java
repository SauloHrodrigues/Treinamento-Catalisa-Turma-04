package lista006_B;

public abstract class FiguraGeometrica {
    float lado_A;
    float lado_B;
    float lado_C;
    float raio;
    float pI=3.14f;

    public FiguraGeometrica() {
        this.lado_A = lado_A;
        this.lado_B = lado_B;
        this.lado_C = lado_C;
        this.raio = raio;
        this.pI = pI;
    }

    public FiguraGeometrica(float lado_a, float lado_b, float lado_c, float raio, float pI) {
    }

    public abstract void Area();

    public float getLado_A() {
        return lado_A;
    }

    public void setLado_A(float lado_A) {
        this.lado_A = lado_A;
    }

    public float getLado_B() {
        return lado_B;
    }

    public void setLado_B(float lado_B) {
        this.lado_B = lado_B;
    }

    public float getLado_C() {
        return lado_C;
    }

    public void setLado_C(float lado_C) {
        this.lado_C = lado_C;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        this.raio = raio;
    }

    public float getpI() {
        return pI;
    }

    public void setpI(float pI) {
        this.pI = pI;
    }
}
