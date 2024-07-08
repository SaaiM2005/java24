
//IMP:- ACCOUNT CLASS HAS SERIALIZABLE INTERFACE.
/*
 The Serializable interface is present in java.io package. It is a marker interface.
  A Marker Interface does not have any methods and fields. 
  Thus classes implementing it do not have to implement any methods. 
  Classes implement it if they want their instances to be Serialized or Deserialized. 
  Serialization is a mechanism of converting the state of an object into a byte stream. Serialization is done using ObjectOutputStream. 
  Deserialization is the reverse process where the byte stream is used to recreate the actual Java object in memory. 
  This mechanism is used to persist the object. Deserialization is done using ObjectInputStream. 
  Thus it can be used to make an eligible for saving its state into a file. 
 */
import java.io.*;
import mypkg.Util;
import mypkg.Account;
public class ObjRead{
    public static void main(String[] args) 
    {
        FileInputStream fis =null;
        ObjectInputStream ois=null;
        try
        {
            fis=new FileInputStream("acc.dat");
            ois=new ObjectInputStream(fis);
        }catch(Exception e){}
        Account obj=null;
        while (true)
        {
            try
            {
                obj=(Account)ois.readObject();
            } catch (Exception e) {break;}
            obj.display();
        }
        try
        {
            ois.close();
            fis.close();
        } catch (Exception e) {}
    }
}