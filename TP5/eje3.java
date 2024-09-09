package TP5;
import java.util.Scanner;
import java.util.Arrays;
// Escribir un programa que lea los datos de un vector de N componentes y visualice:
// a. La suma de las componentes del vector.
// b. El producto de las componentes del vector. 
public class eje3 {
  public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    final int n = 4;
    int[] vector = new int[n];
    long acum_sum = 0, acum_pro = 1;
    for (int i = 0; i < n; i++) {
      vector[i] = lector.nextInt();
      acum_sum += vector[i];
      acum_pro*= vector[i];
    }
    System.out.println(Arrays.toString(vector));
  }
}
