
package bank.management.system;
import java.sql.*;

public class Conn {
    
    Connection c;
    Statement s;
    public Conn(){
        try{
//            Class.forName(com.mysql.cj.jdbc.Driver); //driver registered
            c = DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root", "software project 2"); //Connection string
            s = c.createStatement(); //create 
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
