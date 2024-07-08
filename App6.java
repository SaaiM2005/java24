//PROGRAKM WHICH CREATES A TABLE FOR A RANDOM NUMBER.
public class App6
{
    public static void main(String[]args)
    {
        int i=1,no=(int)(Math.random()*100);
        String str="TABLE\n";
        while(i<=10)
        {
            str=str+" "+(no*i);
            i++;
        }
        System.out.println(str);
    }
}
