package TP7;

import java.util.Scanner;

public class eje9 {
  public static void inversoNum(int numero){
    if (numero == 0) {
      return;
    } else {
      inversoNum(numero/10);
      System.out.println(numero%10+" ");
    }
  }
  public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    System.out.println("ingrese un numero entero positivo");
    int numero = lector.nextInt();
    inversoNum(numero);
  }
}
