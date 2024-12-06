package aplication.controller;

import aplication.interfaces.IProductMainView;
import java.util.ArrayList;
import model.Product;
import repository.ProductRepository;

public class ProductController {
    private IProductMainView productMainView;

    public ProductController(IProductMainView productMainView) {
        this.productMainView = productMainView;
    }
    
    public void getAllProduct(){
        ArrayList<Product> products = ProductRepository.getProducts();
        for (Product product : products) {
            productMainView.listarProducts(products);
        }
    }
}
