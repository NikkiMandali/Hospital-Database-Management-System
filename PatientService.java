package net.javaguides.dbms.service;

import java.util.List;

import net.javaguides.dbms.entity.Patient;

public interface PatientService {

	public List<Patient> getAllPatients();
	
	public Patient savePatient(Patient patient);
	
	public Patient getPatientById(Long id);
	
	public Patient updatePatient(Patient patient);
	
	public void deletePatient(Long id);
}
