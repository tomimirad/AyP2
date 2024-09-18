package TP6;
import java.util.Scanner;
// Escribir una función que retorne el día de la semana a partir del número de día. 
// Ej: 
// n = 2 
// dia = diaDeSemana(n) 
// El día será “martes” dado que el 1 corresponde al lunes, el 2 al martes y así 
// sucesivamente hasta el 7 que corresponde al domingo. 
public class eje7 {
  public static String diaSemana(int n){
    String dia = "";
    switch (n) {
      case 1:
        dia = "lunes";
        break;
      case 2:
        dia = "martes";
        break;
      case 3:
        dia = "miercoles";
        break;
      case 4:
        dia = "jueves";
        break;
      case 5:
        dia = "viernes";
        break;
      case 6:
        dia = "sabado";
        break;
      case 7:
        dia = "domingo";
        break;
      default:
        System.out.println("ingrese un dia valido entre 1 y 7");
        break;
    }
    return dia;
  }
  public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    System.out.println("ingrese un numero de dia de la semana");
    int numero = lector.nextInt();
    System.out.println(diaSemana(numero));
  }
}
