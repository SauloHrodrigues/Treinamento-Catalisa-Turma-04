package Exercicio07_A;
import java.util.ArrayList;
import java.util.List;

public class Continente {
    private String nomeContinente;
    private double dimensaoContinente;
    private double populacaoContinente;
    private double densidadePopulacional;

    public Continente(String nomeContinente, double dimensaoContinente, double populacaoContinente, double densidadePopulacional) {
        this.nomeContinente = nomeContinente;
        this.dimensaoContinente = dimensaoContinente;
        this.populacaoContinente = populacaoContinente;
        this.densidadePopulacional = densidadePopulacional;
    }

    List<Paises> paises = new ArrayList();

    //Adicionar paises
    public void adicionaPaises(Paises paises) {
        this.paises.add(paises);
    }

    public void retornaDimensaoContinente() {
        System.out.println("A dimensão do nosso continente é de: " + dimensaoContinente);
    }


    public String getNomeContinente() {
        return nomeContinente;
    }

    public void setNomeContinente(String nomeContinente) {
        this.nomeContinente = nomeContinente;
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

    public List<Paises> getPaises() {
        return paises;
    }

    public void setPaises(List<Paises> paises) {
        this.paises = paises;
    }

    @Override
    public String toString() {
        return "Continente{" +
                "nomeContinente='" + nomeContinente + '\'' +
                ", dimensaoContinente=" + dimensaoContinente +
                ", populacaoContinente=" + populacaoContinente +
                ", densidadePopulacional=" + densidadePopulacional +
                ", paises=" + paises +
                '}';
    }

    ackage continente;
}