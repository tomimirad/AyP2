package TP4;
import java.util.Scanner;
// Realizar el control de acceso a una caja fuerte. Se deben pedir números hasta que 
// coincida con el número de 4 dígitos establecido previamente. Ante cada intento 
// desacertado deberá salir un mensaje con el texto “Lo siento, intente nuevamente...”. 

public class eje9 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int contraCorrecta = 9951;
        System.out.println("ingrese la contraseña");
        int contra = lector.nextInt();
            while (contra != contraCorrecta) {
            System.out.println("lo siento, intente nuevamente...");
            contra = lector.nextInt();
        }
    if (contra == contraCorrecta) {
        System.out.println("se abrio la caja");
    }
   } 
}
