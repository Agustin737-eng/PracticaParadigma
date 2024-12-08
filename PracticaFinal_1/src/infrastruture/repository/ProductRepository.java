package infrastruture.repository;

import infrastruture.config.DBConnection;
import java.util.ArrayList;
import model.domain.Product;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProductRepository{


    public static ArrayList<Product> getProducts() {
        ArrayList<Product> products = new ArrayList<>();
        try {
            Connection con = DBConnection.getCon();
            String query = "SELECT * FROM PRODUCT";
            Statement statement = con.createStatement();
            ResultSet result = statement.executeQuery(query);
            
            while(result.next()){
                products.add(initProduct(result));
            }
            statement.close();
            result.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return products;
    }
    
    public static Product initProduct(ResultSet data){
        Product Prod = new Product();
        
        return Prod;
    }
    
}
