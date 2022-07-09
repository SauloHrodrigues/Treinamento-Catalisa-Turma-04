package retangulo;

public class Retangulo {
    private float base;
    private float altura;

    public void mudaValorLado(float base, float altura){
        this.base = base;
        this.altura = altura;
    }

    public float calculoPerimetro(){
        float perimetro = (base + altura)*2 ;
        return perimetro;
    }
}
