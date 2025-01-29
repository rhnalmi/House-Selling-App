
package SellingApp;

//import com.mysql.cj.jdbc.Driver;
//import java.sql.PreparedStatement;
//import com.mysql.jdbc.*;

//import com.sun.jdi.connect.spi.Connection;
import com.mysql.cj.xdevapi.Statement;
import java.sql.Connection;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectionDb {
    static final String jdbc_driver = "MySQL (Connector/J driver) (1)";
    static final String url = "jdbc:mysql://localhost:3306/selling";
    static final String user = "root";
    static final String pass = "";
    
    static Connection conn;
    static Statement stat;
    static ResultSet rs;
    
    public static Connection connectDatabase(){
        try{
            Class.forName(jdbc_driver);
        } catch(ClassNotFoundException cnf){
            
        } try{
            conn = (Connection) DriverManager.getConnection(url,user,pass);
            JOptionPane.showMessageDialog(null, "Connect Sucessful");
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Connection Failed");
        } catch(HeadlessException e){
            
        }
        return conn;
    }
}
