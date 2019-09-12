package com.Sakha.Spring.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.transaction.annotation.EnableTransactionManagement;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@Setter
@Getter
@ToString
@AllArgsConstructor
@EnableTransactionManagement

public class Employee 
{
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + "]";
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int empId;
	
	String empName;
	int age;
	public Employee(String empName, int age) {
		super();
		this.empName = empName;
		this.age = age;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
}
