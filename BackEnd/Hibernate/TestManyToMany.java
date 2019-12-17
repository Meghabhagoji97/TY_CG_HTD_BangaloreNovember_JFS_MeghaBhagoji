package com.capgemini.jpawithhibernate.manytomany;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.onetoone.EmployeeInfo;

public class TestManyToMany 
{
	public static void main(String[] args) {
		
		EntityTransaction transaction=null;
		
		EmployeeInfo info = new EmployeeInfo();
		info.setEid(1);
		info.setName("Megha");
		info.setEmail("megha@gmail.com");
		info.setPassword("megha123");
		
		EmployeeInfo info1 = new EmployeeInfo();
		info1.setEid(2);
		info1.setName("karthik");
		info1.setEmail("karthik@gmail.com");
		info1.setPassword("karthik123");
		
		ArrayList<EmployeeInfo> list= new ArrayList<EmployeeInfo>();
		list.add(info);
		list.add(info1);
		
		TrainingInfo trainingInfo= new TrainingInfo();
		trainingInfo.setTid(100);
		trainingInfo.setTname("Java FS");
		
		
		trainingInfo.setEList(list);
		
		
		
		try
		{
			
	EntityManagerFactory entityManagerFactory	= Persistence.createEntityManagerFactory("Test");
	EntityManager entityManager =  entityManagerFactory.createEntityManager();
	transaction = entityManager.getTransaction();
	transaction.begin();
	entityManager.persist(trainingInfo);
	System.out.println("record saved");
	transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}

		
	}
}
