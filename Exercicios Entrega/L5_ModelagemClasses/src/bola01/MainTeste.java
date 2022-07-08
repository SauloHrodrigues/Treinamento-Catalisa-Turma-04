package bola01;
        /*
        exercicio 01 - Classe Bola: Crie uma classe que modele uma bola, toda bola contém uma circunferência, cor,
        marca e velocidade. Após a modelagem, instanciar objetos diferentes no método main para testes.
         */

public class MainTeste {
    public static void main(String[] args) {
        Bola bolaVermelha = new Bola(10,"vermelha", "estrela",25);
        Bola bolaAzul = new Bola(5,"azul", "marca02",5);
        Bola bolaBranca = new Bola(15,"branca", "marca023",50);

        System.out.println("1º Objeto - Bola Vermelha: ");
        System.out.println("Circunferência da bola: "+ bolaVermelha.getCircunferencia());
        System.out.println("Cor da bola: "+ bolaVermelha.getCor());
        System.out.println("Marca da bola: "+ bolaVermelha.getMarca());
        System.out.println("Velocidade da bola: "+ bolaVermelha.getVelocidade());
        System.out.println("====================================================");

        System.out.println("2º Objeto - Bola Azul: ");
        System.out.println("Circunferência da bola: "+ bolaAzul.getCircunferencia());
        System.out.println("Cor da bola: "+ bolaAzul.getCor());
        System.out.println("Marca da bola: "+ bolaAzul.getMarca());
        System.out.println("Velocidade da bola: "+ bolaAzul.getVelocidade());
        System.out.println("====================================================");

        System.out.println("3º Objeto - Bola ranca: ");
        System.out.println("Circunferência da bola: "+ bolaBranca.getCircunferencia());
        System.out.println("Cor da bola: "+ bolaBranca.getCor());
        System.out.println("Marca da bola: "+ bolaBranca.getMarca());
        System.out.println("Velocidade da bola: "+ bolaBranca.getVelocidade());
        System.out.println("====================================================");
    }
}
