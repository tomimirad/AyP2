package TP9;

public class Fecha {
    public int dia;
    public int mes;
    public int año;

    public Fecha(){
        dia = 0;
        mes = 0;
        año = 0;
    }

    public Fecha(int dia, int mes , int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }

    public void fecha(){
        System.out.println(this.dia+"/"+this.mes+"/"+this.año);
    }

    public void incrementar(int numero){
        this.dia += numero;
    }

    public void validar(int dia, int mes , int año){
        int diaMax = 0;
        if (mes >= 1 && mes <= 12) {
          switch (mes) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
              diaMax = 31;
              break;
            case 4: case 6: case 9: case 11:
              diaMax = 30;
              break;
            case 2:
              diaMax = 28;
              break;
            default:
              break;
          }
        }
        if (dia < 1 || dia > diaMax) {
          System.out.println("dia no valido");
        } else {
          System.out.println("dia valido");
        }
        if (año%4 == 0) {
            if (año%100 ==0) {
              if (año%400 == 0) {
                System.out.println("año valido");
              } else { 
                System.out.println("año no valido");
              }
            }
          }
    }
}
