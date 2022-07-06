package Exercicio06;

import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        /*
        * 6 - Faça um programa que leia um número inteiro e imprima o seu antecessor e seu sucessor.
         **/
        System.out.println("\n ************************** ANTEDCESSOR E SUCESSOR *****************\n");
        int num;
        Scanner receber = new Scanner(System.in);
        System.out.print("Entre com um número: ");
        num = receber.nextInt();
        receber.close();
        System.out.printf("O Antecessor de %d é %d \n", num,num -1);
        System.out.printf("O Sucessor de %d é %d", num,num +1);

    }
}
