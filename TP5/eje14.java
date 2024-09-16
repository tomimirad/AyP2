package TP5;
import java.util.Arrays;
import java.util.Random;
// Dada una matriz de M filas por N columnas, generar un vector columna que tenga el 
// máximo de cada fila
public class eje14 {
  public static void main(String[] args) {
    final int N=3, M=4;
    Random random = new Random();
    int[][] matriz = new int[N][M];
    int[] vector = new int[N];
    int max = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        matriz[i][j] = random.nextInt(10);
      }
    }
    for (int i = 0; i < N; i++) {
      max = matriz[i][0];
      for (int j = 1; j < M; j++) {
        if (matriz[i][j] > max) {
          max = matriz[i][j];
          vector[i] = max;
        }
      }
    }
    System.out.println(Arrays.deepToString(matriz));
    System.out.println(Arrays.toString(vector));
}
}
