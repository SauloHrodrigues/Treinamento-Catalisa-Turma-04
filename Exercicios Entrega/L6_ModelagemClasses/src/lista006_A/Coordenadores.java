package lista006_A;

import java.util.Scanner;

public class Coordenadores extends Funcionarios{
    private int professoresSupervisionados;

    public Coordenadores(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
    }

    public Coordenadores(Scanner input){
        super(input);
        System.out.print("Digite a quantidade de professores supervisionados: ");
        this.professoresSupervisionados = input.nextInt();
    }

    @Override
    public void aumentoSalario() {
    }

    public String adicionaProfessor(int qtdProfessoresAdiciaonado){
        String retorno;
        if(qtdProfessoresAdiciaonado <=3){
            this.professoresSupervisionados += qtdProfessoresAdiciaonado;
            retorno = "Professor adicionado com sucesso";
        }else{
            retorno = "Cordenador com limite máximo de professores!";
        }

        return retorno;
    }

    public int getProfessoresSupervisionados() {
        return professoresSupervisionados;
    }
}
