import java.sql.*;
import java.io.*;

public class MT_pg0
{
	public static void main(String args[])
	{
		try{
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			System.out.println("driver registered");

			Connection co=DriverManager.getConnection("jdbc:odbc:Movie Ticket Booking Database");
			System.out.println("Connection created");
	 	
			Statement s=co.createStatement();

			s.execute("create table MovieTicket_tbl(Customer_ID INTEGER ,Customer_Name VARCHAR(20) ,Movie_Name VARCHAR(20) ,Ticket_Price VARCHAR(20) ,Movie_Date DATE, Seat_Type VARCHAR(20) , No_Of_Seats INTEGER ,Seat_No VARCHAR(20) ,Show_time VARCHAR(20))");
			System.out.println("Table MovieTicket_tbl created");

			s.close();
			co.close();
			}catch(Exception e)
			{}
	
	
	}
}