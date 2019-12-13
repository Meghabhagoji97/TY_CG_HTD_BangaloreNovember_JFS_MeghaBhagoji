package com.cgi.appdev.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cgi.appdev.app.PhoneApp;
import com.cgi.appdev.bean.ContactBean;

public class ContactDAOImpl implements ContactDAO
{
	Scanner sc= new Scanner(System.in);
	private List<ContactBean>list= new ArrayList<ContactBean>();
	Connection conn=null;
	Statement stmt=null;
	ResultSet rs= null;

	ContactBean bean= new ContactBean();
	@Override

	public List<ContactBean> showContact() {

		String dburl="jdbc:mysql://127.0.0.1:3306/contactfile";
		System.out.println("enter the username and password");
		String user=sc.nextLine();
		String password=sc.nextLine();
		String query="SELECT * FROM contact";

		try(Connection conn =DriverManager.getConnection(dburl,user,password);
				Statement stmt=conn.createStatement();
				ResultSet rs= stmt.executeQuery(query))
		{
			while(rs.next())
			{
				System.out.println("name:"+rs.getString(1));
				System.out.println("number :"+rs.getInt(2));
				System.out.println("group :"+rs.getString(3));
			}
			return list;
		} catch (Exception e) {

			e.printStackTrace();
		}
		return null;


	}

	@Override
	public boolean searchContact(String name) {
		String dburl="jdbc:mysql://127.0.0.1:3306/contactfile";
		System.out.println("enter the username and password");
		String user=sc.nextLine();
		String password=sc.nextLine();
		String query="SELECT * FROM contact where name=?";

		try(Connection conn =DriverManager.getConnection(dburl,user,password);
				PreparedStatement pstmt = conn.prepareStatement(query);)

		{
			System.out.println("enter the name you want to search");
			pstmt.setString(1, sc.nextLine());
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				rs.getString(rs.getString(1));
			}
			while(true)
			{
				
				System.out.println("enter the choice");
				System.out.println("1.call\n2.Message\n3.Main Menu");
				int ch= sc.nextInt();
				switch(ch)
				{
				case 1:
					System.out.println("calling.......!!!");
					break;
				case 2:
					System.out.println("Sending Message...!!!");
					break;
				case 3:

				}
			}
		}

		catch (Exception e) {

			e.printStackTrace();
		}

		return false;

	}

	@Override
	public boolean operateContact() {

		return false;
	}

}
