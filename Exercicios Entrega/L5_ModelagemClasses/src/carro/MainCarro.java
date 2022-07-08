package carro;

import java.util.Scanner;

public class MainCarro {
    public static void main(String[] args) {
        String qtdePortas;
        String modelo;
        String marca;
        Scanner input = new Scanner(System.in);
        System.out.println("Manipulação da classe carro - lista 01 - parte 1 - mexercicio 04");
        System.out.print("Quantas Portas têm seu carro: ");
        qtdePortas= input.next();
        System.out.print("Qual é o modelo do seu carro: ");
        modelo= input.next();
        System.out.print("Qual é a marca do seu carro: ");
        marca= input.next();
        input.close();
        Carro carro = new Carro(qtdePortas,modelo,marca);
        System.out.println("========================================================================");
        System.out.println("O carro tem : "+ carro.getQtdePortas() + " é do medelo: "+ carro.getModelo()
                +" marca: "+ carro.getMarca() + " e sua potencia: " + carro.getPotencia());
    }
}
