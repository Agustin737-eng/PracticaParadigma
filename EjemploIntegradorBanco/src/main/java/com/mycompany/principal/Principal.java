package com.mycompany.principal;


public class Principal {

    public static void main(String[] args) {
        Banco BMA = new Banco();
        //BMA.agregarCuenta(new Cuenta(100, "Agustin"));
        //BMA.agregarCuenta(new Cuenta(150, "Agustina"));
        BMA.agregarCuenta(new CajaAhorro(50, "Pedro"));
        //BMA.agregarCuenta(new CuentaCorriente(20, "Juan"));
        
        BMA.mostrar();
        BMA.cobrarMantenimientoMensual();
        BMA.mostrar();
    }
}
