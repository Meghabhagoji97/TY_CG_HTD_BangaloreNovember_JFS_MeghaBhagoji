package com.capgemini.retailmaintenanceapp.dto;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class ProductInfoBean {
	
	@Id
	@Column
	@GeneratedValue
	private int id;
	
	@Column
	private String name;
	@Column
	private int quantity;
	@Column
	private String details;
	public int getId() {
		return id;
	}
	public void setId(int pid) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public UserInfoBean getUserbean() {
		return userbean;
	}
	public void setUserbean(UserInfoBean userbean) {
		this.userbean = userbean;
	}

	
	
	@JsonIgnore
	@ManyToOne(cascade=CascadeType.ALL)
	
	@JoinColumn(name="user_id",referencedColumnName="id")
	private UserInfoBean userbean;
	

}

