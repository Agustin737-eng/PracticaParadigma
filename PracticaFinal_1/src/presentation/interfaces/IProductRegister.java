package presentation.interfaces;

import model.domain.Product;

public interface IProductRegister {
    public void showDataProduct(Product product);
    public void cleanData();
    public void showMessage();
}
