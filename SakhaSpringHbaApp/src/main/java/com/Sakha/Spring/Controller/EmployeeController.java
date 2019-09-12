package com.Sakha.Spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Sakha.Spring.Model.Employee;
import com.Sakha.Spring.Service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	EmployeeService service;
	
	@PostMapping("/add")
	public String addEmployee(@ModelAttribute Employee emp,Model m)
	{
		String msg="Failed...";
		if(service.saveEmployee(emp))
			msg="success..";
		m.addAttribute("msg",msg);
		return "view.jsp";
	}
	
	@GetMapping("/employee")
	public String getEmployee(@RequestParam("empId") int empId,Model m)
	{
		Employee emp=service.getEmployee(empId);
		m.addAttribute("empList",emp);
		return "viewEmp.jsp";
	}
	@GetMapping("/employees")
	public String getAllEmployee(Model m)
	{
		List<Employee> emplist=service.getAllEmployee();
		m.addAttribute("empList",emplist);
		return "viewEmp.jsp";
	}
	@GetMapping("/delete")
	public String deleteEmp(@RequestParam("empId") int empId,Model m)
	{
		String msg="Failed...";
		Employee emp=service.getEmployee(empId);
		if(service.deleteEmployee(emp))
			msg="success..";
		m.addAttribute("msg",msg);
		return "view.jsp";
	}
	
	
	
	
	
	
	
	
}
