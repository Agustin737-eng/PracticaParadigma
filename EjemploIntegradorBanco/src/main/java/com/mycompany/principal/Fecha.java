
package com.mycompany.principal;

import java.time.LocalDateTime;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public Fecha() {
        LocalDateTime hoy = LocalDateTime.now();
        dia = hoy.getDayOfMonth();
        mes = hoy.getMonthValue();
        año = hoy.getYear();
    }
    
    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return dia+"/"+mes+"/"+año;
    }   
}
