
package principal;

public class Venta {
    private double monto;
    private Fecha fec;

    public Venta() {}

    public Venta(double monto) {
        fec = new Fecha();
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    public Fecha getFec() {
        return fec;
    }

    public void setFec(Fecha fec) {
        this.fec = fec;
    }

    @Override
    public String toString() {
        return "Fecha: " + fec + "\nMonto: " + monto;
    }
}
