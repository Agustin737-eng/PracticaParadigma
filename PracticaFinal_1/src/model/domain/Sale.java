package model.domain;

import java.util.ArrayList;

public class Sale {
    private int numSale;
    private ArrayList<SaleLine> Lines;
    private Customer customer;
    private Date date; 

    public Sale(Customer customer) {
        this.customer = customer;
        this.date = new Date();
    }

    public int getNumSale() {
        return numSale;
    }

    public void setNumSale(int numSale) {
        this.numSale = numSale;
    }
    
    public void addLine(Product prod, int quantity){
        SaleLine sl = new SaleLine(prod, quantity);
        Lines.add(sl);
    }
    
    public double getTotal(){
        double total = 0;
        for (SaleLine Line : Lines) {
            total += Line.getSubTotal();
        }
        return total;
    }
}
