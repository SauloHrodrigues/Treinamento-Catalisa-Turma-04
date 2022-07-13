package lista006_B;

import java.util.Scanner;

public class MainFiguraGeometrica {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.printf("**************FIGURA GEOMÉTRICA***************\n\n\n");
        System.out.println("Cálculo do Quadrado: " );
        System.out.print("Digite o laddo do quadrado: ");
        float ladoQuadrado= input.nextFloat();
        Quadrado quadrado = new Quadrado(ladoQuadrado);
        quadrado.Area();
        System.out.println("A área do quadrado é: "+quadrado.getAreaQuadrado());

        System.out.println("==============================================================");
        System.out.println("Cálculo da Area do retângulo: " );
        System.out.print("Digite a base do retângulo: ");
        float baseRetangulo= input.nextFloat();
        System.out.print("Digite a altura do retângulo: ");
        float altura = input.nextFloat();
        Retangulo retangulo = new Retangulo(baseRetangulo,altura);
        retangulo.Area();
        System.out.println("A área do retângulo é: "+ retangulo.getAreaRetangulo());

        System.out.println("==============================================================");
        System.out.println("Cálculo da Area do triângulo: " );
        System.out.print("Digite a base do triângulo: ");
        float baseTriangulo= input.nextFloat();
        System.out.print("Digite a altura do triângulo: ");
        float alturaTriangulo = input.nextFloat();
        Triangulo triangulo= new Triangulo(baseTriangulo,alturaTriangulo);
        triangulo.Area();
        System.out.println("A área do triângulo é: "+ triangulo.getAreaTriangulo());

        System.out.println("==============================================================");
        System.out.println("Cálculo da Area do Circulo");
        System.out.print("Digite o raio do circulo: ");
        float raio = input.nextFloat();
        Circulo circulo = new Circulo(raio);
        circulo.Area();
        System.out.println("A área do círculo é: " + circulo.getAreaCirculo());
    }
}
