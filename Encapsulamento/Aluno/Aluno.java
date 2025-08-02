public class Aluno {
    private String nome;
    private double nota;

    public String GetNome(){
      return nome;
    } 

    public void SetNome(String nome){
     this.nome = nome;
    } 
    
    public double GetNota(){
       return nota;
    }
    public void SetNota(double nota){
         this.nota = nota;
    }

    public void exibirDados(){
        System.out.println("Seu nome: " + nome);
        System.out.println("Sua nota é: " + nota);
    }
}
