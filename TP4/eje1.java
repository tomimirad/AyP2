package TP4;
import java.util.Scanner;
public class eje1 {
    // Escribir un programa que dado un número del 1 al 7 escriba el correspondiente 
    // nombre del día de la semana.
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese un numero para saber el dia");
        int dia = lector.nextInt();
        // for (int dia = 1; dia <= 7; dia++) {
        // }
        if (dia==1) {
            System.out.println("lunes");
        } else if (dia==2) {
            System.out.println("martes");
        } else if (dia==3) {
            System.out.println("miercoles");
        } else if (dia==4) {
            System.out.println("jueves");
        } else if (dia==5) {
            System.out.println("viernes");
        } else if (dia==6) {
            System.out.println("sabado");
        }else if (dia==7) {
            System.out.println("domingo");   
        } else{
            System.out.println("ese numero no esta ligado a un dia de la semana, por favor ingrese un numero correspondiente");
        }
    }       
}
