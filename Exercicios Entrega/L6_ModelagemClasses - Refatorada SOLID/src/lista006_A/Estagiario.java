package lista006_A;

import java.util.Scanner;

public class Estagiario implements Colaborador {
    private Professores professorVinculado01;
    private String nome;
    private String cpf;
    private String orgaoLotacao;
    private double bolsaAuxilio;

    public Estagiario(String nome, String cpf, String orgaoLotacao, double bolsaAuxilio) {
        this.nome = nome;
        this.cpf = cpf;
        this.orgaoLotacao = orgaoLotacao;
        this.bolsaAuxilio = bolsaAuxilio;
    }

    public Professores getProfessorVinculado01() {
        return professorVinculado01;
    }

    public void setProfessorVinculado01(Professores professorVinculado01) {
        this.professorVinculado01 = professorVinculado01;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String getOrgaoLotacao() {
        return orgaoLotacao;
    }

    @Override
    public void executarReembolso(double valorReembolso) {
        System.out.println("enviar reembolso");
    }

    public void setOrgaoLotacao(String orgaoLotacao) {
        this.orgaoLotacao = orgaoLotacao;
    }

    public double getBolsaAuxilio() {
        return bolsaAuxilio;
    }

    public void setBolsaAuxilio(double bolsaAuxilio) {
        this.bolsaAuxilio = bolsaAuxilio;
    }
}
