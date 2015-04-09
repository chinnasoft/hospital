package by.kipind.hospital.dataaccess.impl;

import org.springframework.stereotype.Repository;

import by.kipind.hospital.dataaccess.IWardDAO;
import by.kipind.hospital.datamodel.Ward;

@Repository
public class WardDAO extends AbstractDAO<Long, Ward> implements IWardDAO {

	protected WardDAO() {
		super(Ward.class);
		// TODO Auto-generated constructor stub
	}

}
