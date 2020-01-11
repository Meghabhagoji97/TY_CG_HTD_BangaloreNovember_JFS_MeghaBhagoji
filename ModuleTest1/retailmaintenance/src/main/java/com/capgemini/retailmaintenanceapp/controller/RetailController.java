package com.capgemini.retailmaintenanceapp.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.retailmaintenanceapp.dto.OrderInfoBean;
import com.capgemini.retailmaintenanceapp.dto.ProductInfoBean;
import com.capgemini.retailmaintenanceapp.dto.RetailResponse;
import com.capgemini.retailmaintenanceapp.dto.UserInfoBean;
import com.capgemini.retailmaintenanceapp.service.ProductService;

@RestController
public class RetailController {
	
	@Autowired
	private ProductService service;
	
	@PostMapping(path = "/login", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public RetailResponse login(@RequestBody UserInfoBean bean) {
		UserInfoBean userBean =	 service.login(bean.getEmail(), bean.getPassword());
		RetailResponse response = new RetailResponse();
	if(userBean!=null)
	{
		response.setStatusCode(201);
		response.setMessage("Success");
		response.setDescription("Retailer found for the credentials!");
		response.setBean(Arrays.asList(userBean));
	}
	else
	{
		response.setStatusCode(401);
		response.setMessage("Failure");
		response.setDescription("Credentails invalid");
	}
	return response;
	}

	@PostMapping(path = "/register", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public RetailResponse register(@RequestBody UserInfoBean bean) {
		RetailResponse response = new RetailResponse();
		
		if(service.register(bean))
		{
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Employee Registered!");
		}
		else
		{
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Email already exists!!");
		}
		return response;
		 
	}

	@GetMapping(path = "/get", produces = MediaType.APPLICATION_JSON_VALUE)
	public RetailResponse getOrders(@RequestParam("id") String id) {
		RetailResponse response = new RetailResponse();
		
		List<OrderInfoBean> beans=service.getOrders(id);
		if(beans.isEmpty())
		{
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found!!");
		}
		else
		{
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Orders found!");
			response.setBeans(beans);
		}
		return response;
	}
	@GetMapping(path = "/search", produces = MediaType.APPLICATION_JSON_VALUE)
	public RetailResponse getProducts(@RequestParam("id") String id) {
		RetailResponse response = new RetailResponse();
		
		List<ProductInfoBean> bean1=service.getProducts(id);
		if(bean1.isEmpty())
		{
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Data not found!!");
		}
		else
		{
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Products found!");
			response.setBean1(bean1);
		}
		return response;
	}

	@PostMapping(path = "/update-password", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
	public RetailResponse UpdatePassword(@RequestBody UserInfoBean bean) {
		RetailResponse response = new RetailResponse();
		if(service.UpdatePassword(bean.getId(), bean.getPassword()))
		{
			response.setStatusCode(201);
			response.setMessage("Success");
			response.setDescription("Password Changed!");
		}
		else
		{
			response.setStatusCode(401);
			response.setMessage("Failure");
			response.setDescription("Password not changed!!");
		}
			return response;
	}
}
