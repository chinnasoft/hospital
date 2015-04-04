package by.kipind.hospital.dataaccess.impl;

import org.springframework.stereotype.Repository;

import by.kipind.hospital.dataaccess.IPatientDAO;
import by.kipind.hospital.datamodel.Patient;

@Repository
public class PatientDAO extends AbstractDAO<Long, Patient> implements IPatientDAO{
	

	protected PatientDAO() {
		super(Patient.class);
		// TODO Auto-generated constructor stub
	}

	
}
