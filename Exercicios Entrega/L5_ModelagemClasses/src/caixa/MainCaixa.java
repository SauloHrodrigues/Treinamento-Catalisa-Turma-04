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
            System.out.println("2 - Crébito.");
            System.out.println("3 - Saldo");
            System.out.println("4 - Sair ");
            int operacao = input.nextInt();
            switch (operacao){
                case 1:
                    // debito
                    System.out.println("Digite o valor do saque: ");
                    double saque = input.nextDouble();
                    if (saque > caixa.saldoConta){
                        System.out.println("Saldo insuficiente!");
                    }else{
                        caixa.debito(saque);
                        System.out.println("Retire seu dineiro.  ");
                        System.out.println("Fezer nova operação s/n ");
                        String resposta = input.next();
                        boolean aux = validaResposta(resposta,input);
                        if (aux) {
                            quantidadeTransacao += 1;
                        }else{
                            quantidadeTransacao = 0;
                        }
                      break;
                    }

                    break;
                case 2://credito
                    System.out.println("Digite o valor do depósito: ");
                    double credito = input.nextDouble();
                    caixa.credito(credito);
                    break;
                case 3:
                    System.out.println("Seu saldo é de: R$ "+ caixa.getSaldoConta());
                    break;
                case 4:
                    System.out.println("Obrigado pela preferência, volte sempre.");
                    quantidadeTransacao=0;
                    break;
                default:
                    String resposta = "n";
                    boolean aux = validaResposta(resposta,input);
                    if (aux) {
                        quantidadeTransacao += 1;
                    }else{
                        quantidadeTransacao = 0;
                    }
            }
            quantidadeTransacao-= 1;

        }
    }

    public static boolean validaResposta(String resposta, Scanner input){
        int cont =0;
        boolean retorno = true;
        while (resposta.equalsIgnoreCase("n")&& cont<3) {
            System.out.println("Opção inválida! Deseja fazer outra operação? s/n");
            resposta = input.next();
            if (cont == 3) {
                System.out.println("Tente mais tarde!");
                retorno = false;
                break;
            }
            if (resposta.equalsIgnoreCase("s")){
                retorno = true;
                break;
            }
            if(resposta.equalsIgnoreCase("n")){
                System.out.println("Obrigado pela preferência, volte sempre!");
                retorno = false;
                break;
            }
            cont += 1;
        }
        return retorno;
    }
 }