package Exercicio05;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        /*
        * Faça um programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
        */
        float fahrenheit, celsius;
        Scanner receber = new Scanner(System.in);
        System.out.println("\n *************************** CONVERSÃO DE FAHRENHEIT PARA CELSIUS ****************\n");
        System.out.print("Entre com o valor em Fahrenheit a ser convertido em Celsius:  ");
        fahrenheit = receber.nextFloat();
        receber.close();
        celsius = (float) ((fahrenheit - 32)/1.8);
        System.out.printf("A conversão de %.3f Fahrenheit em Celsius é: %.3f",fahrenheit, celsius);
    }
}
