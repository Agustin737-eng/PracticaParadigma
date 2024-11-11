package principal;

public class VentaConTarjeta extends Venta {
    String numeroTarjeta; 

    public VentaConTarjeta(double monto, String numeroTarjeta) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNumeroTarjeta: " + numeroTarjeta ;
    }
    
}
