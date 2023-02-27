package net.javaguides.dbms.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "patientdetails")
public class Patient{

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "Patients_Id", updatable = false, nullable = false)
	private Long id;
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "Medicine_Id")
	private Long medId;
	
	@Column(name = "Patient_Name", nullable = false)
	private String patientName;
	
	@Column(name = "Patient_Address")
	private String address;
	
	@Column(name = "Patient_Blood_Group")
	private String bloodGroup;
	
	@Column(name = "Patient_Age")
	private String age;
	
	@Column(name = "Patient_Gender")
	private String gender;
	
	@Column(name = "Patient_Phone_Number")
	private String phoneNumber;
	
	@Column(name = "Patient_Admit_date")
	private String admitDate;
	
	@Column(name = "Patient_Room_No")
	private String roomNumber;
	
	public Patient() {
		super();
	}

	public Patient(String patientName, String address, String bloodGroup, String age, String gender, String phoneNumber,
			String admitDate, String roomNumber) {
		super();
		this.patientName = patientName;
		this.address = address;
		this.bloodGroup = bloodGroup;
		this.age = age;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.admitDate = admitDate;
		this.roomNumber = roomNumber;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getAdmitDate() {
		return admitDate;
	}

	public void setAdmitDate(String admitDate) {
		this.admitDate = admitDate;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}	
}
