package TP3;
import java.util.Scanner;
public class eje7 {
  public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    System.out.println("ingrese los 3 lados de su triangulo");
    int lado1 = lector.nextInt();
    int lado2 = lector.nextInt();
    int lado3 = lector.nextInt();
    System.out.println("ingrese la base y la altura de su triangulo");
    int base = lector.nextInt();
    int altura = lector.nextInt();
    int perimetro = lado1+lado2+lado3;
    int area = (base*altura)/2;
    System.out.println("el perimitro de su triangulo es: "+perimetro);
    System.out.println("el area de su triangulo es: "+area);
  }
}
