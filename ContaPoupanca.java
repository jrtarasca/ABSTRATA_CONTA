public class ContaPoupanca extends ContaBancaria {
    private static final double TAXA_SAQUE = 0.02; // 2% de taxa
    private static final double TAXA_DEPOSITO = 0.01; // 1% de taxa

    public ContaPoupanca(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + (valor * TAXA_SAQUE);
        if (valorComTaxa > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque.");
        } else {
            saldo -= valorComTaxa;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
        exibirSaldo();
    }

    @Override
    public void depositar(double valor) {
        double valorComTaxa = valor - (valor * TAXA_DEPOSITO);
        saldo += valorComTaxa;//Adiciona o valor com a taxa ao saldo da conta e exibe uma mensagem
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        exibirSaldo();
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Consulta de saldo com taxa aplicada.");
        exibirSaldo();
    }
}
