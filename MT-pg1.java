import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
import java.awt.event.*;

public class MT_pg1 extends JFrame
{
	JProgressBar jp;
	JLabel l1,l2;
	ImageIcon i1;
	public MT_pg1()
	{
		setLayout(null);

		i1=new ImageIcon("load.GIF");
		l1=new JLabel(i1);
		
		l1.setBounds(680,100,500,500);
		jp=new JProgressBar();
		jp.setBounds(700,600,500,80);
		add(jp);
		add(l1);

		jp.setStringPainted(true);	
		
	}
	public void itterate1()
	{
	int i=0;
		while(i<=1000)
		{
			jp.setValue(i);
			i=i+10;
			if( i<100)
				jp.setString("Please wait...");
			if(i>100 && i<500)
				jp.setString("Loading...");
			if(i>500)
				jp.setString("Almost Done");
				
			try
			{
				Thread.sleep(800);

			}catch(Exception e){System.out.println(e);}
		}
	}
	public static void main(String args[])
	{
		MT_pg1 jpb1=new MT_pg1();
		 jpb1.setSize(1950,950);
		 jpb1.setVisible(true);
		jpb1.getContentPane().setBackground(new Color(0,0,0));
		 jpb1.itterate1();
	}
	
}