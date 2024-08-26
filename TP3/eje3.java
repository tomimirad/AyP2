package TP3;
import java.util.Scanner;
public class eje3 {
    // Pedir por pantalla el nombre y apellido de una persona. Mostrar por pantalla como
    // serían sus iniciales. Asuma que la persona sólo tiene un nombre y un apellido.
    // Ej.: Alfonzo Zarate → AZ  0 al 6
    
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre completo");
        Scanner lector = new Scanner(System.in);
        String nombreCompleto = lector.nextLine();
        char caracter1 = nombreCompleto.charAt(0);
        char caracter2 = nombreCompleto.charAt(6);
        System.out.println(String.valueOf(caracter1).toUpperCase()+String.valueOf(caracter2).toUpperCase());
    }
}
