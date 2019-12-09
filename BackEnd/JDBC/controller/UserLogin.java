package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.bean.UserBean;
import com.capgemini.jdbc.factory.UserFactory;
import com.capgemini.jdbc.services.UserServices;

public class UserLogin
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
	UserServices services=UserFactory.instanceofUserServices();
	
	UserBean user= new UserBean();
	System.out.println("enter the userid");
	user.setUserid(Integer.parseInt(sc.nextLine()));
	System.out.println("enter the password");
	user.setPassword(sc.nextLine());
	
	UserBean user1=services.userLogin(user.getUsername(),user.getPassword());
	
	if(user1!=null)
	{
		System.out.println("userid is "+user1.getUserid());
		System.out.println("username is "+user1.getUsername());
		System.out.println("email is "+user1.getEmail());
		
	}
	else
	{
		System.out.println("somethig went wrong ");
	}
	}
}
