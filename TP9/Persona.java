package TP9;

public class Persona {
    String nombre;
    int edad;
    String genero;
    public Persona(){
        this.nombre = "Hola";
        this.edad = 0;
        this.genero = "";
    }
    public Persona(String nombre,int edad, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getEdad(){
        return this.edad;
    }
    public String getGenero(){
        return this.genero;
    }
    public void info(){
        System.out.println("nombre"+": "+ this.nombre);
        System.out.println("edad"+": "+ this.edad);
        System.out.println("genero"+": "+ this.genero);
    }
}
