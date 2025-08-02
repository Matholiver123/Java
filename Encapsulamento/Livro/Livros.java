package Livro;

public class Livros {
    private String titulo;
     private int anoPublicacao;

     public String getTitulo() { 
        return titulo; 
    }
    public void setTitulo(String titulo) { 
        this.titulo = titulo;
     }
    
    public int getAnoPublicacao() { 
        return anoPublicacao; 
    }
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
        if (anoPublicacao >= 1990) {
            this.anoPublicacao = anoPublicacao;
        } else {
            System.out.println("não permitimos anos menores que 1900.");
        }

    }
    public void exibirLivro() {
        System.out.println("Titulo do Livor " + titulo);
        System.out.println("Ano de Publicação " + anoPublicacao);

    }
}
