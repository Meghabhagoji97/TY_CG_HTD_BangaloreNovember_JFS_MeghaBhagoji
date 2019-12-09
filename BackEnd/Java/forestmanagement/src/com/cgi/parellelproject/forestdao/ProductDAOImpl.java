package com.cgi.parellelproject.forestdao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.cgi.parellelproject.bean.CustomerBean;
import com.cgi.parellelproject.bean.ProductBean;

public class ProductDAOImpl implements ProductDAO
{
	Scanner sc= new Scanner(System.in);
	private List<ProductBean> productList= new ArrayList<ProductBean>();
	@Override
	public boolean addProduct(ProductBean bean) {

		int flag=0;
		for (ProductBean productBean :productList) {
			if(productBean.getProductId()==bean.getProductId())
			{
				flag++;
			}
		}
		if(flag==0)
		{
			productList.add(bean);
			return true;
		}
		else
		{
			return false;
		}
	}

	@Override
	public boolean deleteProduct(int productId) {
		ProductBean bean=null;

		for (ProductBean productBean : productList) {
			if(productBean.getProductId()==productId)
			{
				productList.remove(productId);
				return true;
			}
			if(bean==null)
			{
				return false;
			}
		}

		return false;
	}

	@Override
	public boolean modifyProduct(String name) {
		for (ProductBean productBean : productList) {
			if(productBean.getProductName()==name)
			{
				System.out.println("select the option which you want to update");
				System.out.println("1.product name\n2.product Description\n3.exit");

				int choice =sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("enter the product name you want to update");
					productBean.setProductName(sc.next());
					break;
				case 2:
					System.out.println("enter the product Description to update");
					productBean.setProductDescription(sc.next());
					break;
				case 3:
					System.exit(0);

				}
			}
		}
		return true;
	}
}

