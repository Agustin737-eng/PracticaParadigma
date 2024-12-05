package repository.implementation;

import java.util.ArrayList;
import model.Product;
import repository.interfaces.IProductRepository;
import java.sql.Statement;
import java.sql.Connection;

public class ProductRepository implements IProductRepository{

    @Override
    public ArrayList<Product> getProducts() {
        Connection con = DBConnection.getCon();
        String query = "SELECT * FROM PRODUCT";
        Statement statement = con.createStatement();
        
        
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
