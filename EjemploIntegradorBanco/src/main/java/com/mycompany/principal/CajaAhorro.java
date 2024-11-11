package com.mycompany.principal;

public class CajaAhorro extends Cuenta{
    private int interesMensual = 3;
    
    public CajaAhorro() {
    }
    
    public CajaAhorro(int interesMensual) {
        this.interesMensual = interesMensual;
    }
    
    public CajaAhorro(double saldo, String propietario) {
        super(saldo, propietario);
    }
 
    public int getInteresMensual() {
        return interesMensual;
    }

    public void setInteresMensual(int interesMensual) {
        this.interesMensual = interesMensual;
    }

    @Override
    public String toString() {
        return super.toString() + " CajaAhorro{" + "interesMensual=" + interesMensual + '}';
    }

}
