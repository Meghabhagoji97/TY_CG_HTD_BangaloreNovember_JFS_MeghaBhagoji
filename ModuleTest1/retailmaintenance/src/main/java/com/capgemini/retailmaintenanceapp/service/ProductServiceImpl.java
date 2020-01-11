package com.capgemini.retailmaintenanceapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.capgemini.retailmaintenanceapp.dao.ProductDAO;
import com.capgemini.retailmaintenanceapp.dto.OrderInfoBean;
import com.capgemini.retailmaintenanceapp.dto.ProductInfoBean;
import com.capgemini.retailmaintenanceapp.dto.UserInfoBean;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDAO dao;
	
	BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();
	@Override
	public UserInfoBean login(String email, String password) {
		return dao.login(email, password);
	}

	@Override
	public boolean register(UserInfoBean bean) {
		String encodedPassword = encoder.encode(bean.getPassword());
		bean.setPassword(encodedPassword);
		
		
		List<ProductInfoBean> productBeans=bean.getProductbean();
		for (ProductInfoBean productInfoBean : productBeans) {
			productInfoBean.setUserbean(bean);
		}
		return dao.register(bean);
	}

	@Override
	public List<OrderInfoBean> getOrders(String id) {
		return getOrders(id);
	}

	@Override
	public List<ProductInfoBean> getProducts(String id) {
		return getProducts(id);
	}

	@Override
	public boolean UpdatePassword(int id, String password) {
		return dao.UpdatePassword(id, encoder.encode(password));
	}
	
}
