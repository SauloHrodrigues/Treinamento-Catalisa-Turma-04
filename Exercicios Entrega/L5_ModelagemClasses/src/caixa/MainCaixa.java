package caixa;

import java.util.Scanner;

public class MainCaixa {
    public static void main(String[] args) {
        int quantidadeTransacao;
        double saldo = 0;
        Caixa caixa = new Caixa(saldo);
        Scanner input = new Scanner(System.in);
        System.out.println("Caixa de Banco");
        System.out.printf("===============\n\n");
        System.out.print("Quantas transações deseja realizar? ");
        quantidadeTransacao = input.nextInt();
        while (quantidadeTransacao > 0) {
            System.out.println("Qual operação deseja?");
            System.out.println("1 - Débito.");
            System.out.println("2 - Cébito.");
            System.out.println("3 - Saldo");
            int opcao = input.nextInt();
            if (opcao == 1) {
                System.out.print("Digite o valor do saque: R$ ");
                double saque = input.nextDouble();
                if (saque > caixa.saldoConta) {
                    System.out.println("Saldo insuficiente!");
                    break;
                } else {
                    caixa.debito(saque);
                }
            } else if (opcao == 2) {
                System.out.print("Digite o valor do depósito : R$ ");
                double deposito = input.nextDouble();
                caixa.credito(deposito);
            } else if (opcao == 3) {
                System.out.println("Seu saldo é de R$ " + caixa.getSaldoConta());
            } else {
                System.out.println("Opção invalida! Tentar Novamente s/n");
                String op = input.next();
                if (op.equalsIgnoreCase("n")) {
                    break;
                } else {
                    quantidadeTransacao += 1;
                }
            }


            input.close();
        }
    }
