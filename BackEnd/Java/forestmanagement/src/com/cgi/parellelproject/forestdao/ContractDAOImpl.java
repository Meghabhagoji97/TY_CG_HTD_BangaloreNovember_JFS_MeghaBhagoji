package com.cgi.parellelproject.forestdao;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.cgi.parellelproject.bean.ContractDetailsBean;
import com.cgi.parellelproject.bean.CustomerBean;

public class ContractDAOImpl  implements ContractDAO
{

	Scanner sc= new Scanner(System.in);
	private List<ContractDetailsBean> contractList= new ArrayList<ContractDetailsBean>();

	@Override
	public boolean addContractor(ContractDetailsBean bean) 
	{

		int flag=0;
		for (ContractDetailsBean contractDetailsBean : contractList) 
		{
			if(contractDetailsBean.getContractNo()==bean.getContractNo())
			{
				flag++;
			}
		}
		if(flag==0)
		{
			contractList.add(bean);
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean deleteContractor(int contractNo) {
		ContractDetailsBean bean=null;

		for (ContractDetailsBean contractDetailsBean : contractList) 
		{
			if(contractDetailsBean.getContractNo()==contractNo)
			{
				contractList.remove(bean);
				return true;
			}
		}

		return false;
	}


	@Override
	public List<ContractDetailsBean> getContractor() {
		return contractList;
	}

	@Override
	public boolean modifyContractor(int contractNo) {
		for (ContractDetailsBean contractDetailsBean : contractList) 
		{
			if(contractDetailsBean.getContractNo()==contractNo)
			{
				System.out.println("select the option which you want to update");
				System.out.println("1.customer_id\n2.product_id\n3.haulier_id\n4.deliever_date\n5.deliver_day\n6.Quantity\n7.exit\n");

				int choice =sc.nextInt();
				switch(choice)
				{
				case 1:System.out.println("enter the customer id to update");
				contractDetailsBean.setCustomerId(sc.nextInt());
				break;
				case 2:System.out.println("enter the product id to update");
				contractDetailsBean.setProductid(sc.nextInt());
				break;
				case 3:
					System.out.println("enter the haulier id to update");
					contractDetailsBean.setHaulierId(sc.nextInt());
					break;
				case 4:
					System.out.println("enter the deliever date to update");
					contractDetailsBean.setDeliverDate(sc.next());
					break;
				case 5:
					System.out.println("enter tht deliver day to update");
					contractDetailsBean.setDeliverDay(sc.next());
					break;
				case 6:
					System.out.println("enter the quantity you want to update");
					contractDetailsBean.setQuantity(sc.nextInt());
					break;
				case 7:System.exit(0);

				}
			}
		}
		return true;
	}
}

