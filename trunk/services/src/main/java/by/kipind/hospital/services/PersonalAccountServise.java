package by.kipind.hospital.services;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import by.kipind.hospital.dataaccess.PersonalDAO;
import by.kipind.hospital.datamodel.Personal;

@Service
public class PersonalAccountServise implements IPesonalAccountService {

	@Inject
	private PersonalDAO personalDAO;

	@Override
	public int newPersonal(Personal personal) {
		// TODO Auto-generated method stub
		return personalDAO.NewPersonal(personal);
	}

}
