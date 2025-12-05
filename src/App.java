import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        String[][] nomeCompleto = {
            {"Mykael", "Igor", "Maria", "Luiz", "Isabelly"},
            {"Mythel", "Coutinho", "Feitosa", "Sandrini", "Felix"}
        };
        System.out.println(nomeCompleto[0][0] + " " + nomeCompleto[1][0]);
    }
}
