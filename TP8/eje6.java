package TP8;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;
// . Realizar un programa que a partir de un vector de 10 elementos, generado de forma 
// aleatoria entre 1 y 99, determine el porcentaje de acierto que tuvo el usuario para 
// acertar a un valor que contiene el arreglo. 
// Ej: arreglo = {1,6,2,8,0} 
// Valores del usuario: 
// 3: no se encuentra, intente nuevamente 
// 5: no se encuentra, intente nuevamente 
// 7: no se encuentra, intente nuevamente 
// 0: ACIERTO!!! 
// El porcentaje de acierto fue del 25%
public class eje6 {
    public static int[] numerosAleatorios(int[] vector){
        Random random = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = random.nextInt(99);
        }
        return vector;
    }
    public static int buscar(int[] vector) {
        
        int intentos = 0;
        int aciertos = 0;
        for (int i=0; i < vector.length; i++){
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero = lector.nextInt();
        if(vector[i] == numero){
            System.out.println(numero+": "+"acierto");
            aciertos++;
        return i;
        }
        }
        System.out.println(": "+"no se encuentra, intente nuevamente");
        intentos++;
        return -1;
       }
    //    public static int aciertosPorcentaje(){

    //    }

    public static void main(String[] args) {
        int[] vector = new int[10];
        
        buscar(numerosAleatorios(vector));
    }
}
