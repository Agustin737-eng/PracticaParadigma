package infrastruture.config;
import java.sql.DriverManager;
import java.sql.Connection;


public class DBConnection {
    private static String DRIVER = "com.mysql.jdbc.Driver";
    
    private static String host = "localhost";
    private static int port = 3306;
    private static String user = "root";
    private static String password = "12345678";
    private static String DB = "tpv";
    private static String URL = "jdbc:mysql://"+host+":"+port+"/"+DB;
    private static Connection con;
    
    public static int getConnection(){
        try {
            //Class.forName(DRIVER);
            con = DriverManager.getConnection(URL, user, password);
            return 1;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return -1;
        } 
    }

    public static Connection getCon() {
        return con;
    }
}
