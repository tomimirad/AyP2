package TP8;

import java.util.Arrays;

// . Realizar una función que ordene los elementos de un vector de forma ascendente.
// Ej: void ordenar(int[ ] vector)
// vector = {10,4,2,6,20,1}
// vector = {1,2,4,6,10,20}
public class eje1 {
    public static void ordenar(int[] vector){
        final int N = vector.length;
        for (int i = 0; i < N - 1; i++) {
            int pos = i;
        for (int j = i + 1; j < N; j++) {
            if (vector[j] < vector[pos]) {
                pos = j;
            }
 }
        int menor = vector[pos];
        vector[pos] = vector[i];
        vector[i] = menor;
    }
    System.out.println(Arrays.toString(vector));

    }
    public static void main(String[] args) {
        int[] vector = {10,4,2,6,20,1};
        ordenar(vector); 
    }
}
