package pruebasJava;
import java.util.Arrays;
//dado un vector y un numero k, rotar los elementos del vector k posiciones hacia a la izquierda. si el vector fuese [1,2,3,4,5] y k es 2, el resultado deberia ser [3,4,5,1,2]
public class vectores2 {
  public static void main(String[] args) {
    int k = 2;
    int[] vector = new int[5];
    vector[0] = 1;
    vector[1] = 2;
    vector[2] = 3;
    vector[3] = 4;
    vector[4] = 5;
    for (int i = 0; i < vector.length; i++) {
      System.out.println(Arrays.toString(vector));
    }
  }
}
