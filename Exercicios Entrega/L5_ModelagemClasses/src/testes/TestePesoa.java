package testes;

import pessoa.Pessoa;

public class TestePesoa {
    public static void main(String[] args) {
        Pessoa saulo = new Pessoa("saulo",18,2.0f);
        Pessoa rafael = new Pessoa("rafael",20,1.8f,86);
        exibirPessoa(saulo);
        exibirPessoa(rafael);
    }

    private static void exibirPessoa(Pessoa pessoa) {
        System.out.println("********************************************");
        System.out.println("Nome da pessoa: "+pessoa.nome);
        System.out.println("Idade da pessoa: "+pessoa.idade);
        System.out.println("altura da pessoa: "+pessoa.altura);
        System.out.println("Peso da pessoa: "+pessoa.peso);
    }
}
