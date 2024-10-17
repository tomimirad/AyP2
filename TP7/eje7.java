package TP7;
// Realizar una función recursiva que a partir de una cadena de texto imprima todos los
// caracteres leídos en orden inverso
public class eje7 {
  public static void inverso(String cadena){
    if (cadena.isEmpty()) {
      return;
    }
    System.out.println(cadena.charAt(cadena.length()-1));
    inverso(cadena.substring(0, cadena.length()-1));
  }
  public static void main(String[] args) {
    String cadena = "hola";
    inverso(cadena);
  }
}
