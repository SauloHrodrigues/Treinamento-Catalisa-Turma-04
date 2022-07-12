package lista006_A;

import java.util.Scanner;

public class Professores extends Funcionarios{
    private String nivelGraduacao;
    private String disciplinaMinistrada;
    private int qtdAlunos;
    private int qtdTurmas;

    public Professores(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario, String nivelGraduacao, String disciplinaMinistrada, int qtdAlunos, int qtdTurmas) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
    }

    public Professores(Scanner input){
        super(input);
        System.out.println("Digite a materias lecionadas:");
        String materia = input.next();
        System.out.print("Digite a graduação do professor: ");
        String graduacao = input.next();
        System.out.print("Digite o numero de alunos do professor: ");
        int qtdAlunos = input.nextInt();
        System.out.print("Digite a quantidade de turmas do professor: ");
        int qtdTurmas = input.nextInt();
    }

    @Override
    public void aumentoSalario() {
        System.out.println("O salario é =="+getSalario());
        double novoSalario = getSalario()+ getSalario()*0.10;
        setSalario(novoSalario);
        System.out.println("Onovo Salario é "+novoSalario);

    }

    public void adicionarTurmas(int qtdNovaTurma){
        this.qtdTurmas+=qtdNovaTurma;
    }

    public String getNivelGraduacao() {
        return nivelGraduacao;
    }

    public void setNivelGraduacao(String nivelGraduacao) {
        this.nivelGraduacao = nivelGraduacao;
    }

    public String getDisciplinaMinistrada() {
        return disciplinaMinistrada;
    }

    public void setDisciplinaMinistrada(String disciplinaMinistrada) {
        this.disciplinaMinistrada = disciplinaMinistrada;
    }

    public int getQtdAlunos() {
        return qtdAlunos;
    }

    public void setQtdAlunos(int qtdAlunos) {
        this.qtdAlunos = qtdAlunos;
    }

    public int getQtdTurmas() {
        return qtdTurmas;
    }

    public void setQtdTurmas(int qtdTurmas) {
        this.qtdTurmas = qtdTurmas;
    }
}
