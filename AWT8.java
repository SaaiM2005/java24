import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AWT8 extends Frame
{
	Button br,bg,bb,brnd,bex;
	Panel pan;
	Color cr;
	AWT8()
	{
		super("Color");
		br=new Button("Red");
		bg=new Button("Greeen");
		bb=new Button("Blue");
		brnd=new Button("RColor");  //Random
		bex=new Button("Exit");
		pan=new Panel();
		
		br.setBounds(50,50,100,20);
		bg.setBounds(160,50,100,20);
		bb.setBounds(50,90,100,20);
		brnd.setBounds(160,90,100,20);
		bex.setBounds(105,130,100,20);
		pan.setBounds(270,50,100,60);
		
		add(br);
		add(bg);
		add(bb);
		add(brnd);
		add(bex);
		add(pan);
		setLayout(null);
		setSize(420,200);
		
		bex.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				System.exit(0);
			}
		});
		
		br.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				cr=new Color(255,0,0);
				pan.setBackground(cr);
			}
		});
		
		bg.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				cr=new Color(0,255,0);
				pan.setBackground(cr);
			}
		});
		
		bb.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				cr=new Color(0,0,255);
				pan.setBackground(cr);
			}
		});

		brnd.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				int a=(int)(Math.random()*255);
				int b=(int)(Math.random()*255);
				int c=(int)(Math.random()*255);
				cr=new Color(a,b,c);
				pan.setBackground(cr);				
			}
		});
		
		setVisible(true);
	}
	public static void main(String [] args)
	{
		AWT8 a=new AWT8();
	}
}