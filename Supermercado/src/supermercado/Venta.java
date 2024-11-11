package supermercado;


public class Venta {
    private int numeroFactura;
    private Fecha fecha = new Fecha();
    private java.util.ArrayList<LineaVenta> lineas = new java.util.ArrayList<LineaVenta>();

    public Venta(int numeroFactura) {
        this.numeroFactura = numeroFactura;
    }
    public void agregar(Producto p, int cantidad){
        LineaVenta linea = new LineaVenta(cantidad, p);
        this.lineas.add(linea);
    }
    public double calcularTotal(){
        double total = 0;
        for (LineaVenta linea : lineas) {
            total += linea.calcularSubtotal();
        }
        return total;
    }
    public void mostrarTicketVenta(){
        System.out.println("\nNumero de Fatura: " + numeroFactura);
        System.out.println("Fecha: "+fecha);
        System.out.println("Can\tDesc\t\tUni\tSubt\n");
        for (LineaVenta linea : lineas) {
            System.err.println(linea);
        }
        System.out.println("\nTotal de la venta: "+this.calcularTotal());
    }
}
