package retangulo;

import java.util.Scanner;

public class MainRetangulo {
    public static void main(String[] args) {
        float base;
        float altura;
        boolean opcao=true;
        Retangulo retangulo = new Retangulo();
        Scanner imput = new Scanner(System.in);
        while (opcao) {
            System.out.println("Cálculo do Perímetro ");
            System.out.printf("==================== \n");
            System.out.println("Digite os seguintes dados:");
            System.out.print("Base do retângulo: ");
            base = imput.nextFloat();
            System.out.print("Altura do retângulo: ");
            altura = imput.nextFloat();
            retangulo.mudaValorLado(base, altura);
            System.out.println("--------------------------------------");
            System.out.println("O perímetro do retangulo é: " + retangulo.calculoPerimetro());
            System.out.println("Deseja alterar os valores dos lados? s/n ");
            String escolha = imput.next();
            if (escolha.equalsIgnoreCase("n")){
                opcao=false;
            }
        }
    }
}
