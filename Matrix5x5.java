
public class Matrix5x5 {

    public static void main(String[] args) {
        final int TAMANHO = 5;
        int[][] matriz = new int[TAMANHO][TAMANHO];

        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                matriz[i][j] = i + j;
            }
        }

        System.out.println("Matriz 5x5 preenchida (i + j):");
        for (int i = 0; i < TAMANHO; i++) {
            for (int j = 0; j < TAMANHO; j++) {
                System.out.print(String.format("%3d", matriz[i][j]));
            }
            System.out.println();
        }

        System.out.println("\nElementos da Diagonal Principal (onde i == j):");

        for (int i = 0; i < TAMANHO; i++) {
            System.out.println(String.format("matriz[%d][%d] = %d", i, i, matriz[i][i]));
        }

    }
}

