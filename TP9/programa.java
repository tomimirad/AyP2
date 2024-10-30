package TP9;
// 1. Crear una clase "Persona" con sus atributos nombre, edad y género. Definir un
// constructor que permita inicializar estos atributos al crear un objeto. Implementar un
// método para imprimir la información de la persona. 

// 2. Crear una clase "Rectángulo" con atributos privados para la base y la altura. Utilizar
// métodos de acceso (getters y setters) para acceder y modificar estos atributos de
// manera controlada. Definir métodos para calcular el área y el perímetro del rectángulo. 

// 3. Crear una clase "Estudiante" con atributos como nombre y 5 calificaciones. Definir un
// constructor para inicializar el nombre y opcionalmente las 5 calificaciones. Implementar
// métodos para calcular el promedio de calificaciones, establecer las calificaciones y
// mostrar la información del estudiante.

// 4. Crear una clase "Libro" con atributos como título, autor y año de publicación. 
// Implementar métodos para mostrar la información del libro de forma legible. Probar la 
// clase creando 2 libros, c/u con sus valores respectivos y finalmente mostrar por pantalla 
// si son iguales.

// 5. Crear una clase "Cuenta Bancaria" con atributos para el nombre del titular, el número 
// de cuenta y el saldo. Implementar métodos para depositar, retirar y consultar saldo. 

// 6. Crea una clase "Fecha" con atributos para el día, el mes y el año. Definir un método 
// para imprimir la fecha en formato DD/MM/AAAA y un método para incrementar los 
// días. 
// Ejemplo:  
// fecha = 10/02/2023 
// incrementar(10) 
// imprimir→20/02/2023 


public class programa {
   
    public static void main(String[] args) {
        // Persona persona = new Persona();
        // persona.nombre = "Tomas";
        // persona.edad = 21;
        // persona.genero = "M";
        // persona.info();
        
        // Rectangulo rectangulo = new Rectangulo();
        // rectangulo.setAltura(12);
        // rectangulo.setBase(5);
        // System.out.println(rectangulo.getArea());
        // System.out.println(rectangulo.getPerimetro());
        
        // int[] notas = {4,2,5,1,10};
        // Estudiante estudiante = new Estudiante();
        // estudiante.nombre = "Tomas";
        // estudiante.notas = notas;
        // System.out.println(estudiante.getPromedio());
        // estudiante.infoEstudiante();

        // Libro libro1 = new Libro();
        // Libro libro2 = new Libro();
        // libro1.titulo = "IT";
        // libro1.autor = "Stephen King";
        // libro1.año = "15/9/86";

        // libro2.titulo = "Resplandor";
        // libro2.autor = "Stephen King";
        // libro2.año = "28/1/77";

        // if (libro1.getAutor() == libro2.getAutor()) {
        //     System.out.println("son del mismo autor");
        // }
            
        // CuentaBanco cuenta = new CuentaBanco();
        // int dinero = 500;
        // cuenta.titular = "Tomas";
        // cuenta.nCuenta = 5554102;
        // cuenta.depositar(dinero);
        // cuenta.retirar(dinero);
        // cuenta.consultarSaldo();
            
            Fecha fecha = new Fecha();
            int dia = 12;
            int mes = 3;
            int año = 2003;
            fecha.dia = 12;
            fecha.mes = 03;
            fecha.año = 2003;
            fecha.incrementar(2);
            fecha.fecha();
            fecha.validar(dia, mes, año);

    }
}
