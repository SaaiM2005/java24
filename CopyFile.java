import java.io.*;
class CopyFile {
   public static void main(String[] args)throws Exception
    {
        File f=new File("abc.txt");
        if(f.exists()==false)
        {
            System.out.println("FILE NOT FOUND");
            return ;
        }
        FileReader fr=new FileReader(f);//here u can provide file name or file class object
        int val=0;
        FileWriter fw=new FileWriter("pqr.txt");
        while (true) {
            val=fr.read();
            if(val==-1)
            {
                break;
            }
            fw.write(val);
            
        }
        fr.close();
        fw.close();
    } 
}
