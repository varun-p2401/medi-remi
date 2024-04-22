
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.sql.*;
/**
 *
 * @author user
 */
public class ConnectionProvider {
    //public static void main(String[] args){
            

public static Connection getCon(){
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/mediremi","root","0000");
           //System.out.println("sc");
           return con;
        }
        catch(Exception e) {
            //System.out.println("nc");
           return null;
        }
            
        
        
        
    }
}
