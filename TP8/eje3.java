package TP8;
import java.util.Scanner;
import java.util.Arrays;
// Realizar un programa que pida al usuario 10 valores y muestre por pantalla los
// elementos ordenados de menor a mayor (ascendentes).
//{5,3,10,40,30,20,50,356,49,90}
public class eje3 {
    public static int[] cargarNumeros(){
        int[] numeros = new int[10];
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("ingrese 10 numeros");
            int numero = lector.nextInt();
            numeros[i] = numero;
        }
        return numeros;
    }
    public static void ordenar(int[] numeros){
        final int N = numeros.length;
        for (int i = 0; i < N - 1; i++) {
            int pos = i;
        for (int j = i + 1; j < N; j++) {
            if (numeros[j] < numeros[pos]) {
                pos = j;
            }
 }
        int menor = numeros[pos];
        numeros[pos] = numeros[i];
        numeros[i] = menor;
    }
    System.out.println(Arrays.toString(numeros));
    }
    public static void main(String[] args) {
        ordenar(cargarNumeros());
    }
}
