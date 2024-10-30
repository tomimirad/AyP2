package TP9;

public class CuentaBanco {
    public String titular;
    public int nCuenta;
    public int saldo;

    public CuentaBanco(){
        titular = "";
        nCuenta = 0;
        saldo = 2000;
    }

    public CuentaBanco(String titular, int nCuenta, int saldo){
        this.titular = titular;
        this.nCuenta = nCuenta;
        this.saldo = saldo;
    }

    public void depositar(int dinero){
        this.saldo += dinero;
    }

    public void retirar(int dinero){
        this.saldo -= dinero;
    }

    public void consultarSaldo(){
        System.out.println("su saldo es de: "+ this.saldo);
    }
}
