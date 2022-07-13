package lista006_A;

import java.util.Scanner;

public class MainLista06_A {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean repetirOperacao = true;

        while (repetirOperacao) {
            int opcao = obterOpcao(input);
            switch (opcao) {
                case 0:
                    repetirOperacao = false;
                    break;
                case 1:
                    var p = new Professores(input);
                    System.out.println("O professor "+p.getNome()+" de "+p.getDisciplinaMinistrada()+
                            "receberá de Salário R$ "+p.getSalario());
                    aumento(p.getNome(), p.getCpf(), p.getNumeroRegistro(), p.getOrgaoLotacao(), p.getSalario(),
                            p.getNivelGraduacao(), p.getDisciplinaMinistrada(), p.getQtdAlunos(), p.getQtdTurmas(), input);

                    break;

                case 2:
                    var coordenadores = new Coordenadores(input);
                    break;
                case 3:
                    var funcionarioAdm = new FuncaoAdministrativa(input);
                    break;
                default:
                    System.out.println("Opção Invalida!");
            }
        }
    }

    private static int obterOpcao(Scanner input) {
        //todo implementar
        System.out.println("************** FUNCIONÁRIOS ****************");
        System.out.println("---------------------------------------");
        System.out.println("| 1 - Cadsatro de Professores:       |");
        System.out.println("| 2 - Cadsatro de Coordenadores:     |");
        System.out.println("| 3 - Cadsatro de Administrativo:    |");
        System.out.println("| 0 - Sair:                          |");
        System.out.println("---------------------------------------");
        System.out.println("Digite a Opção desejada: ");
        int retorno = input.nextInt();
        return retorno;
    }

    public static void aumento(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario,
                               String nivelGraduacao, String disciplinaMinistrada, int qtdAlunos, int qtdTurmas, Scanner input) {
        Professores prof = new Professores(nome, cpf, numeroRegistro, orgaoLotacao, salario, nivelGraduacao,
                disciplinaMinistrada, qtdAlunos, qtdTurmas);
        System.out.printf("Deseja aplicar o aumento para o professor %s (s/n) ", prof.getNome());
        String aumento = input.next();

        if(aumento.equalsIgnoreCase("s")){
            prof.aumentoSalario();
            System.out.printf("O novo salário será R$ %.2f \n\n", prof.getSalarioProf());
        }
    }

}
