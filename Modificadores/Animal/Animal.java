// Classe Animal
class Animal {
    protected void emitirSom() {
        System.out.println("O animal faz um som.");
    }
}

// Classe Cachorro que herda de Animal
class Cachorro extends Animal {
    @Override
    protected void emitirSom() {
        System.out.println("O cachorro está latindo.");
    }
}


