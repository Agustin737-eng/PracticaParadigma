package model;

import java.util.ArrayList;
import repository.PrestamoRepository;

public class Socio extends Persona{
    private int nroSocio;
    private int legajo;

    public Socio(int dni, String nombre, String apellido, int nroSocio,int legajo) {
        super(dni, nombre, apellido);
        this.nroSocio = nroSocio;
        this.legajo = legajo;
    }
    
    public int getNroSocio() {
        return nroSocio;
    }

    public void setNroSocio(int nroSocio) {
        this.nroSocio = nroSocio;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }
    
    public int cantidadPrestamos(){
        return PrestamoRepository.getPrestamosBySocio(super.getDni()).size();
    }
    
}
