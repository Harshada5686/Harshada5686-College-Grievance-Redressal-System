
package grievance_redressal;

import Frame.ConstantConnetion;
import Frame.Dashbord;
import Frame.FirstFrame;
import java.sql.Connection;
import java.sql.DriverManager;
import Frame.*;

public class Grievance_Redressal 
{
    public static void main(String[] args) 
    {
        FirstFrame obj = new FirstFrame();
        obj.setVisible(true);
//        try
//        {
//            ConstantConnetion conn = new ConstantConnetion();
//                Connection con = conn.createConnection();String query ="Select *from navigationtable";
//                PreparedStatement st = con.prepareStatement(query);
//                ResultSet rs=st.executeQuery();
//                String first="";
//                while(rs.next())
//                {
//                    first=rs.getString(1);
//                }
//                System.out.println("Value :"+first);
//                if(first.equals("Login"))
//                {
//                    
//                }
//                
//        
//        }catch(Exception e)
//        {
//            System.out.println(e);
//        }
    } 
}
