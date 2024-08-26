package TP3;

public class eje2 {
    // Escribe un programa que declare 5 variables de tipo char. A continuación, crear otra 
    // variable como cadena de texto y prueba de asignar como valor a esta última la 
    // concatenación de las anteriores 5 variables de caracteres. Por último, mostrar la cadena 
    // de caracteres por pantalla. 
    public static void main(String[] args) {
        char caracter1 = 'a',caracter2 = 'b',caracter3 = 'c',caracter4 = 'd',caracter5 = 'e';
        //lo solucione utilizando el metodo valueOf() para convertir los caracteres en cadena de texto y los guarde en esta variable llamada texto
        String texto = String.valueOf(caracter1)+String.valueOf(caracter2)+String.valueOf(caracter3)+String.valueOf(caracter4)+String.valueOf(caracter5);
        System.out.println(texto.toUpperCase());
    }
}
