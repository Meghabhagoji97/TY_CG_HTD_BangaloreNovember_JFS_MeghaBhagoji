package com.cgi.parellelproject.main;

import java.util.List;
import java.util.Scanner;

import com.cgi.parellelproject.bean.ContractDetailsBean;
import com.cgi.parellelproject.forestdao.ContractDAO;
import com.cgi.parellelproject.util.DAOManagerFactory;

public class ContractorMain {


	public static void contractor()
	{
		Scanner sc= new Scanner(System.in);
		ContractDAO dao2=DAOManagerFactory.getContractDAO();

		ContractDetailsBean bean= new ContractDetailsBean();
		while(true)
		{
			System.out.println("1.add contractor\n2.delete contractor\n3.get contractor\n4.Modify contractor\n5.exit");
			int ch1=sc.nextInt();
			boolean check;
			switch(ch1)
			{
				
			case 1:

				System.out.println("enter contract no");
				bean.setContractNo(sc.nextInt());

				System.out.println("enter the customer id");
				bean.setCustomerId(sc.nextInt());

				System.out.println("enter the product id");
				bean.setProductid(sc.nextInt());
				System.out.println("enter the haulier id");
				bean.setHaulierId(sc.nextInt());
				System.out.println("enter the delivery date in dd-mm-yyyy format");
				String deliverDate=sc.next();
				try
				{
					if(deliverDate.matches("^(1[0-2]|0[1-9])-(3[01]"
		                       + "|[12][0-9]|0[1-9])-[0-9]{4}$")) //01-01-2019
					{
						bean.setDeliverDate(deliverDate);
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				System.out.println("enter the delivery day");
				bean.setDeliverDay(sc.next());
				System.out.println("enter the quantity");
				bean.setQuantity(sc.nextInt());

				boolean check1=dao2.addContractor(bean);
				if(check1)
				{
					System.out.println("contractor added");
				}
				else
				{
					System.err.println("something went wrong");
				}
				break;
			case 2:

				System.out.println("enter the contract number to be removed");
				int contractNo= sc.nextInt();
				 
				if(check=dao2.deleteContractor(contractNo))
				{
					System.out.println("user  deleted");
				}
				else
				{
					System.out.println("no user found");
				}
				break;
			case 3:
					List<ContractDetailsBean> list = dao2.getContractor();
					if(list != null)
					{
						System.out.println(list);
					}
					else
					{
						System.out.println("......");
					}
					break;
			case 4:
				System.out.println("enter the contract number you want to update");
				int contract=sc.nextInt();
				
				if(check=dao2.modifyContractor(contract))
				{
					System.out.println("modified..");
				}
				else
				{
					System.out.println("no modification....");
				}
				break;
			case 5:System.exit(0);
				

			}
		}
	}

}
