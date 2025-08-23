package Funcionario;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Gerente("Matheus", 5000));
        funcionarios.add(new Programador("Nicolas", 3000));
        funcionarios.add(new Estagiario("Lincoln", 1500));

        for (Funcionario f : funcionarios) {
            f.mostrarBonus();
        }
    }
}