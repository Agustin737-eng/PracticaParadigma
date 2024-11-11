package com.mycompany.principal;

public class CuentaCorriente extends Cuenta{
    private int numeroCheque = 100; 

    public CuentaCorriente() {
    }

    public CuentaCorriente(int numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public CuentaCorriente(double saldo, String propietario) {
        super(saldo, propietario);
    }

    public int getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(int numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    @Override
    public String toString() {
        return super.toString() + " CuentaCorriente{" + "numeroCheque=" + numeroCheque + '}';
    }
    
    @Override
    public void extraer(double monto){
        saldo -= monto;
    }
    
}
