package TP5;
import java.util.Arrays;
import java.util.Scanner;
// Leer un vector que representa la temperatura de cada día del mes de junio. Visualizar
// por pantalla la temperatura más baja, la más alta y los días en que se produjeron
// respectivamente. 
public class eje7 {
  public static void main(String[] args) {
    int[] junio = new int[30];
    Scanner lector = new Scanner(System.in);
    int max = junio[0];
    int min = junio[0];
    for (int i = 0; i < junio.length; i++) {
      // System.out.println("ingrese la temperatura del dia: "+(i+1));
      // junio[i] = lector.nextInt();
      junio[i] = (int)(50*Math.random());
    }

    for (int i = 1; i < junio.length; i++) {
        if (junio[i] > max) {
          max = junio[i];
        }
        if (junio[i] < min) {
          min = junio[i];
          System.out.println("hola" + min);
        }
    }
    System.out.println(Arrays.toString(junio));
    System.out.println("temperatura alta: "+ max);
    System.out.println("temperatura baja "+ min);
  }
}
