
public class Matrix4x4inteira {

    public static void main(String[] args) throws Exception {

        int[][] matriz = new int[4][4];

        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 4; j++) {

                matriz[i][j] = i + j;
            }
        }

        System.out.println("Matriz 4x4 preenchida com a soma dos índices (i + j):");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(String.format("%3d", matriz[i][j]));
            }

            System.out.println();
        }
    }
}
