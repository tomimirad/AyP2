package TP5;
import java.util.Arrays;
public class eje1 {
  // Definir un vector de 10 elementos. Asignar valores aleatorios a los elementos pares.
  // Mostrar por pantalla. ¿Qué pasó con los valores no asignados? 
  public static void main(String[] args) {
    final int n = 10;
    double [] vector = new double[n];
    for (int i = 0; i < vector.length; i+=2) {
      vector[i] = Math.random();
    }
    System.out.println(Arrays.toString(vector));
  }
}
