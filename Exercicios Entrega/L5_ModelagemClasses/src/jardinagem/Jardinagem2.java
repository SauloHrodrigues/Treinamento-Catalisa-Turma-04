package jardinagem;

public class Jardinagem2 {
    private String nomeJardim;
    private float qtdMetros;
    private int qtdPlantas;
    private float qtdMetrosGrama;
    //private float kilosAdubo;
    private double valorKiloAdubo;
    private double valorMetroGrama;
    private double valorCorteGrama;

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

//    public float getKilosAdubo() {
//        return kilosAdubo;
//    }
//
//    public void setKilosAdubo(float kilosAdubo) {
//
//        this.kilosAdubo = kilosAdubo;
//    }

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

    public float calcularQtdAduboKilos(){
        //(a cada 2 metros de grama usa-se 100 gramas de adubo - calcule quanto de adubo usar)
        return (qtdMetrosGrama*50)/1000f;
    }
    public double calcularPrecoAdubo(){
        // resultado do usarAdubo  * valorAduboKilo)
        return (this.calcularQtdAduboKilos()*this.valorKiloAdubo);
    }
    public void precoCorteGrama(){
        //(valorConteGrama = qtdMetrosGrama * valorMetroGrama)
        //valorConteGrama = qtdMetrosGrama * valorMetroGrama;
    }
}
