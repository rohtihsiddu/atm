
package atm;
import java.sql.*;
public class Conn {
    Connection c;
    Statement s;
    public Conn(){
        try{
            
            c=DriverManager.getConnection("jdbc:mysql:///atm", "root", "chikky@0603");
            s=c.createStatement();
        }catch (Exception e){
            System.out.println(e);
        }
    }
   
}
