package Livro;

import Livro.Livros;

public class Main {
    public static void main(String[] args) {
        Livros l1 = new Livros();
        l1.setTitulo("Harry Potter");
        l1.setAnoPublicacao(1968);
    
    l1.exibirLivro();
    
        // Ou usando os getters
        System.out.println("Titulo via getter: " + l1.getTitulo());
        System.out.println("Ano de publicação via getter: " + l1.getAnoPublicacao());
    
    }
}
