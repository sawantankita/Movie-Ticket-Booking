import javax.swing.BorderFactory.*;
import javax.swing.border.Border;
import java.sql.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;



public class History extends JFrame implements ActionListener
{
		JButton b1,b2,b3;
		JLabel l1,l2;
		JTextField t1;
		ImageIcon i1;
		JTable jt1;
		public History()
		{
			setLayout(null);
			setVisible(true);
			setSize(1950,950);
			setTitle("History Page");
			Font f1=new Font("Comic Sans MS",Font.BOLD,15);
			//getContentPane().setBackground(new Color(77,0,0));
			i1=new ImageIcon("history_bg.JPG");
			l1=new JLabel("  Enter Customer ID : ");
			l2=new JLabel();
			t1=new JTextField();
			b1=new JButton("Refresh");
			b2=new JButton("Delete");
			b3=new JButton("Exit");
			l2.setIcon(i1);

			l1.setBounds(200,100,540,70);
			l2.setBounds(0,0,1950,980);
			t1.setBounds(400,120,300,30);
			b1.setBounds(200,200,100,40);
			b2.setBounds(400,200,100,40);
			b3.setBounds(600,200,100,40);

			l1.setFont(f1);
			t1.setFont(f1);
			b1.setFont(f1);
			b2.setFont(f1);
			b3.setFont(f1);

			l1.setForeground(Color.RED);
			l1.setBackground(Color.BLACK);
			t1.setForeground(Color.WHITE);
			t1.setBackground(Color.RED);
			b1.setForeground(Color.WHITE);
			b1.setBackground(Color.RED);
			b2.setForeground(Color.WHITE);
			b2.setBackground(Color.RED);
			b3.setForeground(Color.WHITE);
			b3.setBackground(Color.RED);
			l1.setBorder(BorderFactory.createLineBorder(Color.RED,5));
			t1.setBorder(BorderFactory.createLineBorder(Color.RED,5));
			b1.setBorder(BorderFactory.createLineBorder(Color.RED));
			b2.setBorder(BorderFactory.createLineBorder(Color.RED));
			b3.setBorder(BorderFactory.createLineBorder(Color.RED));
		

			add(l2);
			l2.add(l1);
			l2.add(t1);
			l2.add(b1);
			l2.add(b2);
			l2.add(b3);
	
			b1.addActionListener(this);
			b2.addActionListener(this);
			b3.addActionListener(this);
		}
		public void actionPerformed(ActionEvent ae)
		{
			String ss1=ae.getActionCommand();
			
			if(ss1.equals("Refresh"))
			{
				try
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					System.out.println("Driver registered");

					Connection co=DriverManager.getConnection("jdbc:odbc:Movie Ticket Booking Database");
					System.out.println("Connection created");
		

					PreparedStatement ps=co.prepareStatement("select * from MovieTicket_tbl");
		
					ResultSet rs=ps.executeQuery();
					String col[]={"ID","CUSTOMER_NAME","MOVIE_NAME","TICKET_PRICE","MOVIE_DATE","SEAT_TYPE","NO_OF_SEATS","SEAT_NO","SHOW_TIME"};
					String rows[][]={
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""},
							{"","","","","","","","",""}
						};
						

					 jt1=new JTable(rows,col);
					Font f1=new Font("Comic Sans MS",Font.BOLD,12);
					JScrollPane jsp=new JScrollPane(jt1);
					jt1.setFont(f1);
					jt1.setRowHeight(40);
					jt1.setBackground(Color.YELLOW);
					jsp.setBounds(100,300,1500,600);
					int i=0;
					while(rs.next())
					{
						jt1.setValueAt(""+rs.getInt(1),i,0);
						jt1.setValueAt(rs.getString(2),i,1);
						jt1.setValueAt(rs.getString(3),i,2);
						jt1.setValueAt(rs.getString(4),i,3);
						jt1.setValueAt(rs.getString(5),i,4);
						jt1.setValueAt(rs.getString(6),i,5);
						jt1.setValueAt(""+rs.getInt(7),i,6);
						jt1.setValueAt(rs.getString(8),i,7);
						jt1.setValueAt(rs.getString(9),i,8);
						i++;
					}
		
					ps.close();
					co.close();
					add(jsp);
				}catch(Exception e){System.out.println(e);}
				
			}
			if(ss1.equals("Delete"))
			{
				try
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					System.out.println("Driver registered");
					Connection co=DriverManager.getConnection("jdbc:odbc:Movie Ticket Booking Database");
					System.out.println("Connection Created");
					int a,c,d;
					String b;

					 a=Integer.parseInt(t1.getText());
					//b=t2.getText();
					//c=Integer.parseInt(t3.getText());
					//d=Integer.parseInt(t4.getText());

					PreparedStatement ps=co.prepareStatement("delete from MovieTicket_tbl where Customer_ID=?");
					ps.setInt(1,a);

					ps.executeUpdate();
					JOptionPane.showMessageDialog(this,"deleted successfully");
					ps.close();
					co.close();
				}catch(Exception e){System.out.println(e);}
				
			}
			if(ss1.equals("Exit"))
			{
				//JOptionPane.showMessageDialog(this,"closing ");
				new MT_pg2();
				this.dispose();
				
				
			}	
		}
		
}