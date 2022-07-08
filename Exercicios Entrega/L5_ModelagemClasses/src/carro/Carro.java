package carro;

public class Carro {
    private String qtdePortas;
    private String modelo;
    private String marca;
    private String potencia;

    public Carro(String qtdePortas, String modelo, String marca) {
        this.qtdePortas = qtdePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = "2.0";
    }

    public String getQtdePortas() {
        return qtdePortas;
    }

    public void setQtdePortas(String qtdePortas) {
        this.qtdePortas = qtdePortas;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPotencia() {
        return potencia;
    }
}
