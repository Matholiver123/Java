public class conta {
    public static int multiplicar(int num1, int num2){
        return num1 * num2;

    }
    public static double multiplicar(double num1, int num2) {
        return num1 * num2;
    }
    public static void main(String[] args) {
        int resultado1 = multiplicar(18, 20);
        double resultado2 = multiplicar(3.5, 2);

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
    }
}
