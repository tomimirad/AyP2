package pruebasJava;

public class Estudiante {
  public String nombre;
  public int[] notas;

  public Estudiante(String nombre, int[] notas){
    this.nombre = nombre;
    this.notas = notas;
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public String getNombre(String nombre){
    return this.nombre = nombre;
  }

  public void setNotas(int[] notas){
    this.notas = notas;
  }
  public int[] getNotas(int[] notas){
    return this.notas = notas;
  }

  public int getPromedio(){
    int prom = 0;
    for (int i = 0; i < notas.length; i++) {
      prom += this.notas[i];
    }
    return prom/this.notas.length;
  }
}

