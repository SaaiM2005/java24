// int rno;
// int mrk[];  5 elements

// no is unique setData find total and avarage modify marks only.

import javax.swing.*;
import java.util.*;

public class Result1 {
    int rno;
    int [] mrk; 
    
    Result1(){
        rno=0;
        mrk=new int [5];
    }
    public String toString(){
        String s="\nNo:"+rno+"\nMarks:"+Arrays.toString(mrk)+"\nTotal:"+total()+"\nAvrage:"+average();
        return s;
    }

    void display(){
        JOptionPane.showMessageDialog(null, toString());
    }

    void setData(){
        int i=0;
        try{
            rno=Integer.parseInt(JOptionPane.showInputDialog(null,"Roll No:"));
            for(i=0;i<5;i++)
            {
            
                mrk[i]=Integer.parseInt(JOptionPane.showInputDialog(null, "Marks:"));
            }
            }
            catch(Exception e){mrk[i]=0;}
    }
    int total(){
        int tot=0;
     
        for(int i=0;i<5;i++)
        {
            tot=tot+mrk[i];
        }
        return tot;
    }
    double average(){
        return (double)total()/5;
    }

    int mod()
    {
        int i=0;
        try{
        for(i=0;i<5;i++){
            mrk[i]=Integer.parseInt(JOptionPane.showInputDialog(null,"Modify Marks"));
        }
    }catch(Exception e){}
    JOptionPane.showMessageDialog(null, "Marks Modified");

    return mrk[i];
    }

    
    public static void main(String [] args){

        Result1 a= new Result1();
        a.setData();
        
        a.display();
       a.mod();
       a.display();
    }
}


// for return karaysathi:

// void tot()  ==> int tot()