package TP5;
import java.util.Arrays;
// Escribir un programa que lea dos vectores de 30 componentes cada uno. Visualice los
// resultados de las opciones que siguen, pero sin generar un tercer arreglo:
// a. La suma.
// b. La diferencia.
// c. El producto escalar.
public class eje5 {
    public static void main(String[] args) {
    final int n = 30;
    int min = 1;
    int max = 30;
    int productoEscalar = 0;
    int suma = 0;
    int diferencia = 0;
    int[] vector1 = new int[n];
    int[] vector2 = new int[n];
    for (int i = 0; i < n; i++) {
        vector1[i] = (int)(Math.random()*(max - min + 1)) + min;
        vector2[i] = (int)(Math.random()*(max - min + 1)) + min;
    }
    //suma
    for (int i = 0; i < n; i++) {
        suma = vector1[i] + vector2[i];
    }

    //La diferencia
    for (int i = 0; i < n; i++) {
       diferencia =  vector1[i] - vector2[i];
    }

    //producto escalar
    for (int i = 0; i < n; i++) {
        productoEscalar = (vector1[i] * vector2[i]);
    }


    System.out.println("suma: "+ suma);
    System.out.println("diferencia: "+ diferencia);
    System.out.println("producto escalar: " + productoEscalar);
    
}
}