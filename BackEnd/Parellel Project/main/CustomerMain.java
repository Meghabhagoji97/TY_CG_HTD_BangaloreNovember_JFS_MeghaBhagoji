package com.cgi.parellelproject.main;

import java.util.List;
import java.util.Scanner;

import com.cgi.parellelproject.bean.ContractDetailsBean;
import com.cgi.parellelproject.bean.CustomerBean;
import com.cgi.parellelproject.forestdao.CustomerDAO;
import com.cgi.parellelproject.util.DAOManagerFactory;

public class CustomerMain {

	public static void customer()
	{
		Scanner sc= new Scanner(System.in);
		CustomerDAO dao1= DAOManagerFactory.getCustomerDAO();
		while(true)
		{
			System.out.println("1.Add customer");
			System.out.println("2.Delete customer");
			System.out.println("3.Modify customer");
			System.out.println("4.get customer");
			CustomerBean bean1= new CustomerBean();
			int ch2=sc.nextInt();
			switch(ch2)
			{
			case 1:System.out.println("enter the customer id");
			bean1.setCustomerId(sc.nextInt());

			System.out.println("enter the customer name");
			bean1.setCustomerName(sc.next());
			System.out.println("enter the Street address1");
			bean1.setStreetAddress1(sc.next());
			System.out.println("enter the Street address2");
			bean1.setStreetAddess2(sc.next());
			System.out.println("enter the town");
			bean1.setTown(sc.next());
			System.out.println("enter the pincode");
			bean1.setPostalCode(sc.nextInt());
			System.out.println("enter the email");
			String email=sc.next();
			try
			{
			if(email.matches("^[\\w-\\+]+(\\.[\\w]+)*@[\\w-]+(\\.[\\w]+)*(\\.[a-z]{2,})$"))
					{
							bean1.setEmail(email);
					}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			System.out.println("enter the telephone number");
			String tel=sc.next();
			try
			{
				if(tel.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}"))
				{
					bean1.setTel(tel);
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			boolean check3 = dao1.addCustomer(bean1);
			if(check3)
			{
				System.out.println("customer added");
				System.out.println(bean1.toString());

			}
			else
			{
				System.err.println("something went wrong");
			}
			break;
			case 2:
				System.out.println("enter the customer id to be removed");
				int custid= sc.nextInt();
				boolean check4= dao1.deleteCustomer(custid);
				if(check4)
				{
					System.out.println("user  deleted");
				}
				else
				{
					System.out.println("no user found");
				}
				break;
			case 3:
				System.out.println("enter the customer id you want to update");
				int custid1=sc.nextInt();
				boolean check5=dao1.modifyCustomer(custid1);
				if(check5)
				{
					System.out.println("modified..");
				}
				else
				{
					System.out.println("no modification....");
				}
			case 4:
				List<CustomerBean> list = dao1.getCustomer();
				if(list != null)
				{
					System.out.println(list);
				}
				else
				{
					System.out.println("......");
				}
				break;
			case 5:System.exit(0);

			}

		}
	}
}
