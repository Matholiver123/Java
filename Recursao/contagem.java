public class contagem {
    public static void IniciarContagem(int n) {
        if (n < 0 ){ 
        return;
        }
        System.out.println(n);
        IniciarContagem (n - 1);
            
        }
        public static void main(String[] args) {
         IniciarContagem (5); 
            

        }
    }
