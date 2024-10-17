package TP7;
// . La función de Akerman se define en forma recursiva para enteros NO negativos:
// A(M,N) = N+1 si M=0
// A(M,N) = A(M-1 , 1) si M<>0 y N=0
// A(M,N) = A(M-1 , A(M,N-1)) si M<>0 y N<>0
// a. Demuestre que A(2,2) = 7
// b. Implemente la función. 

public class eje6 {
  public static int Akerman(int m,int n){
    if (m == 0) {
      return n+1;
    } else if (m != 0 && n == 0) {
      return Akerman(m-1, 1);
    } else{
      return Akerman(m-1, Akerman(m, n-1));
    }
  }
  public static void main(String[] args) {
    int M = 2;
    int N = 2;
    System.out.println(Akerman(M, N)); 
  }
}
