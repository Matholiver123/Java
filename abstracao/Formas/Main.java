package Formas;

// Classe Main para testar
public class Main {
    public static void main(String[] args) {
        Forma f1 = new Circulo(5); // raio = 5
        Forma f2 = new Retangulo(4, 6); // largura = 4, altura = 6

        System.out.println("Área do círculo: " + f1.calcularArea());
        System.out.println("Área do retângulo: " + f2.calcularArea());
    }
}

