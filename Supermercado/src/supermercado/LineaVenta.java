package supermercado;

public class LineaVenta {
    private int cantidad;
    private Producto p;
    
    public double calcularSubtotal(){
        return this.cantidad * p.getPrecio();
    }

    public LineaVenta() {
    }

    public LineaVenta(int cantidad, Producto p) {
        this.cantidad = cantidad;
        this.p = p;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getP() {
        return p;
    }

    public void setP(Producto p) {
        this.p = p;
    }

    @Override
    public String toString() {
        return cantidad + "\t" + p.getNombre()+"\t" + p.getPrecio() + "\t" + this.calcularSubtotal();
    }
}
