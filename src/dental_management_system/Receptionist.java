package dental_management_system;
import java.sql.*;
/**
 * @author bushra
 */
public class Receptionist extends User
{

    public Receptionist(String userName, String password, String userType)
    {
        super(userName, password, userType);
    }
    public void InsertPatientData(Patient patient)
    {
 
     String query = "INSERT INTO Patients (ID, Name, Phone, Past_Dental_History, Past_Medical_History, Past_Surgical_History, Past_Drug_History)"
        + "VALUES ('"+patient.ID+"', '"+patient.name+"', '"+patient.phoneNumber+"', '"+patient.pastDentalhistory+"' , '"+patient.pastMedicalhistory+"', '"+patient.pastSurgicalhistory+"', '"+patient.pastDrughistory+"')";
        
        
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
    
    
    public void UpdatePatientData(Patient patient)
    {
 
     String query = "UPDATE Patients SET ID='"+patient.ID+"', Name='"+patient.name+"', Phone='"+patient.phoneNumber+"', Past_Dental_History='"+patient.pastDentalhistory+"' , Past_Medical_History='"+patient.pastMedicalhistory+"', Past_Surgical_History='"+patient.pastSurgicalhistory+"' , Past_Drug_History='"+patient.pastDrughistory+"'WHERE ID='"+patient.ID+"'";
       

     DataBase_Connection conn = new DataBase_Connection();
     
        try
        {
           conn.MakeConnection();

           conn.RunUpdateQuery(query);

           
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
        
    /**
     *
     * @return
     */
    
  
      }
    
    
    public void DeletePatient(Patient patient)
    {
 
     String query = "DELETE FROM Patients WHERE  ID='"+patient.ID+"'";

     DataBase_Connection conn = new DataBase_Connection();
     
        try
        {
           conn.MakeConnection();

           conn.RunDeleteQuery(query);

           
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
        
    /**
     *
     * @return
     */
    
  
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
    public void InsertMedicineData( Medicines_and_Equipments data)
    {
 
     String query = "INSERT INTO medicinesRecord (Generic_Name, Company_Name, Medicine_Name, Quantity, Cost)"
        + "VALUES ('"+data.Generic_Name+"', '"+data.Company_Name+"', '"+data.Medicines_Name+"', '"+data.MQuantity+"' , '"+data.MCost+"')";
        
        
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
    public void InsertEquipmentData( Medicines_and_Equipments data)
    {
 
     String query = "INSERT INTO equipmentsRecords (Equipment_Name, State ,Quantity, Cost)"
        + "VALUES ('"+data.Equipment_name+"', '"+data.State+"', '"+data.EQuantity+"' , '"+data.ECost+"')";
        
        
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
    public void UpdateMedicineData(Medicines_and_Equipments data)
    {
 
     String query = "UPDATE medicinesRecord SET Generic_Name ='"+data.Generic_Name+"', Company_Name='"+data.Company_Name+"', Medicine_Name='"+data.Medicines_Name+"', Quantity='"+data.MQuantity+"' , Cost='"+data.MCost+"' WHERE Medicine_Name='"+data.Medicines_Name+"'";

     DataBase_Connection conn = new DataBase_Connection();
     
        try
        {
           conn.MakeConnection();

           conn.RunUpdateQuery(query);

           
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
        
    /**
     *
     * @return
     */
    
  
      }
     public ResultSet SearchMedicineData(String text)
    {
        String query = "SELECT * FROM medicinesRecord WHERE Medicine_Name LIKE '%"+text+"%'";
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
     public ResultSet SearchEquipmentData(String text)
    {
        String query = "SELECT * FROM equipmentsRecords WHERE Equipment_Name LIKE '%"+text+"%'";
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
      public void UpdateEquipmentData(Medicines_and_Equipments data)
    {
 
     String query = "UPDATE equipmentsRecords SET Equipment_Name ='"+data.Equipment_name+"', State='"+data.State+"', Quantity='"+data.EQuantity+"' , Cost='"+data.ECost+"' WHERE Equipment_Name='"+data.Equipment_name+"'";

     DataBase_Connection conn = new DataBase_Connection();
     
        try
        {
           conn.MakeConnection();

           conn.RunUpdateQuery(query);

           
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
        
    /**
     *
     * @return
     */
    
  
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
    public void InsertAppointmentData(AppointmentList AList)
    {
 
     String query = "INSERT INTO Appointment_List (PatientID, Date_And_Time, Patient_Name, Treatment)"
        + "VALUES ('"+AList.PateintID+"', '"+AList.date+"', '"+AList.PatientName+"' , '"+AList.Treatment+"')";
        
        
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
}
    


