package com.shekhar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.shekhar.hibernate.dto.Company;
import com.shekhar.hibernate.dto.Employee;

public class HibernateTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmpID(001);
		emp.setName("Shekhar");
		emp.setAddress("Pune");
		
		Company comp = new Company();
		comp.setCompanyId(111);
		comp.setName("Tieto");
		emp.setCompany(comp);
		SessionFactory sessionfactory = null;
		Session session = null;
		try {
		sessionfactory = new Configuration().configure().buildSessionFactory();
		session = sessionfactory.openSession();
		session.beginTransaction();
		session.save(emp);
		session.save(comp);
		session.getTransaction().commit();
		}catch(Exception e) {
			System.out.println("There was an exception while creating session :"+e);
		}finally {
		session.close();
		sessionfactory.close();
		
		}
		
	}
}
