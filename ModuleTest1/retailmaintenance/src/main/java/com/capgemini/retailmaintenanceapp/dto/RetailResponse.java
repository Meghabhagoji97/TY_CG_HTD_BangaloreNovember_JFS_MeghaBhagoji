package com.capgemini.retailmaintenanceapp.dto;

import java.util.List;

public class RetailResponse {
	private int statusCode;
	private String message;
	private String description;
	private List<UserInfoBean> bean;
	private List<OrderInfoBean> beans;
	List<ProductInfoBean> bean1;
	
	public List<ProductInfoBean> getBean1() {
		return bean1;
	}
	public void setBean1(List<ProductInfoBean> bean1) {
		this.bean1 = bean1;
	}
	public int getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public List<UserInfoBean> getBean() {
		return bean;
	}
	public void setBean(List<UserInfoBean> bean) {
		this.bean = bean;
	}
	public List<OrderInfoBean> getBeans() {
		return beans;
	}
	public void setBeans(List<OrderInfoBean> beans) {
		this.beans = beans;
	}
	
}
