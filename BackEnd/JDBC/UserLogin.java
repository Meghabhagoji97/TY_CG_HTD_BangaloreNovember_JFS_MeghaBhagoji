package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLogin {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		//Statement stmt=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;

		try
		{
			//Load the Driver
			Driver driver = new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("Driver loaded.....");
			
			//get the DB connection via drivers
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("enter the username and password");
			String dbUser=sc.nextLine();
			String dbPass=sc.nextLine();
			
			conn=DriverManager.getConnection(dbUrl,dbUser,dbPass );	//driver manager is class and get connection is a static method		
			System.out.println("connection established........");
			
			// issue the SQL queries via connection
//			String query="select * from users_info where userid = 201534 and password = 'qwerty12' ";
//			stmt=conn.createStatement();
//			rs=stmt.executeQuery(query);
			String query="select * from users_info where userid=? and password=?";
			pstmt=conn.prepareStatement(query);
			System.out.println("enter the userid......");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("enter the password");
			pstmt.setString(2, sc.nextLine());
			rs=pstmt.executeQuery();
			System.out.println("query issued...........");
			
			//process the results returned by the SQL queries
			if(rs.next())
			{
				System.out.println("userid:"+rs.getInt(1));// 1 is for column index
				System.out.println("username:"+rs.getString(2));
				System.out.println("email:"+rs.getString(3));
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				if(conn!=null)
				{
					conn.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			try
			{
				if(pstmt!=null)
				{
					pstmt.close();
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
		
		
		//close all JDBC objects
	}

}
