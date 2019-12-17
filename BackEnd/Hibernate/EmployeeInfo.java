package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString.Exclude;

@Data
@Entity
@Table(name="employee_info")
public class EmployeeInfo 
{
	@Id
	@Column
	private int eid;
	@Column(name="ename")
	private String name;
	
	private String email;
	@Column(name="passwoord")
	private String password;
	@Exclude
	//bidirectional : with EmployeeOtherInfo when bidirectional 
	//relationship is used the below code need to be written 
	
	@OneToOne(cascade= CascadeType.ALL , mappedBy="empInfo")
	private EmployeeOtherInfo other;
	
}
