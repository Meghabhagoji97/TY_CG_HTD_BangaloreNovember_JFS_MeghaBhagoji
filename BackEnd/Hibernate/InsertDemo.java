package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.transaction.Transaction;

import com.capgemini.jpawithhibernate.dto.Movies;

public class InsertDemo
{
	public static void main(String[] args) {
		
		Movies movies = new Movies();
		movies.setM_id(103);
		movies.setM_name("Gajini");
		movies.setM_rating("Good");
		EntityTransaction transaction=null;
		EntityManager entityManager =null;
		
		try {
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("Test");
		entityManager=entityManagerFactory.createEntityManager();
		transaction=entityManager.getTransaction();
		transaction.begin();
		entityManager.persist(movies);
		transaction.commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
			transaction.rollback();
		}
		transaction.commit();
		entityManager.close();
		
	}
}
