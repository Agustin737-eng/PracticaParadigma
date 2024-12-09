package presentation.controller;

import presentation.interfaces.IProductMainView;
import java.util.ArrayList;
import model.domain.Product;
import infrastruture.repository.ProductRepository;
import presentation.interfaces.IProductRegister;


public class ProductController {
    private IProductMainView productMainView;
    private IProductRegister productRegister;

    public ProductController() {
    }

    public ProductController(IProductMainView productMainView) {
        this.productMainView = productMainView;
    }
    
    public ProductController(IProductRegister productRegister) {
        this.productRegister = productRegister;
    }
    
    public void getAllProduct(){
        try {
            ArrayList<Product> products = ProductRepository.getProducts();
            productMainView.listarProducts(products);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void createProduct(String codigo, String name, String description, double price, int quantity){
        Product prod = new Product();
        prod.setCodigo(codigo);
        prod.setName(name);
        prod.setDescription(description);
        prod.setPrice(price);
        prod.setQuantity(quantity);
        
        try {
            ProductRepository.saveProduct(prod);
            getAllProduct();
            this.productRegister.cleanData();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void setProductMainView(IProductMainView productMainView) {
        this.productMainView = productMainView;
    }

    public void setProductRegister(IProductRegister productRegister) {
        this.productRegister = productRegister;
    }
}
