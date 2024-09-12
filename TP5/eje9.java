package TP5;
// Dado un vector de N componentes enteros, escriba un programa que visualice: La 
// componente máxima y la posición de la misma. En caso de haber varios máximos 
// mostrar la posición de cada uno de ellos. 

public class eje9 {
    public static void main(String[] args) {
        int[] maximo = {10,4,5,2,30};
        int max = maximo[0];
        for (int i = 1; i < maximo.length; i++) {
            if (maximo[i] > max) {
                max = maximo[i];
                System.out.println("componente maxima: "+max+ " en la posicion "+i);
            } else if(maximo[i] < max) {
                System.out.println("componente maxima: "+max+" en la posicion " + i);
            }
        }
    }
}
