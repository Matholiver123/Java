package Produtos;

public class Produto {
    private String nome;
    private double preco;
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    
    public double getPreco() { return preco; }
    public void setPreco(double preco) {
        if (preco >= 1.00) {
            this.preco = preco;
        } else {
            System.out.println("Preço inválido. Deve ser no mínimo R$ 1,00.");
        }
    }
    

    public void exibirProduto(){
      System.out.println("Produto: " + nome);
      System.out.println("Preço: " + preco);

    }
}
