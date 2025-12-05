
import java.util.Scanner;

public class Atvd2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String[] nomes = {"Igor", "Mika", "Maria", "Breno", "Luiz", "ISabelly", "Jeany", "Helena", "Eduardo", "Julia"};

        System.out.println("Vetor de Nomes: Igor, Mika, Maria, Breno, Luiz, ISabelly, Jeany, Helena, Eduardo, Julia");

        System.out.print("Digite o nome que deseja buscar: ");
        String nomeProcurado = ler.nextLine();

        int indiceEncontrado = -1;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeProcurado)) {
                indiceEncontrado = i;
                break;
            }
        }

        if (indiceEncontrado != -1) {
            System.out.printf("Nome '%s' encontrado no índice %d%n", nomeProcurado, indiceEncontrado);
        } else {
            System.out.printf("Nome '%s' não encontrado no vetor.%n", nomeProcurado);
        }

        ler.close();
    }

}
