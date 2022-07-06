package entidades;

public class Pessoa {
    public String nome;
    public int idade;
    public float altura;
    public float peso;
    public Pessoa (String nome, int idade, float altura, float peso){
        this(nome, idade, altura);
        this.peso = peso;
    }

    public Pessoa(String nome, int idade, float altura) {
        System.out.println("construindo a pessoa");
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
}
