package TP6;
import java.util.Scanner;
// Escribir una función que determine si un número es capicúa. 

public class eje4 {
    public static Integer invertir(int n){
        String pasarTexto = String.valueOf(n);
        String invertidor = new StringBuilder(pasarTexto).reverse().toString();
        int numeroInvertido = Integer.parseInt(invertidor);
        return numeroInvertido;
    }
    public static String capicua(int n){
        int llamado = invertir(n);
        String vericado = (llamado == n ) ? "Es capicua":"no es capicua";
        return vericado;
    }
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese un numero para verificar si es capicua");
        int numero = lector.nextInt();
        System.out.println(capicua(numero));

    }
}
