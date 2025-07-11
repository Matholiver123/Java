public class idade {
    static void verificarMaiorIdade(int idade){
        if (idade  >= 18) {
            System.out.println("Maior de idade");
        }else{
            System.out.println("Menor de idade");
        }
    } 
    static void main(String[] args){
       verificarMaiorIdade(17);
       verificarMaiorIdade(20);
       verificarMaiorIdade(10);
       
    }
   }
