public class Conta {
    int numero;
    String cpf;   // agora cpf é String
    double saldo; // precisa do saldo para controlar os depósitos

    public void depositar(double valor) {
        saldo += valor;
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}
