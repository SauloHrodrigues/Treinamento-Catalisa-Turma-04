package Exercicio03;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        /*
         * 3 - Faça um programa que converta metros para centímetros.
         * */
        System.out.println("************ CONVERSOR DE METROS EM CENTÍMETROS *************\n");
        float metros, centimetros;
        Scanner recebe = new Scanner(System.in);
        System.out.print("Entre com a quantidade de metros a ser convertido em cm: ");
        metros = recebe.nextFloat();
        recebe.close();
        centimetros = metros *100;
        System.out.printf("%.2f metros pessuem %.2f centimetros!",metros, centimetros);
    }
}
