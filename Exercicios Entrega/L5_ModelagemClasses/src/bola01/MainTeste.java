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
        System.out.println("Circunferência da bola: "+ bolaVermelha.circunferencia);
        System.out.println("Cor da bola: "+ bolaVermelha.cor);
        System.out.println("Marca da bola: "+ bolaVermelha.marca);
        System.out.println("Velocidade da bola: "+ bolaVermelha.velocidade);
        System.out.println("====================================================");

        System.out.println("2º Objeto - Bola Azul: ");
        System.out.println("Circunferência da bola: "+ bolaAzul.circunferencia);
        System.out.println("Cor da bola: "+ bolaAzul.cor);
        System.out.println("Marca da bola: "+ bolaAzul.marca);
        System.out.println("Velocidade da bola: "+ bolaAzul.velocidade);
        System.out.println("====================================================");

        System.out.println("3º Objeto - Bola ranca: ");
        System.out.println("Circunferência da bola: "+ bolaBranca.circunferencia);
        System.out.println("Cor da bola: "+ bolaBranca.cor);
        System.out.println("Marca da bola: "+ bolaBranca.marca);
        System.out.println("Velocidade da bola: "+ bolaBranca.velocidade);
        System.out.println("====================================================");
    }
}
