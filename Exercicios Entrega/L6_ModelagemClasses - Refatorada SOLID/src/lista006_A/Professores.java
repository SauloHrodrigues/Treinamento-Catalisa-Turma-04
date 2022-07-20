package lista006_A;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Professores extends Funcionarios{
    private String nivelGraduacao;
    private String disciplinaMinistrada;
    private int qtdAlunos;
    private int qtdTurmas;
    private double salarioProf;
    private List<Estagiario> estagiarios = new ArrayList<>();
    public Professores(String nome, String cpf, String numeroRegistro, String orgaoLotacao, double salario,
                       String nivelGraduacao, String disciplinaMinistrada, int qtdAlunos, int qtdTurmas) {
        super(nome, cpf, numeroRegistro, orgaoLotacao, salario);
        this.salarioProf = salario;
        this.nivelGraduacao =nivelGraduacao;
        this.disciplinaMinistrada = disciplinaMinistrada;
        this.qtdAlunos = qtdAlunos;
        this.qtdTurmas = qtdTurmas;
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
    public void adicionar(Estagiario estagiario){
        if(estagiarios.size() < 2 ){
            estagiarios.add(estagiario);
            estagiario.setProfessorVinculado01(this);
        }else{
            System.out.println("numero de estagiarios excedido");
        }

    }
    @Override
    public void aumentoSalario() {
       this.salarioProf += getSalario()*0.10;

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

    public double getSalarioProf() {
        return salarioProf;
    }

    public void setSalarioProf(double salarioProf) {
        this.salarioProf = salarioProf;
    }


}
