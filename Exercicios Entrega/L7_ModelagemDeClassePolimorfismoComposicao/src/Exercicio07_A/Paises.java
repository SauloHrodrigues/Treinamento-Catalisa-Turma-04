package Exercicio07_A;

public class Paises {
    private String nomePais;
    private double populacao;
    private double densidade;

    public Paises(String nomePais, double populacao, double densidade) {
        this.nomePais = nomePais;
        this.populacao = populacao;
        this.densidade = densidade;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public double getPopulacao() {
        return populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }

    public double getDensidade() {
        return densidade;
    }

    public void setDensidade(double densidade) {
        this.densidade = densidade;
    }

    @Override
    public String toString() {
        return "Paises{" +
                "nomePais='" + nomePais + '\'' +
                ", populacao=" + populacao +
                ", densidade=" + densidade +
                '}';
    }
}