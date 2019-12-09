package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UserEmailUpdate 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		Connection conn=null;
		PreparedStatement pstmt=null;
		
		
		
		//close all the jdbc objects
		
		try {
			//load the driver
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("diver loaded....");
			
			//get DB connection via driver
			String dburl="jdbc:mysql://localhost:3306/ty_cg_nov6";
			System.out.println("enter the db user and passowrd");
			String user=sc.nextLine();
			String password=sc.nextLine();
			conn=DriverManager.getConnection(dburl, user,password);
			
			System.out.println("connection estd....");
			
			//Issue the SQL Queries via conn
			String query="update users_info set email=? where userid=? and password=?";
			pstmt=conn.prepareStatement(query);
			//we cannot execute the query directly since there are unknowns in the query
			System.out.println("enter the userid");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			
			System.out.println("enter the new email");
			pstmt.setString(1, sc.nextLine());
			
			System.out.println("enter the password to update");
			pstmt.setString(3, sc.nextLine());
			
			int count=pstmt.executeUpdate();
			
			//Process the results returned by the query

			if(count>0)
			{
				System.out.println("Query OK,"+count+"rows affected");
			}
			else
			{
				System.out.println("something went wrong");
			}	
			
		} 
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
					if(pstmt!=null)
					{
						pstmt.close();
					}
				}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
		}		
	}
}
