package bola01;

public class Bola {

    private float circunferencia;
    private String cor;
    private String marca;
    private float velocidade;

    public Bola(float circunferencia, String cor, String marca, float velocidade) {
        this.circunferencia = circunferencia;
        this.cor = cor;
        this.marca = marca;
        this.velocidade = velocidade;
    }
    public Bola( String cor) {
        this.circunferencia = circunferencia;
        this.cor = cor;
    }
    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getCircunferencia() {
        return circunferencia;
    }

    public void setCircunferencia(float circunferencia) {
        this.circunferencia = circunferencia;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }
    public void trocaCor(String novaCor){
        this.cor = novaCor;
    }
    public String mostraCor(){
        return this.cor;
    }
}
