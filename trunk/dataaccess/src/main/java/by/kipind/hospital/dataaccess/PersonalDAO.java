package by.kipind.hospital.dataaccess;

import org.springframework.stereotype.Repository;

import by.kipind.hospital.dataaccess.intrfc.IPersonalDAO;
import by.kipind.hospital.datamodel.Personal;

@Repository
public class PersonalDAO implements IPersonalDAO{

	@Override
	public int NewPersonal(Personal personal) {
		// TODO Auto-generated method stub
		return 0;
	}

}
