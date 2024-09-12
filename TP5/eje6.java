package TP5;
import java.util.Arrays;
import java.util.Scanner;
// Se lee información que indica la cantidad de hectáreas sembradas cada día del mes 
// de enero. Informe los días en que se sembró menos que el promedio del mes. 
//para sacar el promedio es la suma de todas hectareas sembradas de los dias del mes de enero divido por la cantidad de dias que tiene el mes de enero (31)
public class eje6 {
    public static void main(String[] args) {
        int[] enero = new int[32];
        double hec_promedio = 0;
        double res_promedio = 0;
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < enero.length; i++) {
            System.out.println("ingrese la cantidad de hectareas sembradas en el dia: " + (i+1));
            enero[i] = lector.nextInt();
        }
        for (int i = 0; i < enero.length; i++) {
            hec_promedio+= enero[i];    
        }
        res_promedio = hec_promedio/31;
        System.out.println("el promedio: " + res_promedio);
        for (int i = 0; i < enero.length; i++) {
            if (enero[i] < res_promedio) {
                System.out.println("dia "+(i+1)+": "+enero[i] +" hectareas" );
            }
        }
    }
}
