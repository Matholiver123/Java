public class Gerante extends Funcionario {
   String departamento;

   @Override
  public void mostraSalario() {
      // TODO Auto-generated method stub
      System.out.println(this.departamento);
      super.mostraSalario();
  }
}
