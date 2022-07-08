package pessoa;

import java.util.Scanner;

public class MainPessoas {
    public static void main(String[] args) {
        Pessoa pessoaSpeso = new Pessoa("Saulo",18,1.70f);
        System.out.println("Testando a classe pessoa sem peso da 1ª lista");
        System.out.println("Pessoa sem peso: ");
        System.out.println("Nome: "+ pessoaSpeso.nome);
        System.out.println("Idade: "+ pessoaSpeso.idade);
        System.out.println("Peso: "+ pessoaSpeso.peso);
        System.out.println("Autura: "+ pessoaSpeso.altura);
        System.out.println("---------------------------------------------------");
        Pessoa pessoaComPeso = new Pessoa("Saulo",18,70,1.70f);
        System.out.println("Testando a classe pessoa com peso da 1ª lista");
        System.out.println("Pessoa sem peso: ");
        System.out.println("Nome: "+ pessoaComPeso.nome);
        System.out.println("Idade: "+ pessoaComPeso.idade);
        System.out.println("Peso: "+ pessoaComPeso.peso);
        System.out.println("Peso: "+ pessoaComPeso.altura);
        System.out.println("---------------------------------------------------");

        System.out.println("Teste do metodo envelhecer: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a idade: ");
        pessoaComPeso.Envelhecer(input.nextInt());
        System.out.println("Sua altura é :" +pessoaComPeso.altura );

    }

}
