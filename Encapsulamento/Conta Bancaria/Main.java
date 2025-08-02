public class Main {
    //Método main
    public static void main(String[] args) {
        ContaBancaria c1 = new ContaBancaria();

        c1.SetNumerodaconta("12345");
        c1.depositar(500);
        c1.sacar(200);
        c1.exibirInformacoes();




    }


}
