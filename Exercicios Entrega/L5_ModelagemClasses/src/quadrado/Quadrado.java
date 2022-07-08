package quadrado;

public class Quadrado {
    private float tamanhoDoLado;
    private float areaQuadrado;

    public Quadrado(float tamanhoDoLado) {
        this.tamanhoDoLado = tamanhoDoLado;
    }

    public float getTamanhoDoLado() {
        return tamanhoDoLado;
    }

    public void Area (float lado){
        this.tamanhoDoLado =lado;
        this.areaQuadrado = lado*lado;
    }
    public float getAreaQuadrado() {
        return areaQuadrado;
    }
}
