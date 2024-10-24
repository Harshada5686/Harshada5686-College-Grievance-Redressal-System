/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Frame;

import java.sql.Connection;
import java.sql.DriverManager;
public class ConstantConnetion {
    
    static Connection con;
    
    public static Connection createConnection()
    {
        try{
            String url = "jdbc:mysql://localhost:3306/grievance_redressal";
            String username = "root";
            String password="";
            
            con = DriverManager.getConnection(url,username,password);
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        return con;
    }
}
