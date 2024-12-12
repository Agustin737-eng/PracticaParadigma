package main;

import infrastruture.config.DBConnection;
import view.MainMenu;
import view.ProductMainView;

public class Main {

    public static void main(String[] args) {
        if(DBConnection.getConnection()>0){
            MainMenu main = new MainMenu();
            main.setVisible(true);
//            ProductMainView productView = new ProductMainView();
//            productView.setVisible(true);
        }else{
            System.err.println("error DB connected");
        }
    }
    
}
