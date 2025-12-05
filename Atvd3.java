import java.util.Scanner;

public class Atvd3 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        int[] vetorOriginal = new int[5];

        for (int i = 0; i < vetorOriginal.length; i++) {
            System.out.printf("Digite o %d° número: ", i + 1);
            if (ler.hasNextInt()) {
                vetorOriginal[i] = ler.nextInt();
            } else {
                System.out.println("Entrada inválida. Digite um número inteiro.");
                ler.next();
                i--; 
            }
        }

        int[] vetorInvertido = new int[vetorOriginal.length];

        for (int i = 0; i < vetorOriginal.length; i++) {
            vetorInvertido[i] = vetorOriginal[vetorOriginal.length - 1 - i];
        }

        System.out.print("\nVetor original: [");
        for (int i = 0; i < vetorOriginal.length; i++) {
            System.out.print(vetorOriginal[i]);
            if (i < vetorOriginal.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        System.out.print("Vetor invertido: [");
        for (int i = 0; i < vetorInvertido.length; i++) {
            System.out.print(vetorInvertido[i]);
            if (i < vetorInvertido.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        ler.close();
    }
}