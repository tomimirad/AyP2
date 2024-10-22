package TP7;
import java.util.Scanner;
// . Realizar una función recursiva que lea una serie de caracteres hasta encontrar un
// carácter igual a “F” y luego imprima todos los caracteres leídos en orden inverso. 
public class eje8 {
    public static void caracterF(){
        Scanner lector = new Scanner(System.in);
        char caracter = lector.next().charAt(0);
        if (caracter == 'f') {
            System.out.println("ghola");
            return;
        }
        caracterF();
        System.out.println(caracter);
    }
    public static void main(String[] args) {
      
        caracterF();
    }
}
