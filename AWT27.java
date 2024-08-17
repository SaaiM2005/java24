//CALCULATOR
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
class AWT27 extends Frame implements ActionListener 
{
    TextField t1;
    Panel p1;
    String[]cap=new String[]//
    {
        "1","2","3","+",
        "4","5","6","-",
        "7","8","9","*",
        "C","0","=","/"
    };
    Button[]btn;
    int v1,v2,res,flg;
    char ch,opr;
    String s;
    
    
    AWT27()
    {
        super("CALCULATOR");
        t1=new TextField(15);
        t1.setEditable(false);
        add(t1,BorderLayout.NORTH);
        //setBackground(Color.BLACK);
        btn=new Button[16];
        p1=new Panel();
        p1.setLayout(new GridLayout(4,4,5,5));
        for(int i=0;i<16;i++)
        {
            btn[i]=new Button(cap[i]);   //---------------------------String[]cap=new String[]
            btn[i].addActionListener(this);
            p1.add(btn[i]);
        }
        add(p1,BorderLayout.CENTER);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        setSize(400,300);
        setVisible(true);
    }
    void comp()
    {
        switch(opr)
        {
            case '+':
                res=v1+v2;
                break;
            case '-':
                res=v1-v2;
                break;
            case '*':
                res=v1*v2;
                break;
            case '/':
                res=v1/v2;
                break;
        }
    }
}