package pessoa;

public class Pessoa {

    // nome, idade, peso e altura
    public String nome;
    public int idade;
    public float peso;
    public float altura;

    public Pessoa(String nome, int idade, float peso, float altura) {

        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public Pessoa(String nome, int idade, float altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        peso = 0;
    }

    public void Envelhecer(int idade) {
        if (idade <= 21) {
            this.altura += (float) (idade * 0.05);
        }
    }

    public void engordar() {
        //Metodo a ser implementado
    }

    public void emagrecer() {
        //Metodo a ser implementado
    }

    public void crescer() {
        //Metodo a ser implementado
    }
}
