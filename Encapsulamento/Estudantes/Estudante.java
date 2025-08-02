package Estudantes;

public class Estudante {
    private String nome;
    private int nota;

     public String getNome() { 
        return nome; 
    }
    public void setNome(String nome) { 
        this.nome = nome;
     }
    
     public int getNota() { return nota; }

     public void setNota(int nota) {
         if (nota >= 0 && nota <= 10) {
             this.nota = nota;
         } else {
             System.out.println("Nota inválida. A nota deve estar entre 0 e 10.");
         }
     }
     
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Sua nota será " + nota);

    }
}
