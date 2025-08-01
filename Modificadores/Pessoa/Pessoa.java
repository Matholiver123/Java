 public class Pessoa {
   private String nome;
    private int idade;

    public String getNome(){
        return nome;
       }

       public void setNome(String nome){
        this.nome = nome;       
    }

    public int getIdade(){
     return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }
        public static void main(String[] args) {
            Pessoa p1 = new Pessoa();
            p1.setNome("Matheus");
            p1.setIdade(17);
        
            p1.exibirDados();
        
            // Ou usando os getters
            System.out.println("Nome via getter: " + p1.getNome());
            System.out.println("Idade via getter: " + p1.getIdade());
        
    }
}