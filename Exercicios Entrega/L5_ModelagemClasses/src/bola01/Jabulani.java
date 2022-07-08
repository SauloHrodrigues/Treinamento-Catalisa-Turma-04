package bola01;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Jabulani {
    public static void main(String[] args) {
        Bola bola = new Bola(10,"vermelha", "estrela",25);
        System.out.println("Execício 01 - parte 2 - primeira lista - Chamada Jabulani");
        System.out.println("Atualmente a bola tem a cor : "+bola.mostraCor());
        System.out.println();
        System.out.println("digite a nova cor: ");
        Scanner input = new Scanner(System.in);
        bola.trocaCor(input.next());
        input.close();
        System.out.println("************************************************************");
        System.out.println("A nova cor escolhida foi: "+ bola.mostraCor());
    }
}
