package TP5;
import java.util.Arrays;
public class eje2 {
  // public static void main(String[] args) {
  //   int [] vector = new int[11];
  //   for (int i = 0; i < vector.length; i++) {
  //       vector[i] = i;
  //   }
  //   System.out.println(Arrays.toString(vector));
  // }
  public static void main(String[] args) {
    int[] vector = new int[11];
    int acum = 0;
    for (int i = 1; i < vector.length; i++) {
      acum+=i;
      vector[i] = acum;
    }
    System.out.println(Arrays.toString(vector));
  }
}
