package TP6;
import java.util.Arrays;
import java.util.Random;
// Escribir un programa que asigne valores a un arreglo de N componentes y luego 
// determine cuál es el mayor de ellos, imprimiendo por pantalla la posición y el valor. 
// Nota: puede utilizar valores aleatorios o solicitar el ingreso al usuario.
public class eje13 {

  public static int[] rellenarVector(int[]n) {
    Random random = new Random();
      for (int i = 0; i < n.length; i++) {
        n[i] = random.nextInt(40)+1;
      } 
        return n;
  }
  
  public static String mayor(int[]n){
      int max = n[0];
      int pos = 0;
      int numero = 0;
      for (int i = 1; i < n.length; i++) {
        if (n[i] > max) {
          max = n[i];
          pos = i;
          numero = n[i];
        }
      }
    return "en la posicion " + pos+" tiene el numero mas grande que es "+numero;
  }
  public static void main(String[] args) {
    int[] vector = new int[6];
    System.out.println(Arrays.toString(rellenarVector(vector)));
    String elementoMayor = mayor(vector);
    System.out.println(elementoMayor);
  }
}
