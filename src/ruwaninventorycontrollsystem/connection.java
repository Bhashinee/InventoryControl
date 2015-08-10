package ruwaninventorycontrollsystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection {
    public static Connection getcon(){
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            //DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
            System.out.println("ok1");
            String dbURL = "jdbc:derby://localhost:1527/InventoryControl";
            //Connect and create a database if not exist in the memory:
            String user = "APP";
            String password = "null";
            Connection con = DriverManager.getConnection(dbURL,user,password);
            System.out.println("ok2");
            return con;
            
        } catch (Exception ex) {
            System.out.println("not ok "+ex);
        }
        return null;        
    }
}
