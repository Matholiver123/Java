public class Main {

public static void main(String[] args) {
    Aluno a1 = new Aluno();
    a1.SetNome("Matheus");
    a1.SetNota(9.5);

    a1.exibirDados();

    // Ou usando os getters
    System.out.println("Nome via getter: " + a1.GetNome());
    System.out.println("Nota via getter: " + a1.GetNota());

}
}