package TP8;
// Escribir una función, cuyos parámetros serán un arreglo (desordenado) y un valor, y
// devuelva la posición donde se encuentra el valor en el arreglo. En caso de que no se
// encuentre deberá retornar -1.
// Ej: int buscar(int[ ] vector, int x) 
// int[] vector = {20,40,100,10,4,2,1}
//buscar el n 10

public class eje5 {
    public static int buscar(int[] vector, int n) {
        //
        for (int i=0; i < vector.length; i++){
        if(vector[i] == n){
        return i;
        }
        }
        //
        return -1;
       }
       public static void main(String[] args) {
        int[] vector = {20,40,100,10,4,2,1};
        int numero = 1;
        System.out.println(buscar(vector,numero));
       }
}
