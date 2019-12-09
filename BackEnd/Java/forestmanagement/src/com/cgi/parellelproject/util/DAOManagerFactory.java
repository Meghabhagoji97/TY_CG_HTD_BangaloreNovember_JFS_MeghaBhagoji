package com.cgi.parellelproject.util;

import com.cgi.parellelproject.forestdao.ContractDAO;
import com.cgi.parellelproject.forestdao.ContractDAOImpl;
import com.cgi.parellelproject.forestdao.CustomerDAO;
import com.cgi.parellelproject.forestdao.CustomerDAOImpl;
import com.cgi.parellelproject.forestdao.ProductDAO;
import com.cgi.parellelproject.forestdao.ProductDAOImpl;

public class DAOManagerFactory 
{
	public static ContractDAO getContractDAO()
	{
		return new ContractDAOImpl();
	}
	public static CustomerDAO getCustomerDAO()
	{
		return new CustomerDAOImpl();
	}
	public static ProductDAO getProductDAO()
	{
		return new ProductDAOImpl();
	}
}
