package net.javaguides.dbms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.dbms.entity.Employee;
import net.javaguides.dbms.repository.EmployeeRepo;
import net.javaguides.dbms.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepo employeeRepo;

	public EmployeeServiceImpl(EmployeeRepo employeeRepo) {
		super();
		this.employeeRepo = employeeRepo;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public Employee getEmployeeById(Long id) {
		return employeeRepo.findById(id).get();
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		return employeeRepo.save(employee);
	}

	@Override
	public void deleteEmployee(Long id) {
		employeeRepo.deleteById(id);
		
	}

}
