package TP6;
import java.util.Random;
import java.util.Arrays;
// Escribir una función que asigne a un arreglo de N componentes valores aleatorios. 
// Ej: 
// int[] arreglo = new int[3]; 
// asignarValores(arreglo); 
// Al retornar el arreglo tendrá sus elementos con valores aleatorios. 
public class eje10 {
  public static void aleatorio(int[] n){
    Random random = new Random();
      for (int i = 0; i < n.length; i++) {
        n[i] = random.nextInt(10)+1;
        System.out.println(n[i]);
      }
  }
  public static void main(String[] args) {
    int[] vector = new int[5];
    aleatorio(vector);
  }
}
