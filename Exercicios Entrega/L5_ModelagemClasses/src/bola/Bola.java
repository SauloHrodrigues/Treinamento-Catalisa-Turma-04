package bola;

public class Bola {
    public float circunferencia;
    public String cor;
    public String marca;
    public float velocidade;
    public String mostraCor(){
        return cor;
    }
    public void TrocaCor(String novaCor) {
        this.cor = novaCor;
    }
}
