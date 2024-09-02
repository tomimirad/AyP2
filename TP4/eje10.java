package TP4;

import java.util.Scanner;

public class eje10 {
      public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int contraCorrecta = 9951;
        int intentos = 4;
        for (int i = 0; i < intentos; i++) {
            System.out.println("ingrese la contra");
            int contra = lector.nextInt();
            if (contra == contraCorrecta) {
                System.out.println("se abrio la caja");
                break;
            }else {
                System.out.println("lo siento, intente denuevo");
            }
        }
        System.out.println("llamando a la policia");
        
   } 
}
