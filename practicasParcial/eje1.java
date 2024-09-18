package practicasParcial;
import java.util.Scanner;
public class eje1 {
  public static String añoBisiesto(int año){
    String mensaje = "";
    if (año%4 == 0) {
      if (año%100 ==0) {
        if (año%400 == 0) {
          mensaje = "es año bisiesto";
        } else { 
          mensaje = "no es bisiesto";
        }
      }
    }
      
    
    return mensaje;

  }
  public static void main(String[] args) {
    Scanner lector = new Scanner(System.in);
    System.out.println("ingrese el año para saber si es bisiesto");
    int año = lector.nextInt();
    System.out.println(añoBisiesto(año));
  }
}
