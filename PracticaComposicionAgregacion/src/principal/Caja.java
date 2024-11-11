package principal;

import java.util.ArrayList;

public class Caja {
    private int numero;
    private ArrayList<Venta> ventas = new ArrayList<Venta>();

    public Caja(int numero) {
        this.numero = numero;
    }
    public void addVenta(Venta venta){
        ventas.add(venta);
    }
    public void mostrarVentas (){
        double total = 0;
        for(Venta venta : ventas){
            System.out.println(venta);
            total += venta.getMonto();
            System.out.println();
        }
        System.out.println("Monto: "+ total);
    }
}
