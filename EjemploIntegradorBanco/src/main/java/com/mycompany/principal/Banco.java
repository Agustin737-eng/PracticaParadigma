
package com.mycompany.principal;

import java.util.ArrayList;

public class Banco {
    ArrayList<Cuenta> cuentas = new ArrayList<Cuenta>();

    public Banco() {
    }
    
    public void agregarCuenta(Cuenta c){
        cuentas.add(c);
    }
    public void mostrar(){
        for (Cuenta cuenta : cuentas) {
            System.out.println(cuenta);
        }
    }
    public void cobrarMantenimientoMensual(){
        for (Cuenta cuenta : cuentas) {
            cuenta.extraer(50);
        }
    }
}
