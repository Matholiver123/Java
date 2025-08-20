import java.util.Random;
import java.util.Scanner;

public class Boletim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite o nome do aluno:");
        String nome = scanner.nextLine();

        int nota = random.nextInt(11); 

        System.out.println("Aluno: " + nome + " tirou " + nota + " na prova.");

        scanner.close();
    }
}
