package TP6;
// Escribir una función que retorne la suma de 2 números.
// Ej:
// a = 123
// b = 210
// resultado = suma(a,b)
// El resultado será 333. 
import java.util.Scanner;
public class eje1 {

    public static Integer suma(int a,int b){
        return a + b;
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese 2 numeros para realizar la suma"); 
        int num1 = lector.nextInt();
        int num2 = lector.nextInt();
        int resultado = suma(num1, num2) ;
        System.out.println("el resultado sera "+ resultado);       
    }
}
