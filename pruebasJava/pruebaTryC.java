package pruebasJava;

import java.util.Scanner;

public class pruebaTryC {
  public static void main(String[] args) {
    boolean numeroOk = true;
    Scanner lector = new Scanner(System.in);
    System.out.println("ingrese algun numero");
    do {
      numeroOk = true;  
      try {
       int num = lector.nextInt();
       System.out.println(num);
      } catch (Exception e) {
        System.out.println("no se ingreso un numero, porfavor ingrese un numero");
        numeroOk = false;
      }
    } while (!numeroOk);
  }
}
