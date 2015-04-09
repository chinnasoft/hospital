package by.kipind.hospital.dataaccess.impl;

import org.springframework.stereotype.Repository;

import by.kipind.hospital.dataaccess.ICheckupDAO;
import by.kipind.hospital.datamodel.Checkup;

@Repository
public class CheckupDAO extends AbstractDAO<Long, Checkup> implements ICheckupDAO {

	protected CheckupDAO() {
		super(Checkup.class);
		// TODO Auto-generated constructor stub
	}

}
