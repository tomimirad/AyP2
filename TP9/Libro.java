package TP9;

public class Libro {
    public String autor;
    public String titulo;
    public String año;

    public Libro(){
        titulo = "";
        autor = "";
        año = "";
    }

    public Libro(String titulo, String autor, String año){
        this.titulo = titulo;
        this.autor = autor;
        this.año = año;

    }

    public String setAutor(String autor){
        return this.autor = autor;
    }

    public String getAutor(){
        return this.autor;
    }

    public void infoLibro(){
        System.out.println("titulo: "+ this.titulo);
        System.out.println("autor: "+ this.autor);
        System.out.println("año: "+ this.año);
    }
}
