package supermercado;

public class Principal {

    
    public static void main(String[] args) {
        Producto prod1 = new Producto(1, "Coca 3lt", 200);
        Producto prod2 = new Producto(2, "Coca 2lt", 150);
        Producto prod3 = new Producto(3, "Coca 1lt", 100);
        
        
        Venta v = new Venta(2);
        v.agregar(prod1, 3);
        v.agregar(prod2, 2);
        v.agregar(prod3, 5);
        
        v.mostrarTicketVenta();
    }
    
}
