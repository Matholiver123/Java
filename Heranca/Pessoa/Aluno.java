public class Aluno extends Pessoa {
    String matricula;

    @Override
    public void mostrarDados() {
        super.mostrarDados();     
        System.out.println(this.matricula);
    }
    
}
