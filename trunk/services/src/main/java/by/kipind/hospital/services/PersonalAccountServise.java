package by.kipind.hospital.services;

import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import by.kipind.hospital.dataaccess.PersonalDAO;
import by.kipind.hospital.datamodel.Patient;
import by.kipind.hospital.datamodel.Personal;
import by.kipind.hospital.services.intrfc.IPesonalAccountService;

@Service
public class PersonalAccountServise implements IPesonalAccountService {
	private static final Logger LOGGER = LoggerFactory.getLogger(PersonalAccountServise.class);

	@Inject
	private PersonalDAO personalDAO;

	//TODO: 

	@Override
	public int newPatient(Patient patient) {
		// TODO Auto-generated method stub
		return 0;
	}

}
