package com.Sakha.Spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Sakha.Spring.Model.Employee;
import com.Sakha.Spring.repository.EmployeeRepo;

@Service
public class EmployeeService 
{
	@Autowired
	EmployeeRepo repo;
	
	public boolean saveEmployee(Employee emp)
	{
		return repo.saveEmployee(emp);
	}
	public Employee getEmployee(int empId)
	{
		return repo.getEmployee(empId);
	}
	public boolean deleteEmployee(Employee emp)
	{
		return repo.deleteEmployee(emp);
	}
	public List<Employee> getAllEmployee()
	{
		return repo.getAllEmployee();
	}

}
