package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.omg.Messaging.SyncScopeHelper;

public class UpdateDynamic 
{
	public static void main(String[] args) {
		
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		transaction.begin();
		String jpql = "update Movies set m_name=:nm where movie_id = :id";
		Query query= entityManager.createQuery(jpql);

		query.setParameter("id", 101);
		query.setParameter("nm", "DDLJ");
		int result= query.executeUpdate();
		System.out.println(result);
		transaction.commit();
		entityManager.close();
		
	}
	
}
