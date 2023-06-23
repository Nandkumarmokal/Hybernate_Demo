package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Entity.Employee;
import com.Service.EmployeeService;

@RestController
@RequestMapping(value="/employee")
public class EmpController {
	
	@Autowired
	private EmployeeService service;
	
	@RequestMapping(value="/save-employee")
	public boolean saveEmployee(@RequestBody Employee employee)
	{
		boolean IsAdded = service.saveEmployee(employee);
		return IsAdded;
	}

}
