package com.cgi.parellelproject.forestdao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cgi.parellelproject.bean.CustomerBean;

public class CustomerDAOImpl implements CustomerDAO
{
	Scanner sc= new Scanner(System.in);
	private List<CustomerBean> customer= new ArrayList<CustomerBean>();
	@Override
	public boolean addCustomer(CustomerBean bean) {
		int flag=0;
		for (CustomerBean customerBean :customer) {
			if(customerBean.getCustomerId()==bean.getCustomerId())
			{
				flag++;
			}
		}
		if(flag==0)
		{
			customer.add(bean);
			return true;
		}

		return false;
	}

	@Override
	public boolean deleteCustomer(int cumstomerId) {

		CustomerBean bean=null;

		for (CustomerBean customerBean : customer) {
			if(customerBean.getCustomerId()==cumstomerId)
			{

				//bean=customerBean;
				customer.remove(bean);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean modifyCustomer(int custid) {
		for (CustomerBean customerBean : customer) {
			if(customerBean.getCustomerId()==custid)
			{


				System.out.println("select the option which you want to update");

				System.out.println("1.customerName\n2.streetAdr1\n3.streetAdr2\n4.town\n"
						+ "5.postalCode\n6.email\n7.tel\n8.exit");
				int choice =sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("enter the customer name you want to update");
					customerBean.setCustomerName(sc.next());
					break;

				case 2:
					System.out.println("enter the street address-I you want to modify");
					customerBean.setStreetAddress1(sc.next());
					break;
				case 3:
					System.out.println("enter the street address-II you want to modify");
					customerBean.setStreetAddess2(sc.next());
					break;
				case 4:
					System.out.println("enter the town you want to modify");
					customerBean.setTown(sc.next());
					break;
				case 5:
					System.out.println("enter the postalcode you want to update");
					customerBean.setPostalCode(sc.nextInt());
					break;
				case 6:
					System.out.println("enter the email to update");
					customerBean.setEmail(sc.next());
					break;
				case 7:
					System.out.println("enter the telephone number you want to update");
					customerBean.setTel(sc.next());
					break;
				case 8:
					System.exit(0);
				}
			}
		}
		return true;
	}

	@Override
	public List<CustomerBean> getCustomer() {
		return customer;
	}

}
