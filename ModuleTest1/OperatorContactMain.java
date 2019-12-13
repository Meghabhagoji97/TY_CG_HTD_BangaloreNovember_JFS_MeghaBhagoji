package com.cgi.appdev.operatorcontactmain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class OperatorContactMain 
{
	Connection conn= null;
	Statement stmt= null;
	PreparedStatement pstmt= null;
	ResultSet rs= null;
	
	public static void main() {
		
	
	Scanner sc= new Scanner(System.in);
	
	while(true)
	{
	System.out.println("enter your choice");
	System.out.println("1.add conatact\n2.delete contact\n3.edit the contact\n4.main menu");
	int ch=sc.nextInt();
	switch(ch)
	{
	case 1:
		
		AddConatct.addContact();
		break;
	case 2:
		DeleteContact.deleteContact();
		break;
	case 3:
		Update.updateContact();
		break;
	case 4:
		return;
		
	}
	
	
	}
}
}
