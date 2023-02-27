package net.javaguides.dbms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.dbms.entity.Patient;

public interface PatientRepo extends JpaRepository<Patient, Long>{

}
