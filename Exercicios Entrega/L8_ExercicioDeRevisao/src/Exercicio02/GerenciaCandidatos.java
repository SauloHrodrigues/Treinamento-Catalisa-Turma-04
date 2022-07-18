package Exercicio02;

import java.util.Scanner;

public class GerenciaCandidatos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean emExecucao = true;
        Candidato candidato = new Candidato();
        while (emExecucao) {
            int opcao = menu(input);
            switch (opcao){
                case 0:
                    emExecucao=false;
                    break;
                case 1:
                    cadastroCanidato(input,candidato);
                    break;
                case 2:
                    exibirCandidatos(input, candidato);
                    break;
                case 3:
                    excluirCandidato(input,candidato);
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
        input.close();
    }
    public static int menu(Scanner input){
        System.out.printf("\nGerenciamento de Candidatos \n");
        System.out.println("Escolha a opção: ");
        System.out.println("1 - Adicionar Candidato.");
        System.out.println("2 - Exibir Candidatos.");
        System.out.println("3 - Excluir Candidatos.");
        System.out.println("0 - Sair do Programa: ");
        System.out.println();
        System.out.print("Digite a Opção Desejada: ");
        int opcao = input.nextInt();
        return opcao;
    }
    public static void cadastroCanidato(Scanner input, Candidato candidato){
        boolean novoCandidato =true;
        while (novoCandidato) {
            System.out.printf("\n\nCadastro do Candidato.\n");
            System.out.println("-------------------------");
            System.out.print("Digite onúmero da matrícula: ");
            String matricula = input.next();
            System.out.print("Digite a nota do cadidato: ");
            float notaCandidato = input.nextFloat();
            candidato.adicionarCandidato(matricula, notaCandidato);
            System.out.print("Cadastrar outro? (s/n): ");
            boolean resposta = validacaoResposta(input, input.next());
            if(resposta == false){
                break;
            }
        }
    }

    public static void exibirCandidatos(Scanner input, Candidato candidato){
        System.out.printf("\n\nLista de Candidatos\n");
        System.out.println("-------------------------");
        candidato.exibirCandidato();
    }
    public static void excluirCandidato(Scanner input, Candidato candidato){
        System.out.printf("\n\nExclusão de Candidatos\n");
        System.out.println("-------------------------");
        System.out.print("Digite a matrícula do candidato à ser excluido: ");
        candidato.excluirCandidato(input.next());
    }
    public static boolean validacaoResposta(Scanner input,String resposta){
        boolean retorno=false;
        boolean verificacao = true;
        while (verificacao){
            if (resposta.equalsIgnoreCase("s")){
                retorno= true;
                break;
            } else if (resposta.equalsIgnoreCase("n")) {
                retorno = false;
                break;
            }else{
                System.out.print("Opção inválida! Digite s ou n : " );
                resposta = input.next();
            }
        }
        return retorno;
    }
}
