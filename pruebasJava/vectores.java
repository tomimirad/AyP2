package pruebasJava;
import java.util.Scanner;
import java.util.Arrays;
// Permitir al usuario el ingreso de 20 valores numéricos, luego
// mostrar en pantalla aquellos elementos que tengan un valor par.
public class vectores {
  public static void main(String[] args) {
  final int n = 20;
  int[] vector = new int[n];
  Scanner lector = new Scanner(System.in);
  for (int i = 0; i < n; i++) {
    vector[i] = lector.nextInt();
  }    
  
    for (int j = 0; j < n; j++) {
      if (vector[j]%2==0) {
        System.out.println(vector[j]);
      }
    }
  
  }
}
