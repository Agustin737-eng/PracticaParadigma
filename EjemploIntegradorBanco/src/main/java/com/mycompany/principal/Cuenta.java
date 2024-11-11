
package com.mycompany.principal;


public class Cuenta {
    protected double saldo;
    private String propietario;
    private Fecha fechaApertura = new Fecha();

    @Override
    public String toString() {
        return "saldo: " + saldo + "\tPropietario: " + propietario + "\tFecha de Apertura: " + fechaApertura;
    }

    public Cuenta() {
    }

    public Cuenta(double saldo, String propietario) {
        this.saldo = saldo;
        this.propietario = propietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public Fecha getFechaApertura() {
        return fechaApertura;
    }
    
    public void depositar(double monto){
        saldo += monto;
    }
    
    public void extraer(double monto){
        if(monto>saldo){
            System.out.println("Saldo insuficiente");
        }else{
            saldo -= monto;
        }
    }
}
