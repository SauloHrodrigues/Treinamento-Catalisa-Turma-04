package lista006_A;

public class MainTesteEstagiarios {
    public static void main(String[] args) {
        Professores girafale = new Professores("girafales","22212222222","000000000","orgao",100,"superior Completo","matematica",10,1);
        Estagiario chaves = new Estagiario("chaves","222333555","secretaria",50);
        Estagiario chiquinha = new Estagiario("chiquina","44444444444","diretoria",50);
        Estagiario quico = new Estagiario("Quico","5555555555","patio",50);
        girafale.adicionar(chaves);
        girafale.adicionar(chiquinha);
       // girafale.adicionar(quico);
    }
}
