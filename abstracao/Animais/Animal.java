package Animais;

// Classe abstrata
abstract class Animal {
    // Método abstrato
    public abstract void som();

    // Método normal
    public void dormir() {
        System.out.println("Zzz...");
    }
}

// Subclasse Cachorro
class Cachorro extends Animal {
    @Override
    public void som() {
        System.out.println("O cachorro faz: au au!");
    }
}

// Subclasse Gato
class Gato extends Animal {
    @Override
    public void som() {
        System.out.println("O gato faz: miau!");
    }
}

