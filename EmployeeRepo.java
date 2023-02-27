package net.javaguides.dbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.dbms.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Long>{

}
