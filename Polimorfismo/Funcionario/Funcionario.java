package Funcionario;
public class Funcionario {
    String nome;
    double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double calcularBonus() {
        return 0; // será sobrescrito pelas subclasses
    }

    public void mostrarBonus() {
        System.out.println(nome + " - Bônus: " + calcularBonus());
    }
}
