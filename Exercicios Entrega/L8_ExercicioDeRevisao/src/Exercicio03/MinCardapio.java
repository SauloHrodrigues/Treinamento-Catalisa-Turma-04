package Exercicio03;

import Exercicio02.Candidato;

import java.util.Scanner;

public class MinCardapio {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        boolean emExecucao = true;
        Cardapio cardapio = new Cardapio();
        while (emExecucao) {
            int opcao = menu(input);
            switch (opcao) {
                case 0:
                    emExecucao = false;
                    break;
                case 1:
                    novoPrato(input, cardapio);
                    break;
                case 2:
                    exibirCardapio(input, cardapio);
                    break;
                case 3:
                    excluirPrato(input, cardapio);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        input.close();
    }

    public static int menu(Scanner input) {
        System.out.printf("\nCardápio do Restaurante \n");
        System.out.println("Escolha a opção: ");
        System.out.println("1 - Adicionar Novo Prato.");
        System.out.println("2 - Exibir Pratos do Cardápio.");
        System.out.println("3 - Excluir Patros do Cardápio.");
        System.out.println("0 - Sair do Programa: ");
        System.out.println();
        System.out.print("Digite a Opção Desejada: ");
        int opcao = input.nextInt();
        return opcao;
    }

    public static void novoPrato(Scanner input, Cardapio cardapio) {
        boolean novoCardapio = true;
        while (novoCardapio) {
            input.nextLine();
            System.out.printf("\n\nCadastrar Novo Prato.\n");
            System.out.println("-------------------------");
            System.out.print("Digite o Nome do Prato: ");
            String novoPrato = input.nextLine();
            cardapio.adicionarPrato(novoPrato);
            System.out.print("Cadastrar outro? (s/n): ");
            boolean resposta = validacaoResposta(input, input.next());
            if (resposta == false) {
                break;
            }
        }
    }

    public static void exibirCardapio(Scanner input, Cardapio cardapio) {
        System.out.printf("\n\nCardápio\n");
        System.out.println("-------------------------");
        cardapio.listarPrato();
    }

    public static void excluirPrato(Scanner input, Cardapio cardapio) {
        input.nextLine();
        System.out.printf("\n\nExcluir Prato\n");
        System.out.println("-------------------------");
        System.out.print("Digite o Nome do Prato à ser excluido: ");
        cardapio.exluirPrato(input.nextLine());
    }

    public static boolean validacaoResposta(Scanner input, String resposta) {
        boolean retorno = false;
        boolean verificacao = true;
        while (verificacao) {
            if (resposta.equalsIgnoreCase("s")) {
                retorno = true;
                break;
            } else if (resposta.equalsIgnoreCase("n")) {
                retorno = false;
                break;
            } else {
                System.out.print("Opção inválida! Digite s ou n : ");
                resposta = input.next();
            }
        }
        return retorno;
    }
}

