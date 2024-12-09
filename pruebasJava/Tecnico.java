package pruebasJava;

public class Tecnico extends Empleado{
  private int valorHora;

  public Tecnico(String nombre, int dni, int cantHoras, int valorHora){
    super(nombre, dni, cantHoras);
    this.valorHora = valorHora;
  }
}
