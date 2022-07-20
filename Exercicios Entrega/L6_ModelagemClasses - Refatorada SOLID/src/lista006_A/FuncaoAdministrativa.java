package lista006_A;

import java.util.Scanner;

public class FuncaoAdministrativa extends Funcionarios{
    private String funcaoAdministrativa;
    private String senioridade;

    public FuncaoAdministrativa(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
    }
    public FuncaoAdministrativa(Scanner input){
        super(input);
        System.out.print("Digite a função : ");
        this.funcaoAdministrativa = input.next();
        System.out.print("Digite a senioridade: ");
        this.senioridade= input.next();

    }
    @Override
    public void aumentoSalario() {
        setSalario(getSalario()*0.05);
    }
}
