import java.sql.*;
import mypkg.Util;

public class InsertTrade 
{
    public static void main(String[] args) throws Exception
    {
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data24", "root","");
        int id=0;
        String nm="";
        PreparedStatement ps=con.prepareStatement("INSERT INTO trade values(?,?)");
        while(true)
        {
            id=Util.iInput("Trade ID:");
            if(id==0)
            {
                break;
            }
            nm=Util.sInput("Enter Trade Name:");
            ps.setInt(1, id);
            ps.setString(2, nm);
            ps.executeUpdate();
            System.out.println("Row Inserted.");
            
        }
        con.close();
    }
    
}