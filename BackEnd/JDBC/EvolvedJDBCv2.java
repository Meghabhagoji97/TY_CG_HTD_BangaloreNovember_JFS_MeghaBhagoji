package com.caps.jdbc;


import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

public class EvolvedJDBCv2 {

	public static void main(String[] args) {
		FileReader reader=null;
		Properties prop=null;
		try {
			 reader=new FileReader("C:\\Users\\Uma\\Desktop\\db.properties.txt");
			
			 prop=new Properties();
			prop.load(reader);
			
			//load the driver
			Class.forName(prop.getProperty("driverClass"));
			System.out.println("Driver loaded....");
			
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		try(Connection conn=DriverManager.getConnection(prop.getProperty("dburl"),prop.getProperty("dbuser"),prop.getProperty("dbpassword"));
				Statement stmt=conn.createStatement();ResultSet rs=stmt.executeQuery(prop.getProperty("query1")))
		{
		while(rs.next())
		{
			System.out.println("usersid :"+rs.getInt(1));
			System.out.println("username :"+rs.getString(2));
			System.out.println("emil :"+rs.getString(3));
			System.out.println("-------------------------------------");
		}
		
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
