package TP6;
import java.util.Scanner;
// Escribir una función que determine la potencia a partir de una base y su exponente. 
public class eje5 {
    public static Integer potencia(int n,int exp){
        int acum = 1;
        for (int i = 0; i < exp; i++) {
            acum *= n;
        }
        return acum;
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese el numero y el exponente");
        int numero = lector.nextInt();
        int exponente = lector.nextInt();
        System.out.println("el resultado: " + potencia(numero, exponente));
    }
}
