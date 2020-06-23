package dental_management_system;

import java.sql.*;
/**
 * @author bushra
 */
public class User
{ 
    String userName;
    String password;
    String userType;
    
    public User(String userName, String password, String userType)
    {
        this.userName = userName;
        this.password = password;
        this.userType = userType;
    }
    
    
    public boolean UserLogin()
    {
        boolean result=false;

       DataBase_Connection  conn = new DataBase_Connection ();

        String query = "SELECT * FROM Users WHERE Username='"+userName+"' AND Password='"+password+"' AND Type='"+userType+"'";
    
        try
        {
            conn.MakeConnection();
            
            ResultSet rs = conn.RunSelectQuery(query);
           
            int record = 0;
        
            while(rs.next())
            {
                record++;
            }

            if(record>0)
               result= true;
            else 
               result= false;
            
            
            
        }
        catch (Exception e)
        {
        
        }
        finally
        {
            try
            {
                conn.CloseConnection();
            }
            catch (Exception e)
            {
                        
            }
        }
       
        return result;
        
        
    }
    
    public String CheckUserType(User user)
    {
        
        String type=null;
        String query = "SELECT * FROM Users Where Username='"+user.userName+"'";
        
        DataBase_Connection  conn = new DataBase_Connection ();
        
        try
        {
        conn.MakeConnection();
        
        ResultSet rs = conn.RunSelectQuery(query);
        
        rs.next();
        
        type = rs.getString("Type");
        
        }
        catch (Exception e)
        {
            
        }
        finally
        {
            try
            {
                conn.CloseConnection();
            }
            catch (Exception e)
            {
                        
            }
        }
        
        return type;
    }

    
}
    
    

