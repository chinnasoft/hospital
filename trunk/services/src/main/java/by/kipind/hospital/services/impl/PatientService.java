package by.kipind.hospital.services.impl;

import java.util.List;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import by.kipind.hospital.dataaccess.IPatientDAO;
import by.kipind.hospital.datamodel.Patient;
import by.kipind.hospital.services.IPatientService;

@Service
public class PatientService implements IPatientService {
	private static final Logger LOGGER = LoggerFactory.getLogger(PatientService.class);

	@Inject
	private IPatientDAO patientDAO;

	@Override
	public Patient getById(Long id) {
		Patient entity = patientDAO.getById(id);
		return entity;
	}

	@Override
	public void saveOrUpdate(Patient patient) {
		if (patient.getId() == null) {
			patientDAO.insert(patient);
		}
		else{
			patientDAO.update(patient);
		}
			
	}
	 @Override
	    public void delete(Patient patient) {
	        LOGGER.debug("Remove: {}", patient);
	        patientDAO.delete(patient.getId());

	    }

	    @Override
	    public void deleteAll() {
	        LOGGER.debug("Remove all products");
	        patientDAO.deleteAll();
	    }

	    @Override
	    public List<Patient> getAllProducts() {
	        return patientDAO.getAll();

	    }

	   
}
