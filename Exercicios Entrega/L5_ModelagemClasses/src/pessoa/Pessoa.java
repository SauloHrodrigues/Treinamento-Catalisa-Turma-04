package pessoa;

public class Pessoa {
    public String nome;
    public int idade;
    public float altura;
    public float peso;
    public Pessoa (String nome, int idade, float altura, float peso){
        peso = 0;
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public Pessoa(String nome, int idade, float altura) {
        System.out.println("construindo a pessoa");
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
}
