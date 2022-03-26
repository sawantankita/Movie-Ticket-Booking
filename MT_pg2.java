import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import javax.swing.BorderFactory.*;
import javax.swing.border.Border;	
public class MT_pg2 extends JFrame implements ActionListener
 {
	
	public MT_pg2()
	{
		Font f1=new Font("Comic Sans MS",Font.BOLD,20);
		setLayout(null);
		setVisible(true);
		setTitle("Booking Page");
		setSize(1950,1000);
		JLabel l1=new JLabel();
		ImageIcon i1=new ImageIcon("bharat_poster.PNG");
		ImageIcon i2=new ImageIcon("gold_poster.JPG");
		ImageIcon i3=new ImageIcon("soorma_poster.JPG");
		ImageIcon i4=new ImageIcon("classof83_poster.JPG");
		ImageIcon i5=new ImageIcon("simmba_poster.JPG");
		ImageIcon i6=new ImageIcon("gunjan_poster.JPG");
		ImageIcon i7=new ImageIcon("mt_bg.jpg");
		ImageIcon i8=new ImageIcon("baaghi3_poster.JPG");
		ImageIcon i9=new ImageIcon("bhoot_poster.JPG");
		ImageIcon i10=new ImageIcon("panga_poster.JPG");
		ImageIcon i11=new ImageIcon("dilbechara_poster.PNG");

		ImageIcon i12=new ImageIcon("83_poster.JPG");
		ImageIcon i13=new ImageIcon("bellbottom_poster.JPG");
		ImageIcon i14=new ImageIcon("heropanti2_poster.JPG");
		ImageIcon i15=new ImageIcon("maidaan_poster.JPG");
		ImageIcon i16=new ImageIcon("adipurush_poster.JPG");
		ImageIcon i17=new ImageIcon("bachan_poster.JPG");

		JButton b1=new JButton("History");
		JButton b2=new JButton("Exit");
		JButton b3=new JButton("Features");
		JButton b4=new JButton("Franchises");

		JLabel l12=new JLabel();
		JLabel l13=new JLabel();
		JLabel l14=new JLabel();
		JLabel l15=new JLabel();
		JLabel l16=new JLabel();
		JLabel l17=new JLabel();
		JLabel l18=new JLabel();
		JLabel l19=new JLabel("                 UPCOMING MOVIES");
		JLabel l20=new JLabel("                 CURRENT MOVIES");

		l12.setIcon(i12);
		l13.setIcon(i13);
		l14.setIcon(i14);
		l15.setIcon(i15);
		l16.setIcon(i16);
		l17.setIcon(i17);
				
		//DATA FOR OUR TABLE
		Object[][] data=
		{
			{"   1. Drama/Action",i1,"Salmaan Khan,Katrina Kaif ","Book Bharat"},
			{"   2. Sports/Drama ",i2,"Akshay Kumar,Mouni Roy","Book Gold"},
			{"  3. Sports/Drama",i3,"Diljit Dosanjh,Taapsee Pannu","Book Soorma"},
			{"  4. Action/Thriller",i4,"Bobby Deol,Geetika Tyagi","Book Class of 83"},
			{"  5. Action/Drama",i5,"Ranveer Singh/Sara Khan","Book Simba"},
			{"  6. Drama",i6,"Janhvi Kapoor,Pankaj Tripathi","Book Gunjan Saxena"},
			{"  7. Action/Thriller",i8,"Tiger Shroff,Shraddha Kapoor","Book Baaghi3"},
			{"  8. Thriller",i9,"Vicky Kaushal,Bhumi Pednekar","Book Bhoot"},
			{"  9. Sports/Drama",i10,"Kangana Raunat,Jassie Gill","Book Panga"},
			{"  10. Romance",i11,"Sushant Rajput,Sanjana Sanghi","Book Dil bechara"},
		};
	
		//COLUMN HEADERS
		String columnHeaders[]={"Sr no/Type","Poster","Cast Info","Booking"};

		//CREATE OUR TABLE AND SET HEADER
		JTable table=new JTable(data,columnHeaders)
		{
			public Class getColumnClass(int column)
			{
				return getValueAt(1,column).getClass(); //for img at column-1
			
			}
		};
	
		
		//SET CUSTOM RENDERER TO BUTTONS COLUMN
		table.getColumnModel().getColumn(3).setCellRenderer(new ButtonRenderer());;
	
		//SET CUSTOM EDITOR TO BUTTONS COLUMN
		table.getColumnModel().getColumn(3).setCellEditor(new ButtonEditor(new JTextField()));
	
		//SCROLLPANE,SET SZE,SET CLOSE OPERATION
		l1.setIcon(i7);
		l1.setBounds(0,0,1950,1000);
		add(l1);
		JScrollPane pane=new JScrollPane(table);
		pane.setOpaque(false);
		pane.getViewport().setOpaque(false);
		
		l12.setBounds(100,110,200,300);
		l13.setBounds(350,110,200,300);
		l14.setBounds(100,390,200,300);
		l15.setBounds(350,390,200,300);
		l16.setBounds(100,680,200,300);
		l17.setBounds(350,690,200,300);

		l18.setBounds(80,110,490,890);
		l19.setBounds(80,20,490,50);
		l20.setBounds(650,20,490,50);

		l19.setForeground(Color.WHITE);
		l19.setFont(f1);
		l20.setForeground(Color.WHITE);
		l20.setFont(f1);

		l18.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));	//exit m abt button styling
		l19.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));
		l20.setBorder(BorderFactory.createLineBorder(Color.WHITE,5));
		b1.setBorder(BorderFactory.createLineBorder(Color.RED));
		b2.setBorder(BorderFactory.createLineBorder(Color.RED));
		b3.setBorder(BorderFactory.createLineBorder(Color.RED));
		b4.setBorder(BorderFactory.createLineBorder(Color.RED));
		b1.setFont(f1);
		b2.setFont(f1);
		b3.setFont(f1);
		b4.setFont(f1);
		b1.setForeground(Color.WHITE);
		b2.setForeground(Color.WHITE);
		b3.setForeground(Color.WHITE);
		b4.setForeground(Color.WHITE);
		b1.setBackground(Color.RED);
		b2.setBackground(Color.RED);
		b3.setBackground(Color.RED);
		b4.setBackground(Color.RED);


		pane.setBounds(650,110,1200,700);
		table.setBounds(650,110,1200,700);
		table.setFont(f1);
		table.setForeground(Color.white);
		table.setRowHeight(table.getRowHeight()+200);
		table.setShowVerticalLines(false);
		table.setBackground(Color.RED);
		table.setGridColor(Color.white);

		b1.setBounds(1610,900,120,50);
		b2.setBounds(1780,900,120,50);
		b3.setBounds(1410,900,120,50);
		b4.setBounds(1210,900,120,50);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);

		l1.add(pane);	l1.add(l12);	l1.add(l13);	
		l1.add(l14);	l1.add(l15);	l1.add(l16);	
		l1.add(l17);	l1.add(l18);	l1.add(l19);
		l1.add(l20);	l1.add(b1);	l1.add(b2);l1.add(b3);	l1.add(b4);
		setSize(1950,990);
	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String ss=ae.getActionCommand();
		if(ss.equals("History"))
		{
			//new tpane();
			//JOptionPane.showMessageDialog(this,"opening History");
			new History();
			this.dispose();
				
		}
		if(ss.equals("Features"))
		{
			
			//JOptionPane.showMessageDialog(this,"opening features");
			new Features();	
			this.dispose();
			
		}
		if(ss.equals("Franchises"))
		{
			
			//JOptionPane.showMessageDialog(this,"opening franchises");	
			new Franchises();
			this.dispose();
			
		}
		if(ss.equals("Exit"))
		{
			JOptionPane.showMessageDialog(this,"Do you want to Quit?");
			this.dispose();
			
		}

	}
	
	//public static void main(String[] args)
	//{
		//MT_pg2 bc=new MT_pg2();
		
	//}

}

	//BUTTON RENDERER CLASS
	class ButtonRenderer extends JButton implements  TableCellRenderer
	{

		//CONSTRUCTOR
		public ButtonRenderer()
		 {
		
			//SET BUTTON PROPERTIES
			Font f2=new Font("Comic Sans MS",Font.BOLD,25);
			setFont(f2);
			setForeground(Color.white);
			setBackground(Color.red);
			setOpaque(true);
		}
		@Override
		public Component getTableCellRendererComponent(JTable table, Object obj,
			boolean selected, boolean focused, int row, int col)
			 {
	
				//SET PASSED OBJECT AS BUTTON TEXT
				setText((obj==null) ? "":obj.toString());
				return this;
			}
	
	}

	//BUTTON EDITOR CLASS
	class ButtonEditor extends DefaultCellEditor
	{
		protected JButton btn;
		 private String lbl;
		 private Boolean clicked;
	 
		 public ButtonEditor(JTextField txt)
		 {
			super(txt);
			btn=new JButton();
			btn.setOpaque(true);
		
			//WHEN BUTTON IS CLICKED
			btn.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				 {
				
					fireEditingStopped();
				}
			});
	}
	 
		 //OVERRIDE A COUPLE OF METHODS
		 @Override
		public Component getTableCellEditorComponent(JTable table, Object obj,
			boolean selected, int row, int col) 
		{

			//SET TEXT TO BUTTON,SET CLICKED TO TRUE,THEN RETURN THE BTN OBJECT
			 lbl=(obj==null) ? "":obj.toString();  //conditional operator as obj btn is not null so it will be converted into string
			 btn.setText(lbl);
			 clicked=true;
			return btn;
		}
	 
		//IF BUTTON CELL VALUE CHNAGES,IF CLICKED THAT IS
		 @Override
		public Object getCellEditorValue()
		 {

			 if(clicked)
			{
				//SHOW US SOME MESSAGE
				if(lbl=="Book Bharat")
				{
					//JOptionPane.showMessageDialog(btn, lbl+"  booking ticket 1");
					new Bharatfrm();
					
				}
				if(lbl=="Book Gold")
				{
					//JOptionPane.showMessageDialog(btn, lbl+" Clicked booked ticket 2");
					new Goldfrm();
				}
				if(lbl=="Book Soorma")
				{
					//JOptionPane.showMessageDialog(btn, lbl+" Clicked booked ticket 3");
					new Soormafrm();
				}
				if(lbl=="Book Class of 83")
				{
					//JOptionPane.showMessageDialog(btn, lbl+" Clicked booked ticket 4");
					new Classof83frm();
				}
				if(lbl=="Book Simba")
				{
					//JOptionPane.showMessageDialog(btn, lbl+" Clicked booked ticket 5");
					 new Simmbafrm();
				}
				if(lbl=="Book Gunjan Saxena")
				{
					//JOptionPane.showMessageDialog(btn, lbl+" Clicked booked ticket 6");
					new Gunjanfrm();
				}
				if(lbl=="Book Baaghi3")
				{
					//JOptionPane.showMessageDialog(btn, lbl+" Clicked booked ticket 7");
					new Baaghi3frm();
				}
				if(lbl=="Book Bhoot")
				{
					//JOptionPane.showMessageDialog(btn, lbl+" Clicked booked ticket 8");
					new Bhootfrm();
				}
				if(lbl=="Book Panga")
				{
					//JOptionPane.showMessageDialog(btn, lbl+" Clicked booked ticket 9");
					new Pangafrm();
				}
				if(lbl=="Book Dil bechara")
				{
					//JOptionPane.showMessageDialog(btn, lbl+" Clicked booked ticket 10");
					new Dilbecharafrm();
				}
				
				
			}
			//SET IT TO FALSE NOW THAT ITS CLICKED
			clicked=false;
	 		 return new String(lbl);
		}
	
		 @Override
		public boolean stopCellEditing() 
		{

	   	   	 //SET CLICKED TO FALSE FIRST
			clicked=false;
			return super.stopCellEditing();
		}
	 
		 @Override
		protected void fireEditingStopped()
		 {
			// TODO Auto-generated method stub
			super.fireEditingStopped();
		}
}

