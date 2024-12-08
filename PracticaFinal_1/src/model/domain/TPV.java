package model.domain;

import java.util.ArrayList;

public class TPV {
    private String codigo;
    private ArrayList<Sale> sales;

    public TPV() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ArrayList<Sale> getSales() {
        return sales;
    }

    public void addSale(Sale sale){
        this.sales.add(sale);
    }
}
