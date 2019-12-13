package com.cgi.appdev.app;

import java.util.Scanner;

import com.cgi.appdev.dao.ContactDAO;
import com.cgi.appdev.factory.DAOManagerFactory;
import com.cgi.appdev.operatorcontactmain.OperatorContactMain;

public class PhoneApp 
{
	public static void main(String[] args)
	{
		ContactDAO dao= DAOManagerFactory.getContactDAO();
			Scanner sc= new Scanner(System.in);
			System.out.println("welcome to Samsung");
			while(true)
			{
			System.out.println("enter your choice");
			System.out.println("1.show all contacts\n2.search the contact\n3.Operate on contact");
			int ch= sc.nextInt();
			switch(ch)
			{
			case 1:dao.showContact();
				break;
			case 2:System.out.println("enter the name you want to search");
					String name= sc.next();	
				dao.searchContact(name);
				break;
			case 3:
				OperatorContactMain.main();
				break;
			case 4:System.exit(0);
			}
			}
			
	}
}
