package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

import com.capgemini.jpawithhibernate.dto.Movies;

public class TestMovie
{
	public static void main(String[] args) {
		
		Transaction transaction=null;
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		//String jpql= "from Movies";
		String jpql="Select m_rating from Movies";
		Query query = entityManager.createQuery(jpql);
		//List<Movies> record= query.getResultList();
		List<String> record= query.getResultList();
		
		for (String movies : record) 
		{
			//System.out.println("Movie id is :"+movies.getM_id());
			//System.out.println("Movie name is  :"+movies.getM_name());
			//System.out.println("Movie rating is :"+movies.getM_rating());
			System.out.println(movies);
		}
		entityManager.close();
	}
	
}
