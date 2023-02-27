package net.javaguides.dbms.service;

import java.util.List;

import net.javaguides.dbms.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployees();
	
	public Employee saveEmployee(Employee employee);
	
	public Employee getEmployeeById(Long id);
	
	public Employee updateEmployee(Employee employee);
	
	public void deleteEmployee(Long id);
}
