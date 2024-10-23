package database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
class DB
{
    static Connection con;
    static PreparedStatement psi;    //INSERT QUERY
    static PreparedStatement psm;    //INSERTION
    static PreparedStatement psd;    // DELETION
    static PreparedStatement pss;    //SEARCH STUDENT
    static PreparedStatement pst;    //SEARCH TRADE
    static PreparedStatement psdisplay;
    static ResultSet rss;
    static ResultSet rst;
    static int no,id;
    static String nm,tnm;
    
    static           //static block is used to initialize static fields
    {
        try 
        {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/data24", "root","");
            psi=con.prepareStatement("INSERT INTO STUDENT VALUES (?,?,?,?)");
            psm=con.prepareStatement("UPDATE STUDENT SET name=?,tid=? WHERE roll_no=?");
            psd=con.prepareStatement("UPDATE STUDENT SET state=false WHERE roll_no=?");
            pss=con.prepareStatement("SELECT * FROM STUDENT WHERE roll_no=?");
            pst=con.prepareStatement("SELECT * FROM trade WHERE tid=?");
            psdisplay=con.prepareStatement("SELECT a.roll_no,a.name,a.tid,b.tnm,a.state WHERE a.tid=b.tid FROM STUDENT a,TRADE b");   //JOINING THE QUERY
        } catch (Exception e) {}
    }
//-------------------------------------------------------------------------
    static void UPDATE(int a,String b,int c)
    {
        no=a;
        nm=b;
        id=c;
    }
//-------------------------------------------------------------------------
    static void add()
    {
        try 
        {
            psi.setInt(1, no);
            psi.setString(2, nm);
            psi.setInt(3, id);
            psi.setBoolean(4, true);
            psi.executeUpdate();
            System.out.println("Row Inserted!");
        } catch (Exception e) {}
    }
//-------------------------------------------------------------------------
    static void mod()
    {
        try
        {
            psm.setString(1, nm);
            psm.setInt(2, id);
            psm.setInt(3, no);
            psm.executeUpdate();
            System.out.println("Row Modified!");
        } catch(Exception e){}
    }
//-------------------------------------------------------------------------
    static void del()
    {
        try
        {
            psd.setInt(1, no);
            psd.executeUpdate();
            System.out.println("Row Deleted!");
        } catch (Exception e) {}
    }
//-------------------------------------------------------------------------
static boolean ssearch(int n) {
    boolean result = false;
    try {
        pss.setInt(1, n);
        rss = pss.executeQuery(); // Execute the query
        result = rss.next(); // Check if there is a result
    } catch (Exception e) {
        e.printStackTrace(); // Optional: Print the exception
    }
    return result;
}
//-------------------------------------------------------------------------
    static boolean tsearch(int n)
    {
        boolean result=false;
        try
        {
            pst.setInt(1, n);
            rst=pst.executeQuery();
            result=rst.next();
        } catch (Exception e) {}
        return result;
    }
}