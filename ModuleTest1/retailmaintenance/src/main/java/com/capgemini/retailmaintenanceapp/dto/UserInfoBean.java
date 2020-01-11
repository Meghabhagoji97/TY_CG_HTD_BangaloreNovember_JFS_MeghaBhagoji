package com.capgemini.retailmaintenanceapp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class UserInfoBean {
	
	@Id
	@Column
	@GeneratedValue
	private int id;
	@Column
	private String name;
	@Column(unique=true,nullable=false)
	private String email;
	@Column
	private String password;
	
	@JsonIgnore
	@OneToMany(cascade=CascadeType.ALL,mappedBy="userbean")
	private List<ProductInfoBean> productbean;
	
//	@OneToMany(cascade=CascadeType.ALL,mappedBy="orderbean")
//	private List<OrderInfoBean> orderbean;
	
	public List<ProductInfoBean> getProductbean() {
		return productbean;
	}
	public void setProductbean(List<ProductInfoBean> productbean) {
		this.productbean = productbean;
	}
//	public List<OrderInfoBean> getOrderbean() {
//		return orderbean;
//	}
//	public void setOrderbean(List<OrderInfoBean> orderbean) {
//		this.orderbean = orderbean;
//	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
