package com.cgi.appdev.factory;

import com.cgi.appdev.dao.ContactDAO;
import com.cgi.appdev.dao.ContactDAOImpl;

public class DAOManagerFactory 
{
	public static ContactDAO getContactDAO()
	{
		return new ContactDAOImpl();
	}
}
