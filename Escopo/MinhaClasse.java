public class MinhaClasse {
    int  numero = 50;

    public void imprimirNumero(){
        int numero = 100;
        System.out.println("Número local:" + numero);
        System.out.println("Número instância:" + this.numero);

    }
    public static void main(String[] args) {
        MinhaClasse obj = new MinhaClasse();
        obj.imprimirNumero();
    }
}
