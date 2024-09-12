package TP5;
import java.util.Scanner;
// Dado un valor en Pesos: 
// Escribir un programa que visualice por pantalla la cantidad mínima de billetes 
// de 2000, 1000, 500, 100, 50, 20 y 10 que se necesitan para generar ese valor. 
// Ej. $9670 

public class eje8 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int[] billetes = {2000,1000,500,100,50,20};
        System.out.println("ingrese el valor en pesos");
        int valor = lector.nextInt();
        for (int i = 0; i < billetes.length; i++) {
            int division = valor/billetes[i];
            valor%=billetes[i];
            System.out.println(division+" billetes"+" de "+billetes[i]);
        }
    }
}
