package Exercicio02;

import java.util.ArrayList;
import java.util.List;

public class Candidato {
    private String matriculaCandidato;
    private float nota;
    private List<Candidato> listaCandidato = new ArrayList<>();

    public Candidato(String matriculaCandidato, float nota) {
        this.matriculaCandidato = matriculaCandidato;
        this.nota = nota;
    }
    public Candidato() {    }

    public void adicionarCandidato(String matriculaCandidato, float nota){
        listaCandidato.add(new Candidato(matriculaCandidato,nota));
    }
    public void exibirCandidato(){
        for (int i = 0; i< listaCandidato.size();i++){
            System.out.printf("Matrícula: %s - Nota: %.2f \n",listaCandidato.get(i).getMatriculaCandidato(),listaCandidato.get(i).getNota());
        }
    }
    public void excluirCandidato(String matricula){
        listaCandidato.removeIf(x -> x.getMatriculaCandidato().equalsIgnoreCase(matricula));
        System.out.println("Removido com sucesso!");
    }

    public String getMatriculaCandidato() {
        return matriculaCandidato;
    }

    public void setMatriculaCandidato(String matriculaCandidato) {
        this.matriculaCandidato = matriculaCandidato;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
