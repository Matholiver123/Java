public class filme {
    String titulo;
    String genero;
    int ano;

    public filme(String titulo, String genero, int ano) {
        this.titulo = titulo;
        this.genero = genero;
        this.ano = ano;
    }

    public void exibirFilme() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + genero);
        System.out.println("Autor: " + ano);

    }


} 