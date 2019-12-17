package com.capgemini.jpawithhibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdateUsingJpql
{
	public static void main(String[] args) {


		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Test");
		EntityManager entityManager= entityManagerFactory.createEntityManager();
		String jpql="update Movies set m_name='ABCD' where movie_id=101";
		Query query=entityManager.createQuery(jpql);
		EntityTransaction transaction =  entityManager.getTransaction();
		transaction.begin();
		int record=query.executeUpdate();
		transaction.commit();
		if(record>0)
		{
			System.out.println("updated");
		}
		entityManager.close();
		
	}
}
