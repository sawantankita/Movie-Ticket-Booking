import javax.swing.BorderFactory.*;
import javax.swing.border.Border;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;


class Features extends JFrame implements ActionListener
{
	ImageIcon i1,i2,i3,i4,i5,i6,i7,i8;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
	JButton b1,b2,b3;
	CardLayout c1;
	Panel p1,p2,p3,p4,p5,p6,p7,p8,p9;

	public Features()
	{
		getContentPane().setBackground(Color.YELLOW);
		setLayout(null);
		setSize(1950,980);
		setVisible(true);
		setTitle("Features Page");
		Font f1=new Font("Comic Sans MS",Font.BOLD,25);
					
		b1=new JButton(" - ");
		b2=new JButton(" + ");
		b3=new JButton("Exit");
		
		p1=new Panel();
		p1.setBounds(500,200,900,700);
		p1.setBackground(Color.red);
		c1=new CardLayout();
		p1.setLayout(c1);
	
		l1=new JLabel();
		l2=new JLabel();
		l3=new JLabel();
		l4=new JLabel();
		l5=new JLabel();
		l6=new JLabel();
		l7=new JLabel();
		l8=new JLabel();

		l9=new JLabel("Your safety is our first priority");
		l10=new JLabel("Adjacent seat will be left empty");
		l11=new JLabel("Temperature check will be the new normal");
		l12=new JLabel("Wearing mask will be mandatory");
		l13=new JLabel("You will need to have Arogya Setu installed");
		l14=new JLabel("Hygiene comes first");
		l15=new JLabel("Demarcations on the floor to maintain social distancing");
		l16=new JLabel("Our halls are sanitized after every show");
		l17=new JLabel("***OUR FEATURES***");
	

		i1=new ImageIcon("s1.PNG");
		i2=new ImageIcon("s2.PNG");
		i3=new ImageIcon("s3.PNG");
		i4=new ImageIcon("s4.PNG");
		i5=new ImageIcon("s5.PNG");
		i6=new ImageIcon("s6.PNG");
		i7=new ImageIcon("s7.PNG");
		i8=new ImageIcon("s8.PNG");

		l1.setIcon(i1);
		l2.setIcon(i2);
		l3.setIcon(i3);
		l4.setIcon(i4);
		l5.setIcon(i5);
		l6.setIcon(i6);
		l7.setIcon(i7);
		l8.setIcon(i8);

		b1.setFont(f1);
		b2.setFont(f1);
		l9.setFont(f1);
		l10.setFont(f1);
		l11.setFont(f1);
		l12.setFont(f1);
		l13.setFont(f1);
		l14.setFont(f1);
		l15.setFont(f1);
		l16.setFont(f1);
		l17.setFont(f1);
		b3.setFont(f1);


		b1.setForeground(Color.WHITE);
		b1.setBackground(Color.RED);
		b2.setForeground(Color.WHITE);
		b2.setBackground(Color.RED);
		b3.setForeground(Color.WHITE);
		b3.setBackground(Color.RED);
		l9.setForeground(Color.RED);
		l10.setForeground(Color.RED);
		l11.setForeground(Color.RED);
		l12.setForeground(Color.RED);
		l13.setForeground(Color.RED);
		l14.setForeground(Color.RED);
		l15.setForeground(Color.RED);
		l16.setForeground(Color.RED);
		l17.setForeground(Color.RED);
		b1.setBorder(BorderFactory.createLineBorder(Color.RED));
		b2.setBorder(BorderFactory.createLineBorder(Color.RED));
		b3.setBorder(BorderFactory.createLineBorder(Color.RED));
		
		
		b1.setBounds(420,400,80,50);
		b2.setBounds(1400,400,80,50);
		b3.setBounds(900,900,100,40);
		//l9.setBounds(80,1050,800,300);
		l17.setBounds(800,100,800,100);

		add(b1);	add(b2);	add(l17);	add(b3);
		

		p2=new Panel();
		p2.setBackground(Color.YELLOW);
		p2.add(l1); 
		p2.add(l9);
		
		p3=new Panel();
		p3.setBackground(Color.YELLOW);
		p3.add(l2);
		p3.add(l10);
	
		p4=new Panel();
		p4.setBackground(Color.YELLOW);
		p4.add(l3); 
		p4.add(l11);
		
		p5=new Panel();
		p5.setBackground(Color.YELLOW);
		p5.add(l4);
		p5.add(l12);
		
		p6=new Panel();
		p6.setBackground(Color.YELLOW);
		p6.add(l5);
		p6.add(l13);
		
		p7=new Panel();
		p7.setBackground(Color.YELLOW);
		p7.add(l6);
		p7.add(l14);
	
		p8=new Panel();
		p8.setBackground(Color.YELLOW);
		p8.add(l7);
		p8.add(l15);
		
		p9=new Panel();
		p9.setBackground(Color.YELLOW);
		p9.add(l8);
		p9.add(l16);

		p1.add(p2,"c1");
		p1.add(p3,"c1");
		p1.add(p4,"c1");
		p1.add(p5,"c1");
		p1.add(p6,"c1");
		p1.add(p7,"c1");
		p1.add(p8,"c1t");
		p1.add(p9,"c1");

		add(p1);
		
		b1.addActionListener(this);
		b2.addActionListener(this);	
		b3.addActionListener(this);	
		
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		
		if(ae.getSource()==b1)
		{
			c1.previous(p1);
			
		}
		if(ae.getSource()==b2)
		
		{
			c1.next(p1);	
		}
		if(ae.getSource()==b3)
		{
			//JOptionPane.showMessageDialog(this,"closing ");
			new MT_pg2();
			this.dispose();
				
				
		}
	}
					
}
