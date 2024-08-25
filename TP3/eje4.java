package TP3;
import java.util.Scanner;
public class eje4 {
    // Escribir un programa que pida al usuario un número de 4 dígitos y visualice por
    // pantalla, en cada línea, cada dígito que lo compone. 
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese un numero de 4 digitos");
        int numero = lector.nextInt();
        System.out.println(numero);
    }
}
