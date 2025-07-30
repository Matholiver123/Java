public class contar {
    public static void contarProgressivamente(int atual, int limite){
        if (atual > limite ){ 
            return;
            }
            System.out.println(atual);
            contarProgressivamente(atual + 1, limite);
    }
    public static void main(String[] args) {
        contarProgressivamente(0, 5);

    }
}