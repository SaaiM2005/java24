import mypkg.Util;
public class UseUtil 
{
    public static void main(String [] args)
    {
        int no=Util.iInput("Roll No:");
        String nm=Util.sInput("Name:");
        double mrk=Util.dInput("Marks:");
        String str = "Roll No:"+no+"\nName:"+nm+"\nMarks:"+mrk;

        Util.display(str);
        
    }
    
}