package Exercicio07_A;

import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nomeContinentes;
    private double dimensaoContinente;
    private double populacaoContinente;
    private double densidadePopulacional;

    public Continente(String nomeContinentes, double dimensaoContinente, double populacaoContinente, double densidadePopulacional) {
        this.nomeContinentes = nomeContinentes;
        this.dimensaoContinente = dimensaoContinente;
        this.populacaoContinente = populacaoContinente;
        this.densidadePopulacional = densidadePopulacional;
    }

    public Continente(String nomeContinentes){
        this.nomeContinentes = "America Latina";
    }
    List<String> paises = new ArrayList();
    public void adcionarPaises(String paises){

    }
    public void retornaDimensaoContinente(){
        System.out.println("A Dimensão do continente é de: "+ dimensaoContinente);
    }

    public String getNomeContinentes() {
        return nomeContinentes;
    }

    public void setNomeContinentes(String nomeContinentes) {
        this.nomeContinentes = nomeContinentes;
    }

    public double getDimensaoContinente() {
        return dimensaoContinente;
    }

    public void setDimensaoContinente(double dimensaoContinente) {
        this.dimensaoContinente = dimensaoContinente;
    }

    public double getPopulacaoContinente() {
        return populacaoContinente;
    }

    public void setPopulacaoContinente(double populacaoContinente) {
        this.populacaoContinente = populacaoContinente;
    }

    public double getDensidadePopulacional() {
        return densidadePopulacional;
    }

    public void setDensidadePopulacional(double densidadePopulacional) {
        this.densidadePopulacional = densidadePopulacional;
    }
}
