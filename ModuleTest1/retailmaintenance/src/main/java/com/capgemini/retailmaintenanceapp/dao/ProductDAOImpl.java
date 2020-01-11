package com.capgemini.retailmaintenanceapp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Repository;

import com.capgemini.retailmaintenanceapp.dto.OrderInfoBean;
import com.capgemini.retailmaintenanceapp.dto.ProductInfoBean;
import com.capgemini.retailmaintenanceapp.dto.UserInfoBean;
import com.capgemini.retailmaintenanceapp.exception.ProductCustomException;

@Repository
public class ProductDAOImpl implements ProductDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public UserInfoBean login(String email, String password) {
		EntityManager manager = factory.createEntityManager();
		String jpql = "from UserInfoBean where email=:email";
		TypedQuery<UserInfoBean> query = manager.createQuery(jpql, UserInfoBean.class);
		query.setParameter("email", email);

		try {
			UserInfoBean bean = query.getSingleResult();
			BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
			if (encoder.matches(password, bean.getPassword())) {
				return bean;
			} else {
				throw new ProductCustomException("Password is invalid");
			}
		} catch (Exception e) {
			throw new ProductCustomException("Email is valid");
		}
	}

	@Override
	public boolean register(UserInfoBean bean) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		try {
			manager.persist(bean);
			transaction.commit();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			throw new ProductCustomException("Email already exists please login!!");
		}
	}

	@Override
	public List<OrderInfoBean> getOrders(String id) {
		String jpql = "from OrderInfoBean where id:=id";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<OrderInfoBean> query = manager.createQuery(jpql, OrderInfoBean.class);
		query.setParameter("id", id);

		return query.getResultList();
	}

	@Override
	public List<ProductInfoBean> getProducts(String id) {
		String jpql = "from ProductInfoBean where id:=id";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<ProductInfoBean> query = manager.createQuery(jpql, ProductInfoBean.class);
		query.setParameter("id", id);

		return query.getResultList();
	}

	@Override
	public boolean UpdatePassword(int id, String password) {
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		UserInfoBean bean = manager.find(UserInfoBean.class, id);
		bean.setPassword(password);
		transaction.commit();
		return true;
	}

}
