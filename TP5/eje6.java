package TP5;
import java.util.Arrays;
import java.util.Scanner;
// Se lee información que indica la cantidad de hectáreas sembradas cada día del mes 
// de enero. Informe los días en que se sembró menos que el promedio del mes. 
public class eje6 {
    public static void main(String[] args) {
        int[] enero = new int[32];
        Scanner lector = new Scanner(System.in);
        for (int i = 0; i < enero.length; i++) {
            System.out.println("ingrese la cantidad de hectareas sembradas:");
            enero[i] = lector.nextInt();    
        }
        // System.out.println(Arrays.toString(enero));
    }
}
