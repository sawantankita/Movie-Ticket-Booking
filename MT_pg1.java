import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.BorderFactory.*;
import javax.swing.border.Border;
public class MT_pg1 extends JFrame
{
	JProgressBar jp;
	JLabel l1,l2,l3,l4;
	ImageIcon i1,i2;
	//JFrame jpb1;
	public MT_pg1()
	{
		 setLayout(null);
		 setSize(1960,998);
		 setVisible(true);
		getContentPane().setBackground(new Color(0,0,0));
		Font f1=new Font("Century Gothic",Font.BOLD,20);
		Font f2=new Font("Lucida Calligraphy",Font.BOLD,50);

		i1=new ImageIcon("hourglass.GIF");
		l1=new JLabel(i1);

		i2=new ImageIcon("mtimg4.PNG");
		l2=new JLabel(i2);
		l3=new JLabel(".");
		l4=new JLabel("Movie Ticket Booking");
		jp=new JProgressBar(); 

		l4.setFont(f2);
		l3.setForeground(Color.BLACK);
		l4.setForeground(Color.WHITE);

		l1.setBounds(400,150,500,500);
		l2.setBounds(800,50,1000,800);
		l3.setBounds(100,70,1700,820);
		l4.setBounds(400,80,800,300);
		jp.setBounds(400,600,500,50);

		l3.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));
		jp.setBorder(BorderFactory.createLineBorder(Color.RED));
		jp.setBackground(Color.WHITE);
		jp.setForeground(Color.RED);
		jp.setFont(f1);
		jp.setStringPainted(true);	
		
		add(jp);
		add(l1);	add(l2); 
		add(l3); 	add(l4); 
			
	}
	public void itterate1()
	{
	int i=0;
		while(i<=100)
		{

			jp.setValue(i);
			i=i+5;
			
			if(i>0 && i<89)
				jp.setString(""+i+"%");

			if(i>=99)
			{
				jp.setString("Almost Done ");	
			}
			if(i==100)
			{
				
				new MT_pg2();
				this.dispose();	
			}
			try
			{
				Thread.sleep(500);

			}catch(Exception e){System.out.println(e);}
		}
	}
	public static void main(String args[])
	{
		MT_pg1 jpb1=new MT_pg1();
		 jpb1.itterate1();
	}
	
}