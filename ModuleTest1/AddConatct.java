package com.cgi.appdev.operatorcontactmain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddConatct {
	

public static void addContact()
	
	{
		
	
		Scanner sc = new Scanner(System.in);
		String dburl="jdbc:mysql://127.0.0.1:3306/contactfile";
		System.out.println("enter the username and password");
		String user=sc.nextLine();
		String password=sc.nextLine();
		String query="insert into contact values (?,?,?)";

		try(Connection conn =DriverManager.getConnection(dburl,user,password);
				PreparedStatement pstmt = conn.prepareStatement(query))
		
							{
			
			System.out.println("enter the name......");
			pstmt.setString(1, sc.nextLine());
			System.out.println("enter the number......");
			pstmt.setInt(2, Integer.parseInt(sc.nextLine()));
			System.out.println("enter the group.......");
			pstmt.setString(3, sc.nextLine());
			int count=pstmt.executeUpdate();
			if(count>0)
			{
				System.out.println("contact added.........");
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
