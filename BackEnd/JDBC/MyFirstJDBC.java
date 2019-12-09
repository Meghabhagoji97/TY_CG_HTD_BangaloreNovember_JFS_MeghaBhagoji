package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MyFirstJDBC {

	public static void main(String[] args) {
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;

		//load the driver
		try {
			//			Driver driver=new com.mysql.jdbc.Driver();//eg: inserting  the sim card
			//			DriverManager.registerDriver(driver);//register the user

			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver loaded.......");


			//get the DBConnection via driver
			String dburl="jdbc:mysql://localhost:3306/ty_cg_nov6"+"?user=root&password=root";//providing the url
			conn=DriverManager.getConnection(dburl);//forming the connection
			System.out.println("connection established.....");

			//issue the SQL queries
			String query="SELECT * FROM users_info";
			stmt=conn.createStatement();// converts string into statement
			rs=stmt.executeQuery(query);  //executes the query  
			System.out.println("Query Issued.......");
			System.out.println("*********************************************");

			//process the results via connection
			while(rs.next())
			{
				System.out.println("Userid: "+rs.getInt("userid"));
				System.out.println("Username: "+rs.getString("username"));
				System.out.println("Email: "+rs.getString("email"));
				System.out.println("password:"+rs.getString("password"));
				
				System.out.println("................................................");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		//close the JDBC objects
		finally
		{
			try {

				if(conn!=null)
				{
					conn.close();
				} 
			}catch (SQLException e) {
				e.printStackTrace();

			}
			try
			{
				if(stmt!=null)
				{
					stmt.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			try
			{
				if(rs!=null)
				{
					rs.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}





	}

}
