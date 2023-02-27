package net.javaguides.dbms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "E_Id", updatable = false, nullable = false)
	private Long id;
	
	@Column(name = "E_Name", nullable = false)
	private String name;
	
	@Column(name = "E_Address")
	private String address;
	
	@Column(name = "E_Salary")
	private String salary;
	
	@Column(name = "E_job")
	private String job;
	
	@Column(name = "E_Phone_Number")
	private String phoneNumber;

		
	public Employee() {
		super();
	}


	public Employee(String name, String address, String salary, String job, String phoneNumber) {
		super();
		this.name = name;
		this.address = address;
		this.salary = salary;
		this.job = job;
		this.phoneNumber = phoneNumber;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getSalary() {
		return salary;
	}


	public void setSalary(String salary) {
		this.salary = salary;
	}


	public String getJob() {
		return job;
	}


	public void setJob(String job) {
		this.job = job;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

}
