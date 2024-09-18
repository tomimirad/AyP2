package TP6;
import java.util.Scanner;
// Escribir una función que retorna la cantidad de dígito que compone un número. 
// Ej: 
// número = 223344 
// resultado = digitos(numero) 
// El resultado será 6 dado que el número se encuentra formado por 6 dígitos. 

public class eje6 {
  public static Integer contadorDigitos(int n){
    String pasarTexto = String.valueOf(n);
    int cantidadDigito = 0;
    for (int i = 0; i <= pasarTexto.length(); i++) {
      cantidadDigito = i;
    }
    return cantidadDigito;
  }
  public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    System.out.println("ingrese un numero para saber la cantidad de digitos que tiene");
    int numero = lector.nextInt();
    System.out.println("la cantidad de digitos de: "+numero+ " es: "+contadorDigitos(numero));
  }
}
