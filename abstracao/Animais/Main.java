package Animais;

// Classe Main
public class Main {
    public static void main(String[] args) {
        Animal a1 = new Cachorro();
        Animal a2 = new Gato();

        a1.som();
        a1.dormir();

        a2.som();
        a2.dormir();
    }
}

