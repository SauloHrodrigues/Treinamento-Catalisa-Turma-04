package Exercicio03;

import Exercicio01.Produto;

import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private String nomePrato;

    private List<Cardapio> listaPratos = new ArrayList<>();

    // Construtores
    public Cardapio() {
    }
    public Cardapio(String nomePrato) {
        this.nomePrato = nomePrato;
    }

    // metodos
    public void adicionarPrato(String nome){
        this.listaPratos.add(new Cardapio(nome));

    }
    public void listarPrato(){

        for (int i = 0; i< listaPratos.size();i++){
            System.out.printf("Prato: %s  \n",listaPratos.get(i).getNomePrato());
        }
    }
    public void exluirPrato(String nome){
        listaPratos.removeIf(x -> x.getNomePrato().equalsIgnoreCase(nome));
        System.out.println("Removido com sucesso!");
    }

    //gets e seters
    public String getNomePrato() {
        return nomePrato;
    }

    public void setNomePrato(String nomePrato) {
        this.nomePrato = nomePrato;
    }
}
