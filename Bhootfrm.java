import java.awt.*;
import javax.swing.*;
import javax.swing.BorderFactory.*;
import javax.swing.border.Border;
import java.awt.event.*;
import javax.swing.event.*;
import java.sql.*;
import java.io.*;

public class Bhootfrm extends JFrame implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18;
	JButton b1,b2,b3,b4,b5,b6;
	JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10;
	ImageIcon i1,i2,i3;
	public Bhootfrm()
	{
		setSize(1950,990);
		setVisible(true);
		//setTitle("Bhootfrm");
		getContentPane().setBackground(new Color(77,0,0));
		
		Font f2=new Font("Comic Sans MS",Font.BOLD,15);
		Font f3=new Font("Century Gothic",Font.BOLD,15);
		setLayout(null);
		l1=new JLabel("   Enter Customer Name : ");	
		l2=new JLabel("   Movie Name : ");	
		l3=new JLabel("   Enter Price : ");	
		l4=new JLabel("   Enter Date : ");	
		l5=new JLabel("   Enter Type of seat : ");	
		l6=new JLabel("   Enter No. of seats :  ");
		l7=new JLabel("   Enter Seat No. : ");
		l8=new JLabel("   Show Time : ");
		l9=new JLabel();
		l10=new JLabel();
		l11=new JLabel();
		l12=new JLabel();
		l13=new JLabel();
		l14=new JLabel();
		l15=new JLabel();
		l16=new JLabel("   Enter Customer ID : ");
		l17=new JLabel("   INFO. SECTION :-  ");
		l18=new JLabel("   Total Rs : ");
		
		i1=new ImageIcon("t1.PNG");
		i2=new ImageIcon("t2.PNG");
		i3=new ImageIcon("bhoot1_poster.JPG");
	
		l15.setIcon(i3);

		t1=new JTextField();
		t2=new JTextField(" Bhoot");
		t3=new JTextField(" Rs. 230/-");
		t4=new JTextField(" 00-01-2021");
		t5=new JTextField(" Premium/VIP/Silver");
		t6=new JTextField();
		t7=new JTextField(" Available F10-F50");
		t8=new JTextField(" 9am-12pm/4pm-7pm");
		t9=new JTextField();
		t10=new JTextField();	 //total rs

		b1=new JButton("Save");
		b2=new JButton("Clear");
		b3=new JButton("View");
		b4=new JButton("Print");
		b5=new JButton("About us");
		b6=new JButton("Exit");
		
		l1.setFont(f2);
		l2.setFont(f2);
		l3.setFont(f2);
		l4.setFont(f2);
		l5.setFont(f2);
		l6.setFont(f2);
		l7.setFont(f2);
		l8.setFont(f2);
		l16.setFont(f2);
		l17.setFont(f2);
		l18.setFont(f2);

		l11.setFont(f3);
		l12.setFont(f3);
		l13.setFont(f3);
		l14.setFont(f3);

		l1.setForeground(Color.WHITE);
		l2.setForeground(Color.WHITE);
		l3.setForeground(Color.WHITE);
		l4.setForeground(Color.WHITE);
		l5.setForeground(Color.WHITE);
		l6.setForeground(Color.WHITE);
		l7.setForeground(Color.WHITE);
		l8.setForeground(Color.WHITE);
		l16.setForeground(Color.WHITE);
		l17.setForeground(Color.WHITE);
		l18.setForeground(Color.WHITE);

		l11.setForeground(Color.BLACK);
		l12.setForeground(Color.BLACK);
		l13.setForeground(Color.BLACK);
		l14.setForeground(Color.BLACK);
		
		t1.setFont(f2);
		t2.setFont(f2);
		t3.setFont(f2);
		t4.setFont(f2);
		t5.setFont(f2);
		t6.setFont(f2);
		t7.setFont(f2);
		t8.setFont(f2);
		t9.setFont(f2);
		t10.setFont(f2);
		
		t1.setForeground(Color.RED);
		t2.setForeground(Color.WHITE);
		t3.setForeground(Color.RED);
		t4.setForeground(Color.WHITE);
		t5.setForeground(Color.RED);
		t6.setForeground(Color.WHITE);
		t7.setForeground(Color.RED);
		t8.setForeground(Color.WHITE);
		t9.setForeground(Color.WHITE);
		t10.setForeground(Color.RED);

		t1.setBackground(Color.WHITE);
		t2.setBackground(Color.RED);
		t3.setBackground(Color.WHITE);
		t4.setBackground(Color.RED);
		t5.setBackground(Color.WHITE);
		t6.setBackground(Color.RED);
		t7.setBackground(Color.WHITE);
		t8.setBackground(Color.RED);
		t9.setBackground(Color.RED);
		t10.setBackground(Color.WHITE);

		b1.setFont(f2);
		b2.setFont(f2);
		b3.setFont(f2);
		b4.setFont(f2);
		b5.setFont(f2);
		b6.setFont(f2);
		
		b1.setForeground(Color.WHITE);
		b2.setForeground(Color.WHITE);
		b3.setForeground(Color.WHITE);
		b4.setForeground(Color.WHITE);
		b5.setForeground(Color.WHITE);
		b6.setForeground(Color.WHITE);

		b1.setBackground(Color.RED);
		b2.setBackground(Color.RED);
		b3.setBackground(Color.RED);
		b4.setBackground(Color.RED);
		b5.setBackground(Color.RED);
		b6.setBackground(Color.RED);

		l17.setBounds(10,02,500,80);	//info section
		l16.setBounds(100,100,500,80);	//cust id 
		l1.setBounds(100,200,500,80);
		l2.setBounds(100,300,500,80);
		l3.setBounds(100,400,500,80);
		l4.setBounds(100,500,500,80);
		l5.setBounds(100,600,500,80);
		l6.setBounds(100,700,500,80);
		l7.setBounds(100,800,500,80);
		l8.setBounds(100,900,500,80);	
		l9.setBounds(700,600,1020,280);	//for t1
		l10.setBounds(1150,580,500,300);	//for t2
		l18.setBounds(700,900,500,80);	//total

		l11.setBounds(1250,650,500,100);	//for txt on t2
		l12.setBounds(1250,670,500,100);
		l13.setBounds(1250,690,500,100);
		l14.setBounds(1250,710,500,100);
		l15.setBounds(1100,100,350,400);	//poster
		
		t9.setBounds(300,120,280,40);
		t1.setBounds(300,220,280,40);
		t2.setBounds(300,320,280,40);
		t3.setBounds(300,420,280,40);
		t4.setBounds(300,520,280,40);
		t5.setBounds(300,620,280,40);
		t6.setBounds(300,720,280,40);
		t7.setBounds(300,820,280,40);
		t8.setBounds(300,920,280,40);
		t10.setBounds(900,920,280,40);
		
		b1.setBounds(1780,300,100,50);
		b2.setBounds(1780,200,100,50);
		b3.setBounds(1780,100,100,50);
		b4.setBounds(1780,600,100,50);
		b5.setBounds(1780,700,100,50);
		b6.setBounds(1780,800,100,50);

		l1.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));
		l2.setBorder(BorderFactory.createLineBorder(Color.RED,5));
		l3.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));
		l4.setBorder(BorderFactory.createLineBorder(Color.RED,5));
		l5.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));
		l6.setBorder(BorderFactory.createLineBorder(Color.RED,5));
		l7.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));
		l8.setBorder(BorderFactory.createLineBorder(Color.RED,5));
		l9.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));
		l15.setBorder(BorderFactory.createLineBorder(Color.WHITE,7));
		l16.setBorder(BorderFactory.createLineBorder(Color.RED,5));
		l18.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));


		t1.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		t2.setBorder(BorderFactory.createLineBorder(Color.RED));
		t3.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		t4.setBorder(BorderFactory.createLineBorder(Color.RED));
		t5.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		t6.setBorder(BorderFactory.createLineBorder(Color.RED));
		t7.setBorder(BorderFactory.createLineBorder(Color.WHITE));
		t8.setBorder(BorderFactory.createLineBorder(Color.RED));
		t9.setBorder(BorderFactory.createLineBorder(Color.RED));
		t10.setBorder(BorderFactory.createLineBorder(Color.WHITE));

		b1.setBorder(BorderFactory.createLineBorder(Color.RED));
		b2.setBorder(BorderFactory.createLineBorder(Color.RED));
		b3.setBorder(BorderFactory.createLineBorder(Color.RED));
		b4.setBorder(BorderFactory.createLineBorder(Color.RED));
		b5.setBorder(BorderFactory.createLineBorder(Color.RED));
		b6.setBorder(BorderFactory.createLineBorder(Color.RED));

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		

		add(l17);add(l16);add(l1);add(l2);add(l3);add(l4);add(l5);add(l6);add(l7);add(l8);add(l9);add(l18);
		add(l11);	add(l12);	add(l13);	add(l14);add(l10);add(l15);
		add(t9);add(t1);add(t2);add(t3);add(t4);add(t5);add(t6);add(t7);add(t8);add(t10);
		add(b1);add(b2);add(b3);add(b4);add(b6);
	
		

	}
	public void actionPerformed(ActionEvent ae)
	{
		String s1=ae.getActionCommand();
		if(s1.equals("View"))
		{
			l9.setIcon(i1);
			l10.setIcon(i2);
			l11.setText("Show Name  :  "+t2.getText());
			l12.setText("Date               :  "+t4.getText());
			l13.setText("Time               :  "+t8.getText());
			l14.setText("Seat                :  "+t5.getText()+ " ["+t7.getText() +"]" );
										
			String s3=t5.getText();
			if(s3.equals("Premium"))
			{
				t3.setText("Rs. 230/-");
				int y1=Integer.parseInt(t6.getText());	//billing
				t10.setText(" "+(230*y1)+"/- Only ");
			}
			if(s3.equals("VIP"))
			{
				t3.setText("Rs. 300/-");
				int y1=Integer.parseInt(t6.getText());	//billing
				t10.setText(" "+(300*y1)+"/- Only ");
			}
			if(s3.equals("Silver"))
			{
				t3.setText("Rs. 280/-");
				int y1=Integer.parseInt(t6.getText());	//billing
				t10.setText(" "+(280*y1)+"/- Only ");
			}
			
		}
		if(s1.equals("Clear"))
		{
			t1.setText("");
			t2.setText(" Bhoot");
			t3.setText(" Rs. 230/-");
			t4.setText(" 00-01-2021");
			t5.setText(" Premium/VIP/Silver");
			t7.setText(" Available F10-F50");
			t6.setText("");
			t8.setText(" 9am-12pm/4pm-7pm");
			t9.setText("");
		}
		if(s1.equals("Save"))
		{
			String s2=t1.getText();
			String s3="";
			if(s2.equals(s3))
			{
				JOptionPane.showMessageDialog(this,"Please enter Complete Information");
			}
			
			int a,g;
			String b,c,d,e,f,h,i;
			a=Integer.parseInt(t9.getText());
			g=Integer.parseInt(t6.getText());
			b=t1.getText();
			c=t2.getText();
			d=t3.getText();
			e=t4.getText();
			f=t5.getText();
			h=t7.getText();
			 i=t8.getText();

			try{
				Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
				System.out.println("Driver registered");

				Connection co=DriverManager.getConnection("jdbc:odbc:Movie Ticket Booking Database");
				System.out.println("Connection created");

				PreparedStatement ps=co.prepareStatement("insert into MovieTicket_tbl values(?,?,?,?,?,?,?,?,?)");
				ps.setInt(1,a);
				ps.setString(2,b);
				ps.setString(3,c);
				ps.setString(4,d);
				ps.setString(5,e);
				ps.setString(6,f);
				ps.setInt(7,g);
				ps.setString(8,h);
				ps.setString(9,i);

				ps.executeUpdate();
				JOptionPane.showMessageDialog(this,"Data Saved");
				System.out.println("Data Saved in table");
				

				ps.close();
				co.close();
		
			}catch(Exception e1){System.out.println(e1);}
		
		}
		if(s1.equals("Print"))
		{
			JOptionPane.showMessageDialog(this,"Printed Successfully");
		}
		
		if(s1.equals("About us"))
		{
			JOptionPane.showMessageDialog(this,"Info abt us");
		}
		if(s1.equals("Exit"))
		{
			//JOptionPane.showMessageDialog(this,"Exiting");
			this.dispose();
		}
	}
	

}
