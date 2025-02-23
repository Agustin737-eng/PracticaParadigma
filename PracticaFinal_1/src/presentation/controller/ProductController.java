package presentation.controller;

import java.util.ArrayList;
import model.domain.Product;
import infrastruture.repository.ProductRepository;
import presentation.interfaces.IProductRegister;
import presentation.interfaces.IProductMain;


public class ProductController {
    private IProductMain productMainView;
    private IProductRegister productRegister;

    public ProductController() {
    }

    public ProductController(IProductMain productMainView) {
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
    
    public void getProduct(String codigo){
        try {
            Product product = ProductRepository.getProduct(codigo);
            this.productRegister.showDataProduct(product);
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
    
    public void updateProduct(String codigo, String name, String description, double price, int quantity){
        Product prod = new Product();
        prod.setCodigo(codigo);
        prod.setName(name);
        prod.setDescription(description);
        prod.setPrice(price);
        prod.setQuantity(quantity);
        
        try {
            ProductRepository.updateProduct(prod);
            this.getAllProduct();
            this.productRegister.cleanData();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void deleteProduct(String codigo){
        try {
            ProductRepository.deleteProduct(codigo);
            this.getAllProduct();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void setProductMainView(IProductMain productMainView) {
        this.productMainView = productMainView;
    }

    public void setProductRegister(IProductRegister productRegister) {
        this.productRegister = productRegister;
    }
}
