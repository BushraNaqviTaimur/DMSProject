package dental_management_system;

import java.sql.ResultSet;

/**
 * @author bushra
 */
public class Admin extends User
{

    public Admin(String userName, String password, String userType)
    {
        super(userName, password, userType);
    }
     

   public ResultSet ShowAllMedicnesRecord()
   {
         String query="SELECT * FROM medicinesRecord";
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
   public ResultSet ShowAllEquipmentRecord()
   
    {
        
        String query="SELECT * FROM equipmentsRecords";
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
   public ResultSet ShowAllExpensesRecord()
   
    {
        
        String query="SELECT * FROM expensesRecord";
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
   public void InsertExpensesData(Expenses expenses)
    {
 
     String query = "INSERT INTO expensesRecord (Month, Payments, Electricity_Bills, Water_Bills, Maintenance_expenses_of_Dental_Units)"
        + "VALUES ('"+expenses.month+"', '"+expenses.payments+"', '"+expenses.electricityBills+"' , '"+expenses.waterBills+"', '"+expenses.maintenance+"')";
        
        
     DataBase_Connection  conn = new DataBase_Connection ();
     
        try
        {
           conn.MakeConnection();

           conn.RunInsertQuery(query);

           
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
        
}
   public ResultSet SearchExpensesData(String text)
    {
        String query = "SELECT * FROM expensesRecord WHERE Month LIKE '%"+text+"%'";
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
}
