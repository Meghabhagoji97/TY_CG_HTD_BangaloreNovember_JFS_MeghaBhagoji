package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DeleteUser
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Connection conn=null;//created outside try because we are using this in finally block too so
		PreparedStatement pstmt=null;
		
		//load the driver
		
		try {
//			Driver driver=new com.mysql.jdbc.Driver();
//			DriverManager.registerDriver(driver);
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("driver loaded......");
			
			// get the db connection
			String dburl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("enter the username and password");
			String user=sc.nextLine();
			String password=sc.nextLine();
			conn=DriverManager.getConnection(dburl, user, password);
			System.out.println("connection estd............");
			//issue the SQL queries
			String query="delete from users_info where userid=? and password=?";
			pstmt=conn.prepareStatement(query);
			System.out.println("enter the userid");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("enter the password");
			pstmt.setString(2, sc.nextLine());//2 is the parameter index
			int count=pstmt.executeUpdate();
			if(count>0)
			{
				System.out.println("user deleted..........");
			}
			else
			{
				System.err.println("something went wrong.....");
			}
		
			} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(conn!=null)
			{
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				try
				{
					if(pstmt!=null)
					{
						pstmt.close();
					}
				}
				catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
		}
		
		
		
		//close all the JDBC objects
	}
}
