package by.kipind.hospital.dataaccess.impl;

import org.springframework.stereotype.Repository;

import by.kipind.hospital.dataaccess.IConferenseDAO;
import by.kipind.hospital.datamodel.Conferense;

@Repository
public class ConferenseDAO extends AbstractDAO<Long, Conferense> implements IConferenseDAO {

	protected ConferenseDAO() {
		super(Conferense.class);
		// TODO Auto-generated constructor stub
	}

}
