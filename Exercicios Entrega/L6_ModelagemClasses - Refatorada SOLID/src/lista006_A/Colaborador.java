package lista006_A;

public interface Colaborador {

    String getNome();
    String getCpf();
    String getOrgaoLotacao();
    void executarReembolso(double valorReembolso);
}
