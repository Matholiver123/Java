package Area;

public class Main {
    public static void main(String[] args) {
        Forma[] formas = new Forma[3];

        formas[0] = new Circulo(5);
        formas[1] = new Quadrado(4);
        formas[2] = new Retangulo(6, 3);

        for (Forma f : formas) {
            System.out.println("Área: " + f.calcularArea());
        }
    }
}
