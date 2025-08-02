package Estudantes;

public class Main {
    public static void main(String[] args) {
        Estudante e1 = new Estudante();
        e1.setNome("Elisa");
        e1.setNota(10);

        e1.exibirInformacoes();

        System.out.println("Nome via getter: " + e1.getNome());
        System.out.println("Nota via getter: " + e1.getNota());

    }
    
}
