package com.cgi.parellelproject.main;

import java.util.Scanner;

import com.cgi.parellelproject.bean.ProductBean;
import com.cgi.parellelproject.forestdao.ProductDAO;
import com.cgi.parellelproject.util.DAOManagerFactory;

public class ProductMain {

	
	public static void product()
	{
		ProductDAO dao3= DAOManagerFactory.getProductDAO();
		Scanner sc= new Scanner(System.in);
		ProductBean bean2= new ProductBean();
		while(true)
		{
		System.out.println("1. add product\n 2. delete product\n3. "
				+ "modify product\n4. exit");
		boolean check;
		int ch3=sc.nextInt();
		switch(ch3)
		{
		case 1:System.out.println("enter the product id");
		bean2.setProductId(sc.nextInt());
		System.out.println("enter the product name");
		bean2.setProductName(sc.next());
		System.out.println("enter the product description");
		bean2.setProductDescription(sc.next());
		 
		if(check=dao3.addProduct(bean2))
		{
			System.out.println("contractor added");
			System.out.println(bean2.toString());

		}
		else
		{
			System.err.println("something went wrong");
		}
		break;
		case 2:
			System.out.println("enter the product id to be removed");
			int b4= sc.nextInt();
			
			if(check=dao3.deleteProduct(b4))
			{
				System.out.println(" product id  deleted");
			}
			else
			{
				System.out.println("no product found");
			}
			break;
		case 3:
			System.out.println("enter the prodcut name you want to update");
			String name=sc.next();
			
			if(check=dao3.modifyProduct(name))
			{
				System.out.println("modified..");
			}
			else
			{
				System.out.println("no modification....");
			}
			break;
		case 4:System.exit(0);
		
		}
	}
	}

}
