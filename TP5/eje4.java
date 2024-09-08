package TP5;
import java.util.Scanner;
// Escribir un programa que lea los datos de un vector de N componentes y visualice:
// a. El producto de los elementos menores que 10.
// b. La cantidad de elementos menores que 10.
// c. El promedio de los impares.  
public class eje4 {
  public static void main(String[] args) {
    final int n = 4;
    int[] vector = new int[n];
    int acum_pro = 1;
    int acum_impar = 0;
    int cantMenores = 0;
    int promedio = 0;
    Scanner lector = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      System.out.println("ingrese los valores de su vector");
      vector[i] = lector.nextInt();
      if (vector[i] < 10) {
          acum_pro*=vector[i];
          cantMenores++;
          System.out.println("el producto de los numeros menores que 10: " + acum_pro);
          System.out.println("la cantidad de  numeros menores que 10: " + cantMenores);
      }
      if (vector[i] % 2 != 0 ) {
        acum_impar+= vector[i];
        promedio = acum_impar/n;
        System.out.println("el promedio de los numeros impares: " + promedio);
      }
    }
  }
}
