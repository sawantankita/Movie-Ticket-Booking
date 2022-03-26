import javax.swing.tree.*;
import javax.swing.BorderFactory.*;
import javax.swing.border.Border;
import java.sql.*;
import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;

class Franchises extends JFrame implements ActionListener
{
		JTree jt1;
		ImageIcon i1;
		JLabel l1,l2;
		JButton b1;
		public Franchises()
		{	
			setLayout(null);
			setSize(1950,980);
			setVisible(true);
			//setDefaultCloseOperation(EXIT_ON_CLOSE);
			setTitle("Franchise Page");
			Font f1=new Font("Comic Sans MS",Font.BOLD,20);
			//getContentPane().setBackground(new Color(77,0,0));
			i1=new ImageIcon("franchise_bg.JPG");
			l1=new JLabel();
			l2=new JLabel("Our Franchises available at : ");	
			b1=new JButton("Exit");
			l1.setIcon(i1);
			

			DefaultMutableTreeNode d1=new DefaultMutableTreeNode("MAHARASHTRA");
			DefaultMutableTreeNode d2=new DefaultMutableTreeNode("MUMBAI");
			DefaultMutableTreeNode d3=new DefaultMutableTreeNode("PUNE");
			DefaultMutableTreeNode d4=new DefaultMutableTreeNode("KOLHAPUR");
			DefaultMutableTreeNode d5=new DefaultMutableTreeNode("SANGLI");
			d1.add(d2);
			d1.add(d3);
			d1.add(d4);
			d1.add(d5);
	
			DefaultMutableTreeNode d21=new DefaultMutableTreeNode("ANDHERI");
			DefaultMutableTreeNode d22=new DefaultMutableTreeNode("BANDRA");
			DefaultMutableTreeNode d23=new DefaultMutableTreeNode("GOREGAON");
			d2.add(d21);
			d2.add(d22);
			d2.add(d23);
	
			DefaultMutableTreeNode d31=new DefaultMutableTreeNode("CHAKAN");
			DefaultMutableTreeNode d32=new DefaultMutableTreeNode("HADAPSAR");
			DefaultMutableTreeNode d33=new DefaultMutableTreeNode("SASWAD");
			d3.add(d31);
			d3.add(d32);
			d3.add(d33);

			DefaultMutableTreeNode d41=new DefaultMutableTreeNode("KAGAL");
			d4.add(d41);

			DefaultMutableTreeNode d51=new DefaultMutableTreeNode("MIRAJ");
			d5.add(d51);
		
			jt1=new JTree(d1);
			jt1.setFont(f1);
			l2.setFont(f1);
			b1.setFont(f1);
			l2.setForeground(Color.RED);
			jt1.setBackground(Color.RED);
			b1.setForeground(Color.WHITE);
			b1.setBackground(Color.RED);
			jt1.setBorder(BorderFactory.createLineBorder(Color.BLACK,5));
			b1.setBorder(BorderFactory.createLineBorder(Color.RED));
			jt1.setBounds(1200,200,500,500);
			l1.setBounds(0,0,1950,950);
			l2.setBounds(1000,100,500,100);
			b1.setBounds(1400,800,100,40);

	 		add(l1);	 l1.add(l2);		l1.add(jt1);	l1.add(b1);
			b1.addActionListener(this);
	
	
		}
		public void actionPerformed(ActionEvent ae)
		{
			String ss1=ae.getActionCommand();
			
			if(ss1.equals("Exit"))
			{
				//JOptionPane.showMessageDialog(this,"closing ");
				new MT_pg2();
				this.dispose();
				
				
			}
		
		}
	}	