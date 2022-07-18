package Exercicio01;

import java.util.ArrayList;
import java.util.List;

public class Produto {
    private String nomeProduto;
    private double precoProduto;
    private List<Produto> listaProdutos = new ArrayList<>();

    // Construtores
    public Produto(String nomeProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }
    public Produto() {}

    // metodos
    public void adicionarProdutos(String nome, double preco){
        this.listaProdutos.add(new Produto(nome,preco));

    }
    public void listarProdutos(){

        for (int i = 0; i< listaProdutos.size();i++){
            System.out.printf("Produto: %s - Preço: %.2f \n",listaProdutos.get(i).getNomeProduto(),listaProdutos.get(i).getPrecoProduto());
        }
    }
    public void exluirProduto(String nome){
        listaProdutos.removeIf(x -> x.getNomeProduto().equalsIgnoreCase(nome));
        System.out.println("Removido com sucesso!");
    }

    // gets e setrs
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }
}
