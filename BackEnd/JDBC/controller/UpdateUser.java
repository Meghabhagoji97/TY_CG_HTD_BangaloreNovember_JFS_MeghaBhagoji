package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class UpdateUser {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		UserServices services=UserFactory.instanceofUserServices();
		UserBean user= new UserBean();
		System.out.println("enter the userid");
		user.setUserid(Integer.parseInt(sc.nextLine()));
		System.out.println("enter the password");
		user.setPassword(sc.nextLine());
		System.out.println("enter the new email");
		user.setEmail(sc.nextLine());
		
		if(services.updateUser(user.getUserid(), user.getPassword(), user.getEmail()))
		{
			System.out.println("user email updated....");
		}
		else
		{
			System.err.println("something went wrong...");
		}
		
	}

}
