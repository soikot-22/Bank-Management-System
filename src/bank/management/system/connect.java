
package bank.management.system;
import java.sql.*;

public class connect {
    Connection c;
    Statement s;
    public connect(){
        try{
            c = DriverManager.getConnection("jdbc:mysql:///bms", "root", "#soikot12345");
            s = c.createStatement();
        } catch(Exception e){
            System.out.println(e);
        }
    }
}
