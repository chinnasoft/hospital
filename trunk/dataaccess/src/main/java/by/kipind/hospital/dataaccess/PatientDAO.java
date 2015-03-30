package by.kipind.hospital.dataaccess;

import by.kipind.hospital.dataaccess.intrfc.IPatientDAO;
import by.kipind.hospital.datamodel.Patient;

public class PatientDAO extends AbstractDAO<Long, Patient> implements IPatientDAO{
	

	protected PatientDAO(Class<Patient> entityClass, Class<Long> primaryKeyClass) {
		super(entityClass, primaryKeyClass);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int NewPatient(Patient patient) {
		
		return 0;
	}
}
