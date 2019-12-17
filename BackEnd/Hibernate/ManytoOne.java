package com.capgemini.jpawithhibernate.manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.capgemini.jpawithhibernate.onetoone.EmployeeInfo;

public class ManytoOne 
{
	public static void main(String[] args) {
		
		EmployeeInfo info= new EmployeeInfo();
		info.setEid(101);
		info.setName("Sham");
		info.setEmail("Sham@gmail.com");
		info.setPassword("sham123");
		
		EmployeeExp exp= new EmployeeExp();
		exp.setExpId(201);
		exp.setCName("wipro");
		exp.setNoOfYear(4);
		exp.setEmpInfo(info);
		
		EntityTransaction transaction=null;
		
		try
		{
			
	EntityManagerFactory entityManagerFactory	= Persistence.createEntityManagerFactory("Test");
	EntityManager entityManager =  entityManagerFactory.createEntityManager();
	transaction = entityManager.getTransaction();
	transaction.begin();
	entityManager.persist(exp);
	System.out.println("record saved");
	transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		
	}
}
