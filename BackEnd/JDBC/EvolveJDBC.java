package com.caps.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class EvolveJDBC
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		String dburl="jdbc:mysql://127.0.0.1:3306/ty_cg_nov6";
		System.out.println("enter the username and password");
		String user=sc.nextLine();
		String password=sc.nextLine();
		String query="SELECT * FROM users_info";
		
		try(Connection conn=DriverManager.getConnection(dburl ,user, password);
				Statement stmt=conn.createStatement();
				ResultSet rs= stmt.executeQuery(query))
		{
			while(rs.next())
			{
				System.out.println("usersid :"+rs.getInt(1));
				System.out.println("username :"+rs.getString(2));
				System.out.println("emil :"+rs.getString(3));
				System.out.println("-------------------------------------");
			}
			sc.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
