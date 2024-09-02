package TP4;
import java.util.Scanner;
public class eje8 {
  // Escribir un programa que calcule el factorial de un número entero leído por teclado.
  // ej: factorial de 4 = 4x3x2x1 = 24
  public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    System.out.println("ingrese un numero para sacar su factorial");
    int factor = lector.nextInt();
    int acum = 1;
      for (int i = 1; i <= factor; i++) {        
        acum *=i;
      }
      System.out.println("factorial de "+factor+"="+acum);
  }
}
