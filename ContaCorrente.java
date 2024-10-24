public class ContaCorrente extends ContaBancaria {
    private static final double TAXA_SAQUE = 0.02; //taxa
    private static final double TAXA_DEPOSITO = 0.02; //taxa
    private double limite; // limite após o saldo acabar

    public ContaCorrente(String numeroConta, double saldoInicial, double limite) {
        super(numeroConta, saldoInicial);
        this.limite = limite;
    }

    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + (valor * TAXA_SAQUE);
        if (valorComTaxa > (saldo + limite)) {
            System.out.println("Limite insuficiente para realizar o saque.");
        } else {
            saldo -= valorComTaxa;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
        }
        exibirSaldo();
    }

    @Override
    public void depositar(double valor) {
        double valorComTaxa = valor - (valor * TAXA_DEPOSITO);// Calcula o valor final do depósito após a aplicação da taxa
        saldo += valorComTaxa;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
        exibirSaldo();
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Consulta de saldo com taxa aplicada.");
        exibirSaldo();
    }
}
