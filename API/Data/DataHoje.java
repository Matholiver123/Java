import java.time.LocalDate;

public class DataHoje {
    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now(); 
        int ano = hoje.getYear();         

        System.out.println("Data de hoje: " + hoje);
        System.out.println("Ano atual: " + ano);
    }
}
