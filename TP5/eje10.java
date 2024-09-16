package TP5;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Set;
// . Escribir un programa que lea los elementos de dos vectores de N y M componentes 
// enteros. Cada uno representa los elementos de un conjunto. Suponga que los elementos 
// que se ingresan no se encuentran repetidos. Hallar y visualizar por pantalla: 
// a. La unión. 
// b. La intersección.
public class eje10 {
    
    public static void main(String[] args) {
        int[] A = {1,2,3,4};
        int[] B = {5,2,6,8,3,9};
        Set<Integer> union = new HashSet<>();
        Set<Integer> conjunto1 = new HashSet<>();
        Set<Integer> conjunto2 = new HashSet<>();
        for (Integer i : A) {
           union.add(i);
           conjunto1.add(i); 
        }
        for (Integer i : B) {
            union.add(i);
            conjunto2.add(i);
        }
        conjunto1.retainAll(conjunto2);
        System.out.println(union);
        System.out.println(conjunto1);
        
    }
}
