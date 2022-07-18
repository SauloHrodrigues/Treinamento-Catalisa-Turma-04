package Exercicio07_A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class MainContinente {
    public static void main(String[] args) {


        Continente america = new Continente("America Latina", 340, 5440, 420);
        Paises p1 = new Paises("Paraguai", 12000, 200);
        Paises p2 = new Paises("Uruguai", 5000, 120);

        america.adicionaPaises(p1);
        america.adicionaPaises(p2);

        System.out.println(america.getNomeContinente());
        System.out.println(america.getDimensaoContinente());
        System.out.println(america.getDensidadePopulacional());

        //Maior população
        List<Paises> paises = Arrays.asList(p1, p2);
        paises.forEach(p -> System.out.println("População dos paises = " + p.getPopulacao()));
        //Metodo que retorna o pais com maior de 6000
        Stream<Paises> stream = paises.stream().filter(p -> p.getPopulacao() > 5000);
        List<Paises> paisesFiltro = stream.collect(Collectors.toList());
        System.out.println("Paises com populoação maior que 6 mil = " + paisesFiltro);
        //Metodo que retorna o pais com maior de 6000

    }
}
