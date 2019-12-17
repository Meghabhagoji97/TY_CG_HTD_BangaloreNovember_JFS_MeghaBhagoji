package com.capgemini.jpawithhibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.capgemini.jpawithhibernate.dto.Movies;

public class ReadDemo 
{
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf =Persistence.createEntityManagerFactory("Test");
		EntityManager em=emf.createEntityManager();
		Movies record=em.find(Movies.class,101);
		System.out.println("id -----"+record.getM_id());
		System.out.println("name----"+record.getM_name());
		System.out.println("Rating-----"+record.getM_rating());
		em.close();
		
		
	}
}
