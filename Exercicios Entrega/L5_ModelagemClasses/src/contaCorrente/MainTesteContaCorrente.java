package contaCorrente;

public class MainTesteContaCorrente {
    public static void main(String[] args) {
        System.out.println("Testando a classe conta corrente");
        String numeroConta = "0002222333-4";
        String nomeCorrentista = "Saulo Henrique Rodrigues";
        double saldoConta= 1.00;
        ContaCorrente contaCorrente = new ContaCorrente(numeroConta,nomeCorrentista,saldoConta);

        System.out.println("Conta corrente vcom saldo:");
        System.out.println("Conta com Saldo :");
        System.out.println("Número da conta: " + contaCorrente.numeroConta);
        System.out.println("Nome do correntista: " + contaCorrente.nomeCorrentista);
        System.out.println("Saldo da conta: " + contaCorrente.saldo);
        System.out.println("-------------------------------------------------------");

        ContaCorrente contaCorrenteSemSaldo = new ContaCorrente(numeroConta,nomeCorrentista);

        System.out.println("Conta corrente vcom saldo:");
        System.out.println("Conta com Saldo :");
        System.out.println("Número da conta: " + contaCorrenteSemSaldo.numeroConta);
        System.out.println("Nome do correntista: " + contaCorrenteSemSaldo.nomeCorrentista);
        System.out.println("Saldo da conta: " + contaCorrenteSemSaldo.saldo);
        System.out.println("-------------------------------------------------------");
    }
}
