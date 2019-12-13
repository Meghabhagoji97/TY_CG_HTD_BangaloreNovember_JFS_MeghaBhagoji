package com.cgi.appdev.dao;

import java.util.List;

import com.cgi.appdev.bean.ContactBean;

public interface ContactDAO {
		
		public List<ContactBean> showContact();
		boolean searchContact(String name);
		boolean operateContact();
		


}
