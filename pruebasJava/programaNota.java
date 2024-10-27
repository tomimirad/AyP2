package pruebasJava;
import java.util.Scanner;
//realizar un un programa que permita cargar por los menos 50 alumnos con su nombre y sus 5 notas,
//ordenar los nombres de  forma descendiente
//ordenar los promedios de forma ascendente.
public class programaNota {
  public static void ordenarNombre(Estudiante[] curso){
    final int N = curso.length;
 //
  for (int i = 0; i < N - 1; i++) {
 //
  int pos = i;
 //
  // for (int j = i + 1; j < N; j++) {
  // if (curso[j].getNombre() > curso[pos].getNombre()) {
  //   pos = j;
  // }
  // }
 //
  Estudiante aux = curso[i]; 
  curso[i] = curso[pos];
  curso[pos] = aux;
  }

  }
  public static Estudiante[] cargarEstudiantes(Estudiante[] curso){
    Scanner lector = new Scanner(System.in);
    int[] notas = new int[5];
    for (int i = 0; i < curso.length; i++) {
      System.out.println("ingrese el nombre del estudiante");
      String nombre = lector.nextLine();
      System.out.println("ingrese las notas");
      notas[0] = lector.nextInt();
      notas[1] = lector.nextInt();
      notas[2] = lector.nextInt();
      notas[3] = lector.nextInt();
      notas[4] = lector.nextInt();
      Estudiante alumno = new Estudiante(nombre, notas);
      curso[i] = alumno;
    }
    return curso;
  }
  public static void main(String[] args) {
    Estudiante[] curso = new Estudiante[50];
    cargarEstudiantes(curso);
  }
}

