package Exercicio07;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        /*
        * 7 - Faça um Programa que receba o quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e
        *  mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda, 8%
        *  para o INSS e 5% para o sindicato, faça um programa que nos dê respectivamente:
        * 1. Salário bruto.
        * 2. Quanto pagou ao INSS.
        * 3. Quanto pagou ao sindicato.
        * 4. Qual o salário líquido do funcionário.
        */
        float valorHora;
        double inss= 0.08;
        double ir = 0.11;
        double sindicato = 0.05;
        int horasTrabalhadas;
        double  salarioBrtuto, salarioLiguido;
        Scanner recebe = new Scanner(System.in);
        System.out.println("\n************** CÁLCULO TRABALHISTA **************************\n");
        System.out.print("Entre seu salário hora: ");
        valorHora = recebe.nextFloat();
        System.out.print("Entre com as horas trabalhadas: ");
        horasTrabalhadas = recebe.nextInt();
        recebe.close();
        salarioBrtuto = valorHora * horasTrabalhadas;
        salarioLiguido = salarioBrtuto - ((salarioBrtuto*inss)+(salarioBrtuto*ir)+(salarioBrtuto*sindicato));
        System.out.println();
        System.out.printf("Você trabalhou %d horas, seu salário bruto será de R$ %.2f\n",horasTrabalhadas, salarioBrtuto);
        System.out.printf("Você deverá recolher  %.2f de INSS \n",salarioBrtuto *inss);
        System.out.printf("Você deverá recolher  %.2f de INSS \n",salarioBrtuto *ir);
        System.out.printf("Você deverá recolher  %.2f para seu sindicado \n",salarioBrtuto *sindicato);
        System.out.printf("Você deverá receber liguido a importância de: R$ %.2f \n",salarioLiguido);
   }
}
