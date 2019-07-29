package com.cg.airline.dao;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.airline.bean.userDetails;


@Repository
@Transactional
public class AirlineDaoImpl implements IAirlineDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public userDetails userLogin(String userName) {
		// TODO Auto-generated method stub
		//return entityManager.find(userDetails.class, userName);
		userDetails user;
		try {
		 user =  entityManager.createQuery("SELECT u from userDetails u  where u.userName = :userName",userDetails.class).setParameter("userName", userName).getSingleResult();
		System.out.println("IN DAO "+user);
		}
		catch(NoResultException e)
		{
			System.out.println("Inside Excwption");
			user = null;
		}
		return user;
	}

	@Override
	public userDetails addUser(userDetails userDetails) {
		entityManager.persist(userDetails);
		entityManager.flush();
		return userDetails;
	}

}
