package net.javaguides.dbms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import net.javaguides.dbms.entity.Patient;
import net.javaguides.dbms.repository.PatientRepo;
import net.javaguides.dbms.service.PatientService;

@Service
public class PatientServiceImpl implements PatientService {

	private PatientRepo patientRepo;
	
	public PatientServiceImpl(PatientRepo patientRepo) {
		super();
		this.patientRepo = patientRepo;
	}


	@Override
	public List<Patient> getAllPatients() {
		return patientRepo.findAll();
	}


	@Override
	public Patient savePatient(Patient patient) {
		return patientRepo.save(patient);
	}


	@Override
	public Patient getPatientById(Long id) {
		return patientRepo.findById(id).get();
	}


	@Override
	public Patient updatePatient(Patient patient) {
		return patientRepo.save(patient);
	}


	@Override
	public void deletePatient(Long id) {
		patientRepo.deleteById(id);
		
	}

}
