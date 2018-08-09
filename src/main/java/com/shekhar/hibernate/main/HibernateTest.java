package com.shekhar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shekhar.hibernate.dto.Employee;

public class HibernateTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpID(003);
		emp.setName("Shankar");
		emp.setAddress("Bangalore");
		SessionFactory sessionfactory = null;
		Session session = null;
		try {
		sessionfactory = new Configuration().configure().buildSessionFactory();
		session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(emp);
		session.getTransaction().commit();
		}catch(Exception e) {
			System.out.println("There was an exception while creating session :"+e);
		}finally {
		session.close();
		sessionfactory.close();
		
		}
		
	}
}
