package bola;

import bola.Bola;

import java.util.Scanner;

public class Jabulani {
    public static void main(String[] args) {
        Bola jabuti = new Bola();
        Scanner input = new Scanner(System.in);
        System.out.print("Digite a cor da bola: ");
        jabuti.cor = input.next();
        System.out.print("Digite a circunferência da bola: ");
        jabuti.circunferencia = input.nextFloat();
        System.out.print("Digite a Marca da bola: ");
        jabuti.marca = input.next();
        System.out.println("A cor da bola está: "+jabuti.mostraCor());
        jabuti.mostraCor();
        System.out.print("Deseja mudar a cor da bola? s/n");
        String mudarCor = input.next();
        if (mudarCor.equalsIgnoreCase("s")){
            System.out.print("Digite a nova cor desejada: ");
            mudarCor = input.next();
            jabuti.TrocaCor(mudarCor);
        }
        String corFinal = jabuti.mostraCor();
        System.out.println("A cor finaL ficou: "+ corFinal);

        input.close();
    }
}
