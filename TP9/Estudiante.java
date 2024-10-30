package TP9;

import java.util.Arrays;

public class Estudiante {
    public String nombre;
    public int[] notas;

    public Estudiante(String nombre, int[] notas){
        this.nombre = nombre;
        this.notas = notas;
    }
    public Estudiante(){
        nombre = "";
        notas = new int[5];
    }

    public double getPromedio(){
        int suma = 0;
        double promedio = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += this.notas[i];
        }
        promedio = suma/notas.length;
        return promedio;
    }
    public void infoEstudiante(){
        System.out.println("NOMBRE: "+ this.nombre);
        System.out.println("NOTAS: "+Arrays.toString(this.notas));
        System.out.println("PROMEDIO: "+ getPromedio());
    }
}
