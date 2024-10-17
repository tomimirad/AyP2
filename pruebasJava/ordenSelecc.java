package pruebasJava;

public class ordenSelecc {
  public static int[] selecc(int [] v){
    int elem1 = v[0];
    int[] nuevoVector = new int[v.length];
    for (int i = 1; i < v.length-1; i++) {
      if (v[i] < elem1) {
        int cambio = v[i];
        elem1 = cambio;
        nuevoVector[i] = cambio;
      }
    }
    return nuevoVector;
  }
  public static void main(String[] args) {
    int[] vector = {10,30,12,322,20,1};
  }
}
