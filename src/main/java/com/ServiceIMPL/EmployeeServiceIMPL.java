package com.ServiceIMPL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.EmployeeDao;
import com.Entity.Employee;
import com.Service.EmployeeService;

@Service
public class EmployeeServiceIMPL implements EmployeeService{
	
	@Autowired
	private EmployeeDao Dao;

	@Override
	public boolean saveEmployee(Employee employee) {
		boolean IsAdded = Dao.saveEmployee(employee);
		return IsAdded;
	}
	
	

}
