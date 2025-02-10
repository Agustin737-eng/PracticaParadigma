package model;

import repository.PrestamoRepository;

public class Prestamo {
    private Socio socio;
    private Libro libro;
    private Fecha fechaDesde;
    private Fecha fechaHasta;
    private int cantidad;

    public Prestamo(Socio socio, Libro libro, int cantidad) {
        this.socio = socio;
        this.libro = libro;
        this.fechaDesde = new Fecha();
        this.cantidad = cantidad;
        
        libro.actualizarStock(cantidad);
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }
 
}
