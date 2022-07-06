package Exercicio04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        /*
        * 4 - Faça um Programa que recebe o quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e
        *  mostre o total do seu salário no referido mês.
        * */
        float valorHora;
        int horasTrabalhadas;
        double salario;
        Scanner recebe = new Scanner(System.in);
        System.out.println("\n************** CÁLCULO DO SALÁRIO **************************\n");
        System.out.print("Entre seu salário hora: ");
        valorHora = recebe.nextFloat();
        System.out.print("Entre com as horas trabalhadas: ");
        horasTrabalhadas = recebe.nextInt();
        salario = valorHora * horasTrabalhadas;
        System.out.println();
        System.out.printf("Você trabalhou %d horas, deve receber a importância de R$ %.2f",horasTrabalhadas, salario);
    }
}
