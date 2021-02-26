package com.custom;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import com.sun.jdi.Location;

public class CustomerDBUtil {
	
	// 
	private final static Logger logger = Logger.getLogger(CustomerDBUtil.class.getName());
	//private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	
	public static List<Customer> validate(String userName, String Password){
		
		ArrayList<Customer> cus= new ArrayList<>();
		
		//Parameters for database
		//String url = "jdbc:mysql://localhost:3306/hotel";
		//String user = "root";
		//String pass = "root";
		
		logger.info("database connection starting =================> start");
		try {
			//database Connection
			//Class.forName("com.mysql.jdbc.Driver");
			
			//Connection con = DriverManager.getConnection(url,user,pass);
			con =  DBConnect.getConnection();
			Statement stmt = con.createStatement();
			String sql = "select * from customer where username='"+userName+"' and password='"+Password+"'";
			rs= stmt.executeQuery(sql);
			System.out.println(rs);
			//next is a boolean method
		if (rs.next()){
			//get all the details from database
			int id = rs.getInt(1);
			String name = rs.getString(2);
			String email = rs.getString(3);
			String phone = rs.getString(4);
			String userU = rs.getString(5);
			String passU = rs.getString(6);
			
			//assign to customer.java class paramenters 
			Customer c = new Customer(id, name, email, phone, userU, passU);
			//add to cus array 
			cus.add(c);
			
		}
			
		}catch(Exception e) {
			System.out.println("Database connection is not success!!!");
			e.printStackTrace();
		
		}
		
		// return ThemeReader array
		return cus;
	}
		
	
 	public static List<Location> location(int id){
		
		ArrayList<location> cus= new ArrayList<>();

		try {

			con =  DBConnect.getConnection();
			Statement stmt = con.createStatement();
			String sql = "select * from location where username='"+id+"'";
			rs= stmt.executeQuery(sql);
	//	System.out.println(rs);
			//next is a boolean method
		if (rs.next()){
			//get all the details from database
			String latitude = rs.getString(1);
			String longitude = rs.getString(2);
			
			
			//assign to customer.java class paramenters 
			Customer c = new Customer(latitude,longitude);
			//add to cus array 
			cus.add(c);
			
		}
			
		}catch(Exception e) {
			System.out.println("Database connection is not success!!!");
			e.printStackTrace();
		
		}
		
		// return ThemeReader array
		return cus;
	}
	
	
	public static boolean insertCustomer(String name,String email, String phone, String username, String password) {
		
		boolean isSuccess = false;

		//Parameters for database
		//String url = "jdbc:mysql://localhost:3306/hotel";
		//String user = "root";
		//String pass = "root";
		
		try {
			//database Connection
			//Class.forName("com.mysql.jdbc.Driver");
			
			//Connection con = DriverManager.getConnection(url,user,pass);
			
			con =  DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "insert into customer values (0,'"+name+"','"+email+"','"+phone+"','"+username+"','"+password+"')";
			int rs = stmt.executeUpdate(sql);
		
			if (rs > 0){
					isSuccess = true;
					
			}else {
					isSuccess = false;
					
			}
			
		}catch(Exception e) {
			System.out.println("Database connection is unsuccess!!!");
			
			e.printStackTrace();
		
		}
		
		return isSuccess;
		
	}

	public static boolean updateCustomer(String id, String name,String email, String phone, String username, String password ) {
		
		boolean isSuccess = false;
		try {
			
			con =  DBConnect.getConnection();
			stmt = con.createStatement();
			
			String sql = "update customer set name='"+name+"',email='"+email+"',phone='"+phone+"',username='"+username+"',password='"+password+"'"
					+ "where id='"+id+"' ";
			int rs = stmt.executeUpdate(sql);
			
			if (rs > 0){
					isSuccess = true;
					
			}else {
					isSuccess = false;
					
			}
		
		}catch(Exception e) {
			System.out.println("Database connection is unsuccess!!!");
		
			e.printStackTrace();
	
		}
	
		return isSuccess;
		
	}
	
}

	
