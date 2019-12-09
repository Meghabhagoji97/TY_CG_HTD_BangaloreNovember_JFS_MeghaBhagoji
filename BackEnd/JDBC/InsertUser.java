package com.caps.jdbc;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertUser
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;
	
		//load the driver
		try {
			Driver driver=new com.mysql.jdbc.Driver();
			DriverManager.registerDriver(driver);
			System.out.println("driver laoded....");
			
			//get db connection via driver
			String dbUrl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
			System.out.println("enter the username and password");
			String dbUser=sc.nextLine();
			String dbPass=sc.nextLine();
			
			conn=DriverManager.getConnection(dbUrl,dbUser,dbPass );	//driver manager is class and get connection is a static method		
			System.out.println("connection established........");
			
			//issue the SQL queries
			String query="insert into users_info values(?,?,?,?)";
			pstmt=conn.prepareStatement(query);
			System.out.println("enter the userid......");
			pstmt.setInt(1, Integer.parseInt(sc.nextLine()));
			System.out.println("enter the username......");
			pstmt.setString(2, sc.nextLine());
			System.out.println("enter the email......");
			pstmt.setString(3, sc.nextLine());
			
			System.out.println("enter the password");
			pstmt.setString(4, sc.nextLine());
			int count=pstmt.executeUpdate();
			if(count>0)
			{
				System.out.println("user inserted..........");
			}
			else
			{
				System.err.println("something went wrong.....");
			}
		
			System.out.println("query issued...........");
			
						
		} catch (SQLException e) {
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
	}
}
