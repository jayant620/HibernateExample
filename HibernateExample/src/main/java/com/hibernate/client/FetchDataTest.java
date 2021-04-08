package com.hibernate.client;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.hibernate.model.Employee;
import com.hibernate.util.HibernateUtil;



public class FetchDataTest {

	public static void main(String[] args) {
		Employee employee = null;
	    try(Session session = HibernateUtil.getSessionFactory().openSession()) {
	    	employee = session.get(Employee.class, 1);
	    	System.out.println(employee);
		} catch (HibernateException e) {
			e.printStackTrace();
		}
	    
	    if(employee != null){
    		employee.getAddressList().forEach(System.out::println);
    	}
	  }
}

