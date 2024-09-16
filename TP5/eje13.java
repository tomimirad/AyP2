package TP5;
import java.util.Arrays;
import java.util.Random;
// Dada una matriz de M filas por N columnas, generar un vector columna que tenga la 
// suma de cada fila.
public class eje13 {
  public static void main(String[] args) {
    final int N = 3,M=4;
    Random random = new Random();
    int[][] matriz = new int[N][M];
    int[] vector = new int[N];
    int total = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < M; j++) {
        matriz[i][j] = random.nextInt(10);
      }
    }
      for (int i = 0; i < N; i++) {
        total = 0;
        for (int j = 0; j < M; j++) {
          total += matriz[i][j];
          vector[i] = total;
        }
      }
      System.out.println(Arrays.deepToString(matriz));
      System.out.println(Arrays.toString(vector));
  }
}
