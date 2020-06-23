package dental_management_system;

import java.sql.*;
/**
 * @author bushra
 */
public class Doctor extends User
{
    int ID;
    String name;
    String specialization;
    String phone;
    String ePhone;
    String email;
    String address;

    public Doctor(String userName, String password, String userType)
    {
        super(userName, password, userType);
    }
    public ResultSet ShowAllPatientsData()
    {
        
        String query="SELECT * FROM Patients";
        ResultSet rs=null;
        
         DataBase_Connection  conn = new DataBase_Connection ();
        
        try
        {
        
        
        conn.MakeConnection();
        
        rs = conn.RunSelectQuery(query);

        
        
        }
        catch (Exception e)
        {
                
        }
        
        
        return rs;
    }
    
    
    public ResultSet SearchPatientsData(String text)
    {
        String query = "SELECT * FROM Patients WHERE Name LIKE '%"+text+"%'";
        ResultSet rs=null;
        
       DataBase_Connection  conn = new DataBase_Connection ();
        
        try{            
           
            conn.MakeConnection();
            
            rs = conn.RunSelectQuery(query);


            }     
            catch (Exception e) 
            {
            
            } 
            
         
        return rs;
    }
     
     
    public ResultSet ShowAllAppointments()
    {
        
        String query="SELECT * FROM Appointment_List";
        ResultSet rs=null;
        
         DataBase_Connection  conn = new DataBase_Connection ();
        
        try
        {
        
        
        conn.MakeConnection();
        
        rs = conn.RunSelectQuery(query);

        
        
        }
        catch (Exception e)
        {
                
        }
        
        
        return rs;
    }
}


