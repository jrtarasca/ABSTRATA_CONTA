public abstract class ContaBancaria {
    protected String numeroConta;
    protected double saldo;

    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    // Métodos abstratos que serão implementados 
    public abstract void sacar(double valor);
    public abstract void depositar(double valor);
    public abstract void consultarSaldo();
    
    // Método para exibir o saldo atual 
    protected void exibirSaldo() {
        System.out.println("Saldo atual: " + saldo);
    }
}
