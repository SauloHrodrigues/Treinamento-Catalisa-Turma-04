package caixa;

public class Caixa {
    public double saldoConta;

    public Caixa(double saldoConta) {
        saldoConta=1000.00;
        this.saldoConta = saldoConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void credito (double valorCredito){
        this.saldoConta += valorCredito;
    }
    public void debito (double valorDebito){
         this.saldoConta =- valorDebito;
    }
}
