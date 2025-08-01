// Classe Felinos
class Felinos {
    protected void emitirSom() {
        System.out.println("O Felino faz um som.");
    }
}

// Classe Gato que herda de Felino
class Gato extends Felinos {
    @Override
    protected void emitirSom() {
        System.out.println("O Gato está Miando.");
    }
}





