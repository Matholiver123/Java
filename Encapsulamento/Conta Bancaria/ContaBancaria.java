public class ContaBancaria {
    private String numeroConta;
    private double saldo;

    //Get e Set do número da conta
    public String SetNumerodaConta(){
        return numeroConta;
    }
    public  void SetNumerodaconta(String numeroConta){
        this.numeroConta = numeroConta;
    }
    //Get e Set do saldo
        public double Getetsaldo(){
            return saldo;
        }

        public void Setsaldo(double saldo){
            this.saldo = saldo;
        }

        //Métodos
        public void depositar(double valor) {
            saldo += valor;
        }

        public void sacar(double valor){
           if (valor <= saldo) {
            saldo -= valor;
           }else{
            System.out.println("Saldo Indiponível!");
           }
        }

        public void exibirInformacoes() {
            System.out.println("Número da conta: " + numeroConta);
            System.out.println("Saldo atual: R$ " + saldo);
        }

    
}
