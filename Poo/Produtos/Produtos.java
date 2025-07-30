public class Produtos {
    //Atributos
    String nome;
    double preco;
    int quantidade;

    public void exibirInformacoes(){
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade: " + quantidade);
    
    }
    public double calcularTotalEstoque(){
        return quantidade * preco;

    }
}
