package TP6;
import java.util.Scanner;
// Escribir un programa que pida al usuario en el formato DDMM y escriba en la pantalla 
// si la fecha es correcta o no. Analice: 
// a. Que el mes es correcto (Es decir, entre 1 y 12). 
// b. Que el día es correcto, según el mes
public class eje8 {
  public static String vericadorDiayMes(int D,int M){
    String mensaje = "";
    int diaMax = 0;
    if (M >= 1 && M <= 12) {
      switch (M) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
          diaMax = 31;
          break;
        case 4: case 6: case 9: case 11:
          diaMax = 30;
          break;
        case 2:
          diaMax = 28;
          break;
        default:
          break;
      }
    }
    if (D < 1 || D > 31) {
      mensaje = "no es correcto";
    } else {
      mensaje = "es correcto";
    }
    return mensaje;
  }
  public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    System.out.println("ingrese el dia y mes para verificar si son correctos");
    int dia = lector.nextInt();
    int mes = lector.nextInt();
    System.out.println(vericadorDiayMes(dia, mes));
  }
}
