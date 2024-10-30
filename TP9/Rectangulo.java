package TP9;

public class Rectangulo {
    private int base;
    private int altura;
    
    
    public void setBase(int base){
        this.base = base;
    }
    public void setAltura(int altura){
        this.altura = altura;
    }

    public int getBase(){
        return base;
    }
    public int getAltura(){
        return altura;
    }

    public int getArea(){
         return base*altura;
    }
    public int getPerimetro(){
        return 2*(base+altura);
    }
}
