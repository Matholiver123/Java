package Formas;

// Classe abstrata
abstract class Forma {
    // Método abstrato
    public abstract double calcularArea();
}

// Subclasse Circulo
class Circulo extends Forma {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

// Subclasse Retangulo
class Retangulo extends Forma {
    double largura, altura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return largura * altura;
    }
}
