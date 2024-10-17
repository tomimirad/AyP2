package TP7;
// Escribir una función recursiva que calcule el producto de dos enteros a partir de la
// suma de sus argumentos. 
public class ej1 {
  public static int producto(int n1,int n2){
    if (n2 == 0) {
      return 0;
    } else {
        return n1 + producto(n1, n2-1);
    }
  }
  public static void main(String[] args) {
    int num1 = 5;
    int num2 = 3;
    System.out.println(producto(num1, num2));
  }
}
