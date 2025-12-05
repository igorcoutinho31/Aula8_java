import java.util.Scanner;

public class Atvd1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n; 

        System.out.print("Quantidade de notas: ");

        if (!ler.hasNextInt()) {
            System.out.println("Entrada inválida. Por favor, digite um número inteiro.");
            ler.close();
            return;
        }

        n = ler.nextInt();

        if (n <= 0) {
            System.out.println("A quantidade de notas deve ser maior que zero.");
            ler.close();
            return;
        }

        double[] notas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Nota %d: ", i + 1);

            while (!ler.hasNextDouble()) {
                System.out.print("Valor inválido. Digite um número para a nota: ");
                ler.next();
            }
            
            notas[i] = ler.nextDouble();
        }

        double soma = 0.0;
        for (int i = 0; i < n; i++) {
            soma += notas[i];
        }

        double media = soma / n;

        int acima = 0;
        for (int i = 0; i < n; i++) {
            if (notas[i] > media) {
                acima++;
            }
        }

        System.out.println("\n--- Resultados ---");
        System.out.printf("Média das notas: %.2f%n", media);
        System.out.printf("Alunos com notas acima da média: %d%n", acima);

        ler.close();
    }

}
