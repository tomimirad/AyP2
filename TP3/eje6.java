package TP3;
import java.util.Scanner;
public class eje6 {
  // Escribir un programa que calcule el perímetro y área de un rectángulo. Los datos 
  // deben leerse desde el teclado. 
  public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    System.out.println("ingrese la longitud y el ancho del rectangulo: ");
    //guardo la longitud y el ancho del rectangulo para sacar el perimetro y el area
    int longitud = lector.nextInt();
    int ancho = lector.nextInt();
    //realizo la operacion para sacar el perimetro y el area
    int perimetro = 2*longitud+2*ancho;
    int area = longitud*ancho;
    //muestro el perimetro por pantalla
    System.out.println("el perimetro de un rectangulo es: "+perimetro +"m");
    //muestro el area por pantalla
    System.out.println("el area de un rectangulo es: "+area +"cm²");
  }
}
