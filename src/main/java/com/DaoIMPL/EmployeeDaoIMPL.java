package com.DaoIMPL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Dao.EmployeeDao;
import com.Entity.Employee;

@Repository
public class EmployeeDaoIMPL implements EmployeeDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public boolean saveEmployee(Employee employee) {
		boolean IsAdded =false;
		try(Session session = sessionFactory.openSession();){
			
			Transaction transaction = session.beginTransaction();
			session.save(employee);
			System.out.println(employee);
			transaction.commit();
			IsAdded = true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return IsAdded;
	}
	
	

}
