public class nao {
    public static void main(String[] args) {
        int valor = 10;
        {
            int valor = 20; 
            System.out.println(valor);
        }
        System.out.println(valor);
    }
}
