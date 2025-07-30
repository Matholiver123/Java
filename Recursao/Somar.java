public class Somar {
    public static int somarAte(int n) {
        if (n <= 0) return 0;
        return n + somarAte(n - 1);
    }
    public static void main(String[] args) {
        int resultado = somarAte(5);
        System.out.println(resultado); 
    }        

  }
