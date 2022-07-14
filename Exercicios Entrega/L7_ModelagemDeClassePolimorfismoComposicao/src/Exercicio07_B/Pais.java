package Exercicio07_B;

import java.util.ArrayList;
import java.util.List;

public class Pais {
    private String codigoISO;
    private String nomePais;
    private long dimensaoPais;
    private long populacao;
    private List<Pais> paisesFronteiras = new ArrayList<>();

    public Pais(String codigoISO, String nomePais, long dimensaoPais,long populacao) {
        this.codigoISO = codigoISO;
        this.nomePais = nomePais;
        this.dimensaoPais = dimensaoPais;
        this.populacao = populacao;
    }
    public void addFronteira(Pais fronteira){
        this.paisesFronteiras.add(fronteira);
    }

    public String getCodigoISO() {
        return codigoISO;
    }
    public void setCodigoISO(String codigoISO) {
        this.codigoISO = codigoISO;
    }
    public String getNomePais() {
        return nomePais;
    }
    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }
    public double getDimensaoPais() {
        return dimensaoPais;
    }
    public void setDimensaoPais(long dimensaoPais) {
        this.dimensaoPais = dimensaoPais;
    }
    public double getPopulacao() {
        return populacao;
    }
    public void setPopulacao(long populacao) {
        this.populacao = populacao;
    }
    public double calcularDensidadePopulacional(){
        return (double)this.populacao / dimensaoPais;
    }

    public boolean fazFronteira(Pais outroPais) {
       return paisesFronteiras.contains(outroPais);
    }

    public void vizinhanca(Pais pais){
        if(this.paisesFronteiras.contains(pais)){
            System.out.println(pais.getNomePais() + " é vizinho.");
        }else {
            System.out.println(pais.getNomePais() + " não é vizinho");
        }

    }
}
