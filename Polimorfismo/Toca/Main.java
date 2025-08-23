package Toca;

public class Main {
    public static void main(String[] args) {
        Instrumento[] instrumentos = new Instrumento[3];

        instrumentos[0] = new Violao();
        instrumentos[1] = new Piano();
        instrumentos[2] = new Violino();

        for (Instrumento i : instrumentos) {
            i.tocar();
        }
    }
}
