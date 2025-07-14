public class idade {
    public static void VerificarIdade(int idade) {
        if (idade >= 18) {
            System.out.println("Maior de Idade");            
        }else{
            System.out.println("Menor de idade");
        }
    }
    public static void VerificarIdade (String nome, int idade){
       if (idade >= 18) {
        System.out.println(nome + " tem " + idade + " anos e é maior de idade.");
        
       }else{
        System.out.println(nome + " tem " + idade + " anos e é menor de idade.");
       }
    }
    


    public static void main(String[] args) {
        VerificarIdade(17);
        VerificarIdade("Matheus", 17);
      }
    }

    
