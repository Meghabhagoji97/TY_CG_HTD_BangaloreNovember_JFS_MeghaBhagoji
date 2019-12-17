package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movies;

public class GetRefernce 
{
public static void main(String[] args) {
		
		
		
		
		EntityManager entityManager=null;
		EntityTransaction transaction=null;
			
		try {
		
			EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Test");
			 entityManager =entityManagerFactory.createEntityManager();
			transaction= entityManager.getTransaction();
			transaction.begin();
			//Movies record=entityManager.find(Movies.class,101);
			Movies record= entityManager.getReference(Movies.class, 101);
			System.out.println(record.getClass());
//			System.out.println("id -----"+record.getM_id());
//			System.out.println("name----"+record.getM_name());
//			System.out.println("Rating-----"+record.getM_rating());
			entityManager.close();
			
			
		}
		catch (Exception e) {
			e.printStackTrace();
			transaction.rollback();
			// TODO: handle exception
		}
		entityManager.close();
	}
}
