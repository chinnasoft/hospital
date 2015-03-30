package by.kipind.hospital.services.intrfc;

import by.kipind.hospital.datamodel.Patient;

public interface IPatientAccountService {
	public int newPatient(Patient patient);
	public Patient get(Long id);
	
}
