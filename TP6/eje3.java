package TP6;
import java.util.Scanner;
// Escribir una función que calcule el resto de la división.
// Ej:
// resto = mod(10, 3);
// El resto será 1 dado que 10 divido 3 da como resto 1. 
public class eje3 {
    public static Integer mod(int num1, int num2){
        return num1%num2;
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int nuemro1 = lector.nextInt();
        int nuemro2 = lector.nextInt();
        int resultado = mod(nuemro1, nuemro2);
        System.out.println("el modulo de " + nuemro1+" divido " +nuemro2+ " es " + resultado);
    }
}
