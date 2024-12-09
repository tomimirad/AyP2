package pruebasJava;

public class Gerente extends Empleado {
  private int valorHora;
  public Gerente(String nombre, int dni,int cantHoras, int valorHora){
    super(nombre, dni, cantHoras);
    this.valorHora = valorHora;
  }

  public void sueldo(){
  }
}
