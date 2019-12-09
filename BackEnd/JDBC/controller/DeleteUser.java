package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class DeleteUser {

		public static void main(String[] args) 
		{
			Scanner sc= new Scanner(System.in);
			
			UserServices services=UserFactory.instanceofUserServices();
			UserBean user= new UserBean();
			System.out.println("enter the userid to be deleted");
			user.setUserid(Integer.parseInt(sc.nextLine()));
			System.out.println("enter the password");
			user.setPassword(sc.nextLine());
			boolean result=services.deleteUser(user.getUserid(), user.getPassword());
			if(result)
			{
				System.out.println("user deleted......");
			}
			else
			{
				System.err.println("something went wrong......");
			}
			sc.close();
			
		}
}
