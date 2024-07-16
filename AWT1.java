import java.awt.Frame;
public class AWT1 extends Frame
{
	AWT1()
	{
		super("First Window");
		setSize(400,400);
		setVisible(true);
	}
	public static void main(String [] args)
	{
		AWT1 a=new AWT1();
	}
}