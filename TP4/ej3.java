package TP4;
import java.util.Scanner;
public class ej3 {
    // Escribir un programa que calcule el sueldo mensual de un empleado en base a las 
    // horas trabajadas y al precio de la hora. Ambos datos se deben ingresar por teclado. Se 
    // debe tener en cuenta que las primeras 40 hs se pagan al precio de la hora y las 
    // excedentes al doble.
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("ingrese las horas trabajadas:");
        int horasTrabajadas = lector.nextInt();
        System.out.println("ingrese el precio de esas horas:");
        float precioHora = lector.nextInt(); 

        if (horasTrabajadas <= 40) {
            float sueldoMes = horasTrabajadas*precioHora;
            System.out.println("el sueldo del mes es: " + sueldoMes);            
        }else {
            float sueldoMes = horasTrabajadas*precioHora;
            System.out.println("su sueldo con horas extras: " + sueldoMes*2);
        }
    }
}
