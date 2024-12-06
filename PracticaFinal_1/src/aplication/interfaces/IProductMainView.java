package aplication.interfaces;

import java.util.ArrayList;
import model.Product;

public interface IProductMainView {
    public void listarProducts(ArrayList<Product> products);
    public void crearProduct();
    public void updateProduct(int idproduct);
    public void deleteProduct(int idproduct);
}
