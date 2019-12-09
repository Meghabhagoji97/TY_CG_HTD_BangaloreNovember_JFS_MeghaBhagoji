package com.cgi.parellelproject.forestdao;

import java.util.List;

import com.cgi.parellelproject.bean.CustomerBean;

public interface CustomerDAO 
{
	boolean addCustomer(CustomerBean bean);
	boolean deleteCustomer(int cumstomerId);
	boolean modifyCustomer(int custid);
	public List<CustomerBean> getCustomer();
}
