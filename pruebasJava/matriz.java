package pruebasJava;
import java.util.Scanner;
import java.util.Arrays;

public class matriz {
  public static void main(String[] args) {
    // int [][] matriz = {
    //   {4,3,2,1},
    //   {3,5,4,1},
    //   {2,0,9,8},
    //   {1,2,3,4}
    // };
    int[][] edificios = new int[8][10];
    int auxi = 0;
    for (int i = 0; i < 8; i++) {
      for (int j = 0; j < 10; j++) {
        edificios[i][j] = (int) (10*Math.random());
    }
  }
  for (int i = 1; i < 8; i++) {
    for (int j = 1; j < 10; j++) {
      if (edificios[i][j] > auxi) {
        auxi = edificios[i][j];
        System.out.println("el edificio "+(i+1)+" en el departamento " + (j) +" tiene " + edificios[i][j]+" quejas");
      }
    }
  }
  System.out.println(auxi);
    // Scanner lector = new Scanner(System.in);
    // System.out.println("ingrese el numero de la fila que desea ver");
    // int fila = lector.nextInt();
    // for (int i = 0; i < matriz.length; i++) {
    //   System.out.println("los elementos de la fila" + fila + " son: " +matriz[fila][i] );
    // }

    // for (int i = 0; i < matriz.length; i++) {
    //   for (int j = 0; j < matriz.length; j++) {
    //     if (matriz[i][j] % 2 == 0 ) {
    //       System.out.println("la posicion "+i+" tiene el nuemero par: "+matriz[i][j]);
    //     }
    //   }
    // }
  }
}
