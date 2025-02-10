
package principal;

public class Principal {

    public static void main(String[] args) {
        Caja c = new Caja(1);
        
        c.addVenta(new Venta(100));
        c.addVenta(new Venta(200));
        c.addVenta(new VentaConTarjeta(300, "4444-000-0000-1234"));
        
        c.mostrarVentas();
    }
    
}
