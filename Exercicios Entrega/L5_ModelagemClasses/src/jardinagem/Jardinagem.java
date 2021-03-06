package jardinagem;

public class Jardinagem {
    private String nomeJardim;
    private float qtdMetros;
    private int qtdPlantas;
    private float qtdMetrosGrama;
    private float kilosAdubo;
    private double valorAdubo;
    private double valorMetroGrama;
    private double valorConteGrama;

    public String getNomeJardim() {
        return nomeJardim;
    }

    public void setNomeJardim(String nomeJardim) {
        this.nomeJardim = nomeJardim;
    }

    public float getQtdMetros() {
        return qtdMetros;
    }

    public void setQtdMetros(float qtdMetros) {
        this.qtdMetros = qtdMetros;
    }

    public int getQtdPlantas() {
        return qtdPlantas;
    }

    public void setQtdPlantas(int qtdPlantas) {
        this.qtdPlantas = qtdPlantas;
    }

    public float getQtdMetrosGrama() {
        return qtdMetrosGrama;
    }

    public void setQtdMetrosGrama(float qtdMetrosGrama) {
        this.qtdMetrosGrama = qtdMetrosGrama;
    }

    public float getKilosAdubo() {
        return kilosAdubo;
    }

    public void setKilosAdubo(float kilosAdubo) {

        this.kilosAdubo = kilosAdubo;
    }

    public double getValorAdubo() {

        return valorAdubo;
    }

    public void setValorAdubo(double valorAdubo) {
        this.valorAdubo = valorAdubo;
    }

    public double getValorMetroGrama() {
        return valorMetroGrama;
    }

    public void setValorMetroGrama(double valorMetroGrama) {
        this.valorMetroGrama = valorMetroGrama;
    }

    public double getValorConteGrama() {
        return valorConteGrama;
    }

    public void setValorConteGrama(double valorConteGrama) {
        this.valorConteGrama = valorConteGrama;
    }

    public void usarAdubo(){
        //(a cada 2 metros de grama usa-se 100 gramas de adubo - calcule quanto de adubo usar)
        kilosAdubo= (float) (valorAdubo/1000)*(qtdMetros/2);
        System.out.println("kilos adubos"+kilosAdubo);
    }
    public void precoAdubo(){
        // resultado do usarAdubo  * valorAdubo)
        valorAdubo = valorAdubo * kilosAdubo;
        System.out.println("valor adubo"+valorAdubo);
    }
    public void precoCorteGrama(){
        //(valorConteGrama = qtdMetrosGrama * valorMetroGrama)
        valorConteGrama = qtdMetrosGrama * valorMetroGrama;
    }
}
