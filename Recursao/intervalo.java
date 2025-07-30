public class intervalo {
    public static int SomarIntervalo(int inicio, int fim){
    if (inicio > fim ){ 
        return 0;
        }else{
            return inicio + SomarIntervalo(inicio + 1, fim);
        }
    }
    public static void main(String[] args) {
       int resultado = SomarIntervalo(3, 7);
       System.out.println(resultado);
    }
}