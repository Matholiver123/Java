import java.util.Scanner;

public class palavra_proibida {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for(int i = 1; i <= 10; i++){
            System.out.println("Digite um número");
            int numero = scanner.nextInt();
    if (numero > 0 ) {
            System.out.println("Número Positivo");
        } else if (numero < 0) {
            System.out.println("Número Negativo");
            
        }else{
        
            System.out.println("Número é zero");
        }
        
    }
    scanner.close(); 
    }
}