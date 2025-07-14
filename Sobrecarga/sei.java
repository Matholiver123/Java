public class sei {

    

public static void saudacao() {
    System.out.println("Olá, visitante!");
  }

  public static void saudacao(String nome) {
    System.out.println("Olá, " + nome + "!");
  }

  public static void main(String[] args) {
    saudacao();
    saudacao("Matheus");
  }
}