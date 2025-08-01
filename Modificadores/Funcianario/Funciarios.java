// Classe Funcionarios 
abstract class Funcionarios  {
    abstract double calcularSalario();
}
// Classe Programador
class Programador extends Funcionarios  {
    @Override
    double calcularSalario() {
        return 5000.0;
    }
}
