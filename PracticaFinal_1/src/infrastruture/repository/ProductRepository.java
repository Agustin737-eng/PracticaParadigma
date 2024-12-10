package infrastruture.repository;


import infrastruture.config.DBConnection;
import java.util.ArrayList;
import model.domain.Product;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;


import java.util.logging.Level;
import java.util.logging.Logger;


public class ProductRepository{
    

    public static ArrayList<Product> getProducts() throws SQLException{
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
            throw e;
        }
        
        return products;
    }
    
    public static Product getProduct(String codigo) throws SQLException{
        try {
            String query = "select * from product where codigo=?";
            PreparedStatement statemen = DBConnection.getCon().prepareStatement(query);
            statemen.setString(0, codigo);
            return initProduct(statemen.executeQuery());
        } catch (SQLException e) {
            throw e;
        }
    }
    
    public static void saveProduct(Product product) throws SQLException{
        String prepareStatement = "insert into product(codigo, name, description, price, quantity) values(?,?,?,?,?)";
        try {
            PreparedStatement Statement = DBConnection.getCon().prepareStatement(prepareStatement);
            Statement.setString(1, product.getCodigo());
            Statement.setString(2, product.getName());
            Statement.setString(3, product.getDescription());
            Statement.setDouble(4, product.getPrice());
            Statement.setInt(5, product.getQuantity());
            
            Statement.executeUpdate();
        } catch (SQLException e) {
            throw e;
        }
    }
    
    public static Product initProduct(ResultSet data) throws SQLException{
        Product Prod = new Product();
        
        Prod.setCodigo(data.getString("codigo"));
        Prod.setName(data.getString("name"));
        Prod.setDescription(data.getString("description"));
        Prod.setQuantity(data.getInt("quantity"));
        Prod.setPrice(data.getDouble("price"));
        
        return Prod;
    }
}
