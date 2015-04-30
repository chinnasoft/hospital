package by.kipind.hospital.dataaccess.impl;

import org.springframework.stereotype.Repository;

import com.kipind.hospital.datamodel.Prescribe;

import by.kipind.hospital.dataaccess.IPrescribeDAO;

@Repository
public class PrescribeDAO extends AbstractDAO<Long, Prescribe> implements IPrescribeDAO {

	protected PrescribeDAO() {
		super(Prescribe.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Prescribe getByIdFull(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

}
