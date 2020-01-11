package com.capgemini.retailmaintenanceapp.service;

import java.util.List;

import com.capgemini.retailmaintenanceapp.dto.OrderInfoBean;
import com.capgemini.retailmaintenanceapp.dto.ProductInfoBean;
import com.capgemini.retailmaintenanceapp.dto.UserInfoBean;

public interface ProductService {

	public UserInfoBean login(String email, String password);

	public boolean register(UserInfoBean bean);

	public List<OrderInfoBean> getOrders(String id);

	public List<ProductInfoBean> getProducts(String id);

	public boolean UpdatePassword(int id, String password);
}
