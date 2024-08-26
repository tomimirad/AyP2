package TP3;
import java.util.Scanner;
public class eje4 {
    // Escribir un programa que pida al usuario un número de 4 dígitos y visualice por
    // pantalla, en cada línea, cada dígito que lo compone. 
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese un numero de 4 digitos");
        int numero = lector.nextInt();
        //paso el numero introducido por el usuario a texto
        String traspasarAtexto = String.valueOf(numero);
        //extraigo los caracteres de a uno
        char digito1 = traspasarAtexto.charAt(0);
        char digito2 = traspasarAtexto.charAt(1);
        char digito3 = traspasarAtexto.charAt(2);
        char digito4 = traspasarAtexto.charAt(3);
        //los muestro por pantalla en lineas separadas
        System.out.println(digito1);
        System.out.println(digito2);
        System.out.println(digito3);
        System.out.println(digito4);
    }
}
