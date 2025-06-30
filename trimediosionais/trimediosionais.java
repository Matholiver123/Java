public class trimediosionais {
    public static void main(String[] args) {
        int[][] matrizes = new int[3][3];
        int valor = 1;

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                matrizes [i][j] = valor;
                valor++;

        }
    }
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            if(i == j){
                System.out.print(matrizes[i][j] + " ");
                
        }
            
        }
        System.out.println(); 
    }
}
}