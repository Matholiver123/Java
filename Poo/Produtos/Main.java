public class Main {
    public static void main(String[] args) {
   Produtos p1 = new Produtos();
   p1.nome = "Camisa";
   p1.preco = 50.0;
   p1.quantidade = 3;

p1.exibirInformacoes();
System.out.println("Valor total em estoque: " + p1.calcularTotalEstoque());

    }
}
