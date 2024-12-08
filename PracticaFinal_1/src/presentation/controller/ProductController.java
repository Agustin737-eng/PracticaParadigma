package presentation.controller;

import presentation.interfaces.IProductMainView;
import java.util.ArrayList;
import model.domain.Product;
import infrastruture.repository.ProductRepository;

public class ProductController {
    private IProductMainView productMainView;

    public ProductController(IProductMainView productMainView) {
        this.productMainView = productMainView;
    }
    
    public void getAllProduct(){
        ArrayList<Product> products = ProductRepository.getProducts();
        for (Product product : products) {
            System.out.println(products);
            //productMainView.listarProducts(products);
        }
    }
}
