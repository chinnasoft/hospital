package by.kipind.hospital.services;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import by.kipind.hospital.dataaccess.PatientDAO;
import by.kipind.hospital.datamodel.Patient;
import by.kipind.hospital.services.intrfc.IPatientAccountService;

@Service
public class PatientAccountServise implements IPatientAccountService {
	private static final Logger LOGGER = LoggerFactory.getLogger(PatientAccountServise.class);

	@Inject
	private PatientDAO patientDAO;


	@Override
	public Patient get(Long id) {
		Patient entity = patientDAO.getById(id);
		return entity;
	}
	@Override
	public int newPatient(Patient patient) {
		// TODO Auto-generated method stub
		patientDAO.NewPatient(patient);
		return 0;
	}

}
