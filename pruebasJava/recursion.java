package pruebasJava;

public class recursion {
  public static int Factorial(int n){
    if (n ==0 || n==1) {
      return 1;
    } else{
      return n * Factorial(n-1);
    }
  }
  public static void main(String[] args) {
    int  n = 5;
    System.out.println(Factorial(n));
  }
}
