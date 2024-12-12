package presentation.controller;

import model.domain.Sale;
import model.domain.SaleLine;
import presentation.interfaces.ISaleRegister;

public class SaleController {
    private Sale sale;
    private ISaleRegister saleRegisterView;
    
    
    public SaleController(ISaleRegister saleRegisterView){  
        this.saleRegisterView = saleRegisterView;
    }
}
