public class Carros {
    // Atributos
    String modelo;
    String cor;
    int ano;

    // Métodos
    public void exibirDados(){
        System.out.println("Modelo do carro:" + modelo);
        System.out.println("Cor do carro:" + cor);
        System.out.println("Ano de fabricação:" + ano);
    }
    public void ligar(){
        System.out.println("O carro está ligado.");
    }
}
