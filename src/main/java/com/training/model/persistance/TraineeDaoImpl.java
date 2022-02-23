package com.training.model.persistance;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.training.model.exceptions.DataAccessException;
import com.training.model.factory.HibernateSessionFactory;

public class TraineeDaoImpl implements TraineeDao{

	private SessionFactory factory;

	public TraineeDaoImpl() {
		factory = HibernateSessionFactory.getSessionFactory();
	}

	public List<TraineeMgmt> getAll() throws DataAccessException {
		List<TraineeMgmt> allTrainee=null;
		Session session = factory.openSession();

		Transaction tx = session.getTransaction();
		
		try {
			tx.begin();
			allTrainee=session
					.createQuery("select u from TraineeMgmt u", TraineeMgmt.class)
					.getResultList();	
			tx.commit();
		}catch (HibernateException ex) {
			tx.rollback();
		}
		return allTrainee;
	}

	public TraineeMgmt addTrainee(TraineeMgmt trainee) {
		Session session = factory.openSession();

		Transaction tx = session.getTransaction();

		try {
			tx.begin();

			session.save(trainee);

			tx.commit();
		} catch (HibernateException ex) {
			tx.rollback();
		}
		return trainee;
	}


	
}
