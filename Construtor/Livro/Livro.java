public class Livro {
    String titulo;
    String autor;
    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void exibirLivro() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }

    
}
