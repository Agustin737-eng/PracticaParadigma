package model;

public class Customer extends Person{
    private EnumTaxStatus TaxStatus = EnumTaxStatus.ConsumidorFinal;

    public Customer() {
    }
    
    public Customer(EnumTaxStatus taxStatus) {
        this.TaxStatus = taxStatus;
    }

    public EnumTaxStatus getTaxStatus() {
        return TaxStatus;
    }

    public void setTaxStatus(EnumTaxStatus TaxStatus) {
        this.TaxStatus = TaxStatus;
    }
}
