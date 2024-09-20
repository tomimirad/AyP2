package TP6;
import java.util.Scanner;
import java.util.Arrays;
// Escribir una función que pida al usuario valores para un arreglo de N componentes. 
// Ej: 
// int[] arreglo = new int[3]; 
// leerValores(arreglo); 
// Al retornar el arreglo tendrá sus elementos con los valores del usuario. 
public class eje11 {
  public static int[] rellenarVector(int[]n) {
    Scanner lector = new Scanner(System.in);
    System.out.println("ingrese 5 valores para guardar en este vector");
      for (int i = 0; i < n.length; i++) {
        n[i] = lector.nextInt();
      } 
        return n;
  }
  public static void main(String[] args) {
    int[] vector = new int[5];
    System.out.println(Arrays.toString(rellenarVector(vector)));
  }
}
