package TP6;
// Escribir una función que a partir de un arreglo retorne la posición del mayor 
// elemento. 
// Ej: 
// int[] arreglo = {3, 0, 2, 5, 1, 2}; 
// int pos = mayor(arreglo); 
// El resultado de pos será 3 dado que el mayor elemento se encuentra en la 
// posición 3. 
public class eje12 {
  public static Integer mayorPos(int[] n) {
    int max = n[0];
    int pos = 0;
    for (int i = 1; i < n.length; i++) {
      if (n[i] > max) {
        pos = i;
      }
    }
    return pos;
  }
  public static void main(String[] args) {
    int[] vector = {3, 0, 2, 5, 1, 2};
    int resultado = mayorPos(vector);
    System.out.println(resultado);
  }
}
