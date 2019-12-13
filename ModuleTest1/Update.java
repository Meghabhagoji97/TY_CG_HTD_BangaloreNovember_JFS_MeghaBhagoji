package com.cgi.appdev.operatorcontactmain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Update 
{
	Connection conn= null;
	Statement stmt= null;
	PreparedStatement pstmt= null;
	ResultSet rs= null;



	public static void updateContact()

	{


		Scanner sc = new Scanner(System.in);
		String dburl="jdbc:mysql://127.0.0.1:3306/contactfile";
		System.out.println("enter the username and password");
		String user=sc.nextLine();
		String password=sc.nextLine();
		String query="update  contact set group1=? where name=?";

		try(Connection conn =DriverManager.getConnection(dburl,user,password);
				PreparedStatement pstmt = conn.prepareStatement(query))

		{

			System.out.println("enter the name");
			pstmt.setString(2, sc.nextLine());

			System.out.println("enter the new group");
			pstmt.setString(1, sc.nextLine());





			int count=pstmt.executeUpdate();
			if(count>0)
			{
				System.out.println("group updated.........");
			}
			else
			{
				System.err.println("something went wrong.....");
			}

		} catch (Exception e) {

			e.printStackTrace();
		}
	}
}
