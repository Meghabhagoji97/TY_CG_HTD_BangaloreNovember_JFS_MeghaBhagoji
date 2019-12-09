package com.cgi.parellelproject.forestapp;

import java.util.Scanner;
import com.cgi.parellelproject.bean.*;
import com.cgi.parellelproject.forestdao.ContractDAO;
import com.cgi.parellelproject.forestdao.CustomerDAO;
import com.cgi.parellelproject.forestdao.ProductDAO;
import com.cgi.parellelproject.main.ContractorMain;
import com.cgi.parellelproject.main.CustomerMain;
import com.cgi.parellelproject.main.ProductMain;
import com.cgi.parellelproject.util.DAOManagerFactory;

public class ForestApp 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);

		while(true)
		{
			System.out.println("1.Contract\n2.Customer\n3.Product\n4.exit\n");

			
			System.out.println("enter your choice");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: ContractorMain.contractor();
			break;

			case 2:CustomerMain.customer();
			break;

			case 3:ProductMain.product();
			break;
			case 4:System.exit(0);


			}
		}
	}
}
