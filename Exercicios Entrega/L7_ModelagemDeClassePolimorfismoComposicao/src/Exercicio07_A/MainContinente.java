package Exercicio07_A;

public class MainContinente {
    public static void main(String[] args) {
        Continente america=new Continente("america latina", 13, 2500,
                340);
        america.retornaDimensaoContinente();
        System.out.println(america.getNomeContinentes());
    }
}
