package TP7;
// Escribir una función recursiva y una iterativa para calcular el N-ésimo coeficiente del
// polinomio de HERMITE, que resulta de la siguiente definición:
// H0(X) = 1
// H1(X) = 2*X
// Hi(X) = 2*X*Hi-1(X) - 2*(i-1)*Hi-2(X)

public class eje5 {
  public static double recursivaH(int n){
    double x = 1.0;
    if (n == 0) {
      System.out.println("hola");
      return 1;
    } else if (n == 1) {
      return 2*x;
    } else {
      return 2*x*recursivaH(n-1) - 2*(n-1)*recursivaH(n-2);
    }
  }
  public static int iterativaH(int n){
    return 0;
  }
  public static void main(String[] args) {
    int numero = 3;
    System.out.println(recursivaH(numero));
  }
}
