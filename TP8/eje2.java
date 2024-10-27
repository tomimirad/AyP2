package TP8;

import java.util.Arrays;

// Realizar una función que ordene utilizando el método “sort” provisto por la clase
// utilitaria Arrays. 
public class eje2 {
    public static void ordenConSort(int[] vector){
        Arrays.sort(vector);
        System.out.println(Arrays.toString(vector));
    }
    public static void main(String[] args) {
        int[] vector = {10,4,2,6,20,1};
        ordenConSort(vector);
    }
}
