import java.util.Scanner;

public class SomaPositivos {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
     int soma = 0;
     int num1;
     System.out.println("Digite números positivos para somar. Digite um número negativo para parar.");

     while (true) {
        System.out.println("Digite um número negativo:");
        num1 = scanner.nextInt();
        if (num1 < 0) {
            break;
        }
        soma += num1; 
        
        }
        System.out.println("A soma total dos números positivos é: " + soma);
        scanner.close();
       
        
     }


    }