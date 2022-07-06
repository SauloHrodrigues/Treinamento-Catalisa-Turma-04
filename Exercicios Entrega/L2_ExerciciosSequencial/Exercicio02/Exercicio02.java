package Exercicio02;

import java.util.Scanner;

public class Exercicio02{
    public static void main(String[] args) {
        /*
         *   Enunciado: 2 - Faça um programa que receba 4 notas bimestrais e mostre a média aritmética.
         * */
        float qtdNotas = 4;
        float media=0;
        Scanner receber = new Scanner(System.in);
        for(int cont = 1; cont<=qtdNotas; cont++){
            System.out.printf("Entre com a %dª nota: ",cont);
            media += receber.nextFloat();
        }
        receber.close();
        media = media/qtdNotas;
        System.out.println();
        System.out.printf("A média foi: %.2f",media);
    }
}
