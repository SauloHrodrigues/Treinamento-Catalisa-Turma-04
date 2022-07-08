package contaCorrente;

public class ContaCorrente {
    public String nomeCorrentista;
    public String numeroConta;
    public double saldo;

    public ContaCorrente(String nomeCorrentista, String numeroConta, double saldo) {
        this.nomeCorrentista = nomeCorrentista;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaCorrente(String nomeCorrentista, String numeroConta) {
        this.nomeCorrentista = nomeCorrentista;
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }
}
