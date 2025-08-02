package Produtos;

public class Main {
    public static void main(String[] args) {
        Produto p1 = new Produto();
        p1.setNome("Caneta");
        p1.setPreco(2.50);
    
        p1.exibirProduto();
    
        // Ou usando os getters
        System.out.println("Nome via getter: " + p1.getNome());
        System.out.println("Nota via getter: " + p1.getPreco());
    
    }
}
