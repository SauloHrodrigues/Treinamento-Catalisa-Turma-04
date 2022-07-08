package quadrado;

import java.util.Scanner;

public class MainQuadrado {
    public static void main(String[] args) {
        float lado=0;
        Quadrado quadrado = new Quadrado(lado);
        Scanner input =new Scanner(System.in);
        System.out.printf("Cálculo da área do quadrado: \n\n");
        System.out.print("Digite o tamanho do lado do quadrado: ");
        quadrado.Area(lado = input.nextFloat());
        System.out.println("================================================");
        System.out.printf("A área do quadrado de lado %.2f é : %.2f",quadrado.getTamanhoDoLado(),quadrado.getAreaQuadrado());
    }
}
