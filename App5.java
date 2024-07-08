public class App5
{
    public static void main(String[]args)
    {
        int i=1;
        int no=(int)(Math.random()*100);
        //HERE int is TYPECASTING ,Math IS THE CLASS USED & random() is the static method used which is available in the class 'Math'.
        System.out.println("TABLE:");
        while(i<=10)
        {
            System.out.println(" "+(no*i));
            i++;
        }
    }
}