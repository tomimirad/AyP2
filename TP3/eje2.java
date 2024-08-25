package TP3;

public class eje2 {
    public static void main(String[] args) {
        char caracter1 = 'a';
        char caracter2 = 'b';
        char caracter3 = 'c';
        char caracter4 = 'd';
        char caracter5 = 'e';
        //lo solucione utilizando el metodo valueOf() para convertir los caracteres en cadena de texto y los guarde en esta variable llamada texto
        String texto = String.valueOf(caracter1)+String.valueOf(caracter2)+String.valueOf(caracter3)+String.valueOf(caracter4)+String.valueOf(caracter5);
        System.out.println(texto);
    }
}
