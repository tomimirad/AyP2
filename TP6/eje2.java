package TP6;
import java.util.Scanner;
// Escribir una función que calcule el factorial de un número N.
// Ej:
// n = 5
// resultado = factorial(n)
// El resultado será 120 dado que 1*2*3*4*5 = 120. 
public class eje2 {
    public static Integer factorial(int numero){
        int acum = 1;
        for (int i = 1; i <= numero; i++) {
            acum*= i;
        }
        return acum;
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese un numero para realizar el factorial");
        int n = lector.nextInt(); 
        int resultado = factorial(n);
        System.out.println("el factoria de "+ n + " es " + resultado);  
    }
}
