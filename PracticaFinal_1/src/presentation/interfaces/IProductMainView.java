package presentation.interfaces;

import java.util.ArrayList;
import model.domain.Product;

public interface IProductMainView {
    public void listarProducts(ArrayList<Product> products);
    public void updateProduct(int idproduct);
    public void deleteProduct(int idproduct);
}
