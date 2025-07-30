public class fatorial {
    public static int fatorial(int n){
        if (n <= 1) return 1;
    return n * fatorial(n - 1);
        
    }
    public static void main(String[] args) {
        int resultado = fatorial(5);
        System.out.println(resultado);
    }


    }
    
