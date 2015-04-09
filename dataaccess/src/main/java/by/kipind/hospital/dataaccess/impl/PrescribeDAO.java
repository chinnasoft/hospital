package by.kipind.hospital.dataaccess.impl;

import org.springframework.stereotype.Repository;

import by.kipind.hospital.dataaccess.IPrescribeDAO;
import by.kipind.hospital.datamodel.Prescribe;

@Repository
public class PrescribeDAO extends AbstractDAO<Long, Prescribe> implements IPrescribeDAO {

	protected PrescribeDAO() {
		super(Prescribe.class);
		// TODO Auto-generated constructor stub
	}

}
