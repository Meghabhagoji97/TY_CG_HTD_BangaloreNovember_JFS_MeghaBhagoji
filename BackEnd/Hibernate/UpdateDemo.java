package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movies;

public class UpdateDemo 
{
	public static void main(String[] args) {
		
		
		
		
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
			
		try {
		
			EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Test");
			 entityManager =entityManagerFactory.createEntityManager();
			transaction= entityManager.getTransaction();
			transaction.begin();
			Movies record=entityManager.find(Movies.class,101);
			
			record.setM_name("Kaho na pyar hai");	
			System.out.println(" record update");
			transaction.commit();
			
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			// TODO: handle exception
		}
		entityManager.close();
	}
}
