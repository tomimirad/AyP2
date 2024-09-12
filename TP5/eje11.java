package TP5;
// Dada una matriz cuadrada de N x N elementos enteros, con N dato y N <= 10, escribir 
// un programa que calcule y visualice por pantalla: 
// a. La cantidad de elementos nulos que existen en la diagonal principal 
// b. La cantidad de elementos nulos que existen en la diagonal secundaria.
// c. La cantidad de elementos nulos que existen en el triángulo inferior. 
// d. La cantidad de elementos nulos que existen en el triángulo superior. 
// e. La matriz y su traspuesta 
// f. Si es o no una matriz simétrica. 
// g. Si es o no la matriz identidad.  

public class eje11 {
  public static void main(String[] args) {
    int[][] matriz = new int[3][3];
    int m = 0;
    int m2 = 0;
    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        matriz[i][j] = (int) (10*Math.random());
      }
    }
  }
}
