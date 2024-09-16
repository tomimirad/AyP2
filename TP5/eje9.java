package TP5;
import java.util.Arrays;
// Dado un vector de N componentes enteros, escriba un programa que visualice: La 
// componente máxima y la posición de la misma. En caso de haber varios máximos 
// mostrar la posición de cada uno de ellos. 

public class eje9 {
    public static void main(String[] args) {
        // final int n = 10;
        // int[] maximo = new int[n];
        int[] maximo = {30,10,23,30,10,9};
        int max = maximo[0];
        // for (int i = 0; i < maximo.length; i++) {
        //     // maximo[i] = (int) (30*Math.random());
        // }

        
        for (int i = 0; i < maximo.length; i++) {
            if (maximo[i] >= max) {
                max = maximo[i];
                System.out.println("componente maxima: "+max+ " en la posicion "+i);
            }
        }
    }
}
