package by.kipind.hospital.dataaccess.impl;

import org.springframework.stereotype.Repository;

import by.kipind.hospital.dataaccess.IPersonalDAO;
import by.kipind.hospital.datamodel.Personal;

@Repository
public class PersonalDAO  extends AbstractDAO<Long, Personal> implements IPersonalDAO{

	protected PersonalDAO() {
		super(Personal.class);
		// TODO Auto-generated constructor stub
	}

}

	