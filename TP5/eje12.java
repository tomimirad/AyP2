package TP5;
import java.util.Arrays;
import java.util.Random;

// Realice un programa que permita calcular la suma, diferencia y producto de dos
// matrices, con valores numéricos.
public class eje12 {
    public static void main(String[] args) {
        final int N = 3;
        int[][] A = new int [N][N];
        int[][] B = new int [N][N];
        Random random = new Random();
        int[][] suma = new int[N][N];
        int[][] diferencia = new int[N][N];
        int[][] producto = new int[N][N];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = random.nextInt(10);
                B[i][j] = random.nextInt(10);
            }
        }
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                suma[i][j] = A[i][j] + B[i][j];
                diferencia[i][j] = A[i][j] - B[i][j];
                producto[i][j] = A[i][j] * B[i][j];
            }
        }
        // System.out.println(Arrays.deepToString(A));
        // System.out.println(Arrays.deepToString(B));
        System.out.println(Arrays.deepToString(suma));
        System.out.println("////////////////////////////////");
        System.out.println(Arrays.deepToString(diferencia));
        System.out.println("////////////////////////////////");
        System.out.println(Arrays.deepToString(producto));
    }
}
