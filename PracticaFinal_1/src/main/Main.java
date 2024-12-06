package main;

import repository.DBConnection;
import view.ProductMainView;

public class Main {

    public static void main(String[] args) {
        if(DBConnection.getConnection()>0){
            ProductMainView productView = new ProductMainView();
            productView.setVisible(true);
        }else{
            System.err.println("error DB connected");
        }
    }
    
}
