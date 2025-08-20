public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        c1.numero = 123;
        c1.cpf = "123.456.789-00";

        c1.depositar(500);
        c1.exibirSaldo();

        c1.depositar(200);
        c1.exibirSaldo();
    }
}
