package jardinagem;

public class Jardinagem {
    public String nomeJardim;
    public float qtdMetros;
    public int qtdPlantas;
    public float qtdMetrosGrama;
    public float kilosAdubo;
    public double valorAdubo;
    public double valorMetroGrama;
    public double valorConteGrama;

    public void usarAdubo(){
        //(a cada 2 metros de grama usa-se 100 gramas de adubo - calcule quanto de adubo usar)
        kilosAdubo=(qtdMetrosGrama*100)/2;
    }
    public void precoAdubo(){
        // resultado do usarAdubo  * valorAdubo)
        valorAdubo = kilosAdubo*valorAdubo;
    }
    public void precoCorteGrama(){
        //(valorConteGrama = qtdMetrosGrama * valorMetroGrama)
        valorConteGrama = qtdMetrosGrama * valorMetroGrama;
    }
}
