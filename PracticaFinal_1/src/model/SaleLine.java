package model;

public class SaleLine {
    private Product product;
    private int quantity;

    public SaleLine(Product prod, int quantity) {
        this.product = prod;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    } 
    
    public double getSubTotal(){
        return this.product.getPrice() * this.quantity;
    }
}
