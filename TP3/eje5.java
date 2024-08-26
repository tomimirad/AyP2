package TP3;
import java.util.Scanner;
public class eje5 {
  // Realizar un conversor de dólares a pesos. La cantidad de dólares debe ser introducida 
  // por teclado.
  public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    System.out.println("ingrese la cantidad de dolares");
    float dolar = lector.nextInt();
    //realizo la convercion y lo guardo en esta variable
    double dolarApesos = dolar*949.42;
    //la muestro por pantalla
    System.out.println("la cantidad de dolares a pesos es: "+dolarApesos);
  }
}
