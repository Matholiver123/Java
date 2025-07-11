public class calcular {
        static double calcularMedia(double nota1, double nota2, double nota3, double nota4) {
            double media = (nota1 + nota2 + nota3 + nota4) / 4;
            return media;  

        }
    public static void main(String[] args) {
        double resultado = calcularMedia(10, 2, 6, 8);
        System.out.println("A média é: " + resultado);
        if (resultado >= 5) {
            System.out.println("Aprovado");
            
        }else{
            System.out.println("Reprovado");
        }
        

}
}