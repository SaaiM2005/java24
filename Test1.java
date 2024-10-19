import java.sql.*;
public class Test1
{
    public static void main(String [] args)
    {
        try
        {
            // Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/data24", "root","");
            Statement st=con.createStatement();
            
            String sql="create table Trade (tid int primary key ,tnm varchar(20))";
            st.executeUpdate(sql);
            System.out.println("Create Table");
        }
        catch(Exception e)
        {
            System.out.println(""+e);
        }
    }
}