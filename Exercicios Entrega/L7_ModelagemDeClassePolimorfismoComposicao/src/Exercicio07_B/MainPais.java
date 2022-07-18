package Exercicio07_B;

public class MainPais {
    public static void main(String[] args) {
        System.out.println("******* VERIFICAÇÃO DE PAISES VIZINHOS************");
        Pais brasil = new Pais("BR", "brasil", 8516000L, 214828540L);
        Pais argentina = new Pais("ARG", "Argentina", 2780000L, 45808747);
        Pais chile = new Pais("CHI", "Chile", 756950L, 19034571);
        Pais paraguai = new Pais("PRY", "Paraguai", 406752L, 7133000L);
        brasil.addFronteira(paraguai);
        brasil.addFronteira(argentina);
        argentina.addFronteira(brasil);
        argentina.addFronteira(paraguai);
        argentina.addFronteira(chile);
        chile.addFronteira(argentina);
        paraguai.addFronteira(brasil);
        paraguai.addFronteira(argentina);
        boolean b = paraguai.fazFronteira(brasil);
        System.out.println("Faz Frnteira: " + b);
        System.out.println("BRASIL **********************");
        System.out.println("Código ISO: " + brasil.getCodigoISO());
        System.out.println("Nome: " + brasil.getNomePais());
        System.out.println("Dimenssão do pais: " + brasil.getDimensaoPais());
        System.out.println("Densidade populacional: " + brasil.calcularDensidadePopulacional());
        brasil.vizinhanca(argentina);
        brasil.vizinhanca(chile);
        brasil.vizinhanca(paraguai);
        System.out.println();


//        System.out.println("ARGENTINA **********************");
//        System.out.println("Código ISO: " + argentina.getCodigoISO());
//        System.out.println("Nome: " + argentina.getNomePais());
//        System.out.println("Dimenssão do pais: " + argentina.getDimensaoPais());
//        System.out.println("Densidade populacional: " + argentina.calcularDensidadePopulacional());
//        argentina.vizinhanca(brasil);
//        argentina.vizinhanca(chile);
//        argentina.vizinhanca(paraguai);
//        System.out.println();
//
//        System.out.println("CHILE **********************");
//        System.out.println("Código ISO: " + chile.getCodigoISO());
//        System.out.println("Nome: " + chile.getNomePais());
//        System.out.println("Dimenssão do pais: " + chile.getDimensaoPais());
//        System.out.println("Densidade populacional: " + chile.calcularDensidadePopulacional());
//        chile.vizinhanca(brasil);
//        chile.vizinhanca(argentina);
//        chile.vizinhanca(paraguai);
//        System.out.println();
//
//        System.out.println("PARAGUAI **********************");
//        System.out.println("Código ISO: " + paraguai.getCodigoISO());
//        System.out.println("Nome: " + paraguai.getNomePais());
//        System.out.println("Dimenssão do pais: " + paraguai.getDimensaoPais());
//        System.out.println("Densidade populacional: " + paraguai.calcularDensidadePopulacional());
//        paraguai.vizinhanca(brasil);
//        paraguai.vizinhanca(argentina);
//        paraguai.vizinhanca(chile);
//        System.out.println();
    }
}
