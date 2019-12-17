package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.capgemini.jpawithhibernate.dto.Movies;

public class DeleteDemo 
{
	public static void main(String[] args) {
		
		
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
		
		try
		{
			EntityManagerFactory entityManagerFactory =Persistence.createEntityManagerFactory("Test");
			entityManager=entityManagerFactory.createEntityManager();
			transaction=entityManager.getTransaction();
			transaction.begin();
			
			Movies record =entityManager.find(Movies.class, 102);
			entityManager.remove(record);
			System.out.println("record deleted");
			transaction.commit();
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
		}
		entityManager.close();
	}
}
