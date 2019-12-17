package com.capgemini.jpawithhibernate.jpql;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.transaction.Transaction;

public class DeleteUsingJpql
{
	public static void main(String[] args) {
		
		
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		
			EntityManager entityManager	= entityManagerFactory.createEntityManager();
			EntityTransaction tranaction=  entityManager.getTransaction();
			tranaction.begin();
			String jpql="delete from Movies where m_id=:id";
			Query query = entityManager.createQuery(jpql);
			query.setParameter("id", 102);
			int record = query.executeUpdate();
			System.out.println(record);
			tranaction.commit();
			entityManager.close();
	}
}
