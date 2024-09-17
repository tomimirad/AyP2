package TP5;
import java.util.Arrays;
import java.util.Random;
// Una concesionaria de autos tiene 10 sucursales, numeradas de 1 a 10, y vende 6 
// tipos de vehículos, numerados de 1 a 6. 
// Al final de cada mes, desea sacar una estadística de ventas, y para ello procesa la 
// información de todas las facturas de ese mes en la siguiente forma:
// Se desea: 
// a. Visualizar la información agrupada por número de sucursal, detallando por 
// cada una la cantidad de unidades vendidas. 
// b. Cuál fue la sucursal que más vehículos vendió 
// c. Cuál fue el vehículo más vendido. 

public class eje15 {
  public static void main(String[] args) {
    final int fila = 3,col = 6;
    Random random = new Random();
    int[][] concesionaria = new int[fila][col];
    int cantMax = 0;
    int cantMax2 = 0;
    int sucursal = 0;
    int vehiculo = 0;

    //lleno de datos la concesionaria
      for (int i = 0; i < col; i++) {
        concesionaria[0][i] = random.nextInt(10)+1;
      }
      for (int i = 0; i < col; i++) {
        concesionaria[1][i] = random.nextInt(6) + 1;
      }
      for (int i = 0; i < col; i++) {
        concesionaria[2][i] = random.nextInt(15) + 1;
      }
      
      //sucursal que mas vendio
      cantMax = concesionaria[2][0];
      sucursal = concesionaria[0][0];
      for (int i = 1; i < col; i++) {
        if (concesionaria[2][i] > cantMax) {
          cantMax = concesionaria[2][i];
          sucursal = concesionaria[0][i];
        }
      }
      //vehiculo mas vendido
      vehiculo = concesionaria[1][0];
      cantMax2 = concesionaria[2][0];
      for (int i = 1; i < col; i++) {
        if (concesionaria[2][i] > cantMax2) {
          cantMax2 = concesionaria[2][i];
          vehiculo = concesionaria[1][i];
        }
      }

      //leo los datos y los muestro en forma de tabla
      System.out.printf("%-15s %-15s %-15s\n","numero sucursal","tipo de auto","cantidad vendida");
      for (int j = 0; j < col; j++) {
        System.out.printf("%-15s %-15s %-15s\n",concesionaria[0][j],concesionaria[1][j],concesionaria[2][j]);
      }
      // System.out.println(Arrays.deepToString(concesionaria));
      System.out.println("la sucursal: "+ sucursal + " vendio: "+cantMax+ " unidades");
      System.out.println("el vehiculo: "+ vehiculo + " fue el mas vendio");
  }
}
