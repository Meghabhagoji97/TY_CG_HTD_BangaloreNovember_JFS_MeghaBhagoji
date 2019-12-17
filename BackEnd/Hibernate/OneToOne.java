package com.capgemini.jpawithhibernate.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

public class OneToOne
{
	public static void main(String[] args) 
	{
//		EmployeeInfo info= new EmployeeInfo();
//		info.setEid(11);
//		info.setName("Ram");
//		info.setEmail("ram@gmail.com");
//		info.setPassword("ram123");
//		
//		EmployeeOtherInfo otherInfo = new EmployeeOtherInfo();
//		otherInfo.setId(21);
//		otherInfo.setFname("dhrutarashtra");
//		otherInfo.setPassport("Cxap12");
//		
//		otherInfo.setEmpInfo(info);
		EntityTransaction transaction=null;
//		
		
		try
		{
		EntityManagerFactory entityManagerFactory	= Persistence.createEntityManagerFactory("Test");
			EntityManager entityManager	= entityManagerFactory.createEntityManager();
			 transaction = entityManager.getTransaction();
			transaction.begin();
			//entityManager.persist(otherInfo);
			EmployeeInfo em = entityManager.find(EmployeeInfo.class, 11);
			System.out.println(em.getOther().getPassport());
			System.out.println("record saved");
			transaction.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
	}
	
}
