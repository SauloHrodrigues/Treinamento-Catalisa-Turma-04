package jardinagem;

import java.sql.SQLOutput;
import java.util.Scanner;

public class MainJardinagem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Jardinagem jardim = new Jardinagem();
        boolean sair = false;
        System.out.printf("************* Cálculos de Gastos para Jardim ************\n\n");
       // System.out.print("Digite o nome do jardim: ");
        //jardim.setNomeJardim(input.next());
        System.out.print("Digite a Metragem (metros quadrado): ");
        jardim.setQtdMetros(input.nextFloat());
        System.out.print("Digite o valor pago pelo quilo do adubo: ");
        jardim.setValorAdubo(input.nextFloat());
       // jardim.usarAdubo();
        jardim.precoCorteGrama();
        System.out.println("resutado kilos de adubos: "+jardim.getKilosAdubo());
        /*System.out.print("Digite o valor do metro da grama: ");
        jardim.setValorConteGrama(input.nextDouble());
        System.out.print("Digite o valor do corte da grama: ");
        jardim.setValorMetroGrama(input.nextDouble());
        while (sair == false) {
            System.out.println("------------------------------------------------");
            System.out.println("| Ecolha uma opção:                            |");
            System.out.println("| 1 - Quantidade de adubo a ser usado          |");
            System.out.println("| 2 - Quanto será quasto em adubo:             |");
            System.out.println("| 3 - Quanrto será gasto com o corte de grama: |");
            System.out.println("| 0 - Sair                                     |");
            System.out.println("------------------------------------------------");
            System.out.println();
            System.out.print("Digite a opção: ");
            int opcao = input.nextInt();
            if (opcao ==1){
                System.out.printf("Será usado %.2f de adubo\n\n", jardim.getKilosAdubo());
            }else if (opcao == 0){
                sair = true;
            }else{
                sair = false;
            }
        }*/
        input.close();
    }
}
