package by.kipind.hospital.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import by.kipind.hospital.datamodel.Patient;

public interface IPatientService {
	Patient getById(Long id);

	@Transactional
	void saveOrUpdate(Patient patient);

	@Transactional
	void delete(Patient Patient);

	@Transactional
	void deleteAll();

	List<Patient> getAllProducts();

}