package Exercicio01;

import java.util.Scanner;

public class MainProdutos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Produto produto = new Produto();
        boolean emExecucao = true;
        while (emExecucao) {
            int opcao = menuInicial(input);
            switch (opcao) {
                case 0:
                    emExecucao = false;
                    break;
                case 1:
                    //adicionarProduto(input);
                    System.out.println("Digite o Nome do Produto: ");
                    String nomeProduto = input.next();
                    System.out.println("Digite o valor do produto: ");
                    double preco = input.nextDouble();
                    produto.adicionarProdutos(nomeProduto,preco);

                case 2:
                    //Listar prodduto
                    produto.listarProdutos();

                    break;
                case 3:
                    //excluir produtos
                    System.out.print("Digite o produto que deseja excluir: ");
                    produto.exluirProduto(input.next());
                    break;
                default:
                    System.out.println("Opção inválida!");

            }
        }
    }

    public static int menuInicial(Scanner input) {
        System.out.println("Gerenciamento de Lista de produtos");
        System.out.println("1 - Adicionar Produtos: ");
        System.out.println("2 - Exibir Lista Produtos: ");
        System.out.println("3 - Excluir Produto: ");
        System.out.printf("0 - Sair do Sistema: \n");
        System.out.print("Escolha a opção: ");
        int opcao = input.nextInt();
        return opcao;
    }

}
