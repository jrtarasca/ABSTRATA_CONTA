public class Main {
    public static void main(String[] args) {
        ContaBancaria poupanca = new ContaPoupanca("7777", 1000);
        ContaBancaria corrente = new ContaCorrente("7778", 1001, 500);

        System.out.println("\nConta Poupança:");
        poupanca.consultarSaldo();
        poupanca.depositar(500.0);
        poupanca.sacar(50);
        poupanca.sacar(1500.0); // Tentativa de saque maior que o saldo
        
        System.out.println("\nConta Corrente:");
        corrente.consultarSaldo();
        corrente.depositar(200);
        corrente.sacar(2000); // Saque que utiliza o limite
        corrente.sacar(2000); // Excede saldo + limite
    }
}
