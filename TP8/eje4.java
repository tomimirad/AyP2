package TP8;
import java.util.Scanner;
import java.util.Arrays;
// Idem al anterior pero ahora los elementos deberán estar ordenados de manera
// descendente. 
//{5,3,10,40,30,20,50,356,49,90}

public class eje4 {
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
            if (numeros[j] > numeros[pos]) {
                pos = j;
            }
 }
        int mayor = numeros[pos];
        numeros[pos] = numeros[i];
        numeros[i] = mayor;
    }
    System.out.println(Arrays.toString(numeros));
    }
    public static void main(String[] args) {
        ordenar(cargarNumeros());
    }
}
