package lista006_A;

import java.util.Scanner;

public abstract class Funcionarios {

    private String nome;
    private String cpf;
    private String numeroRegistro;
    private String orgaoLotacao;
    private double salario;

    public Funcionarios(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.numeroRegistro = numeroRegistro;
        this.orgaoLotacao = orgaoLotacao;
        this.salario = salario;
    }
    public Funcionarios(Scanner input){
        //todo scanear as entradas e preencher os atributos
        System.out.println("Cadastro de Professores: ");
        System.out.print("Digite o nome : ");
        this.nome = input.next();
        System.out.print("Digite o CPF : ");
        this.cpf = input.next();
        System.out.print("Digite o registro : ");
        this.numeroRegistro = input.next();
        System.out.printf("Digite o salário : ");
        this.salario = input.nextDouble();
    }
    public abstract void aumentoSalario();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
