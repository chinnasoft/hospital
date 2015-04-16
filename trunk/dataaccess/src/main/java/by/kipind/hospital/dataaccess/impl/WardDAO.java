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

	/*
	 * @Override public List<Ward> getAllWithFeatchPersonal() { CriteriaBuilder
	 * cBuilder = getEm().getCriteriaBuilder(); CriteriaQuery<Ward>
	 * criteriaQuery = cBuilder.createQuery(Ward.class);
	 * 
	 * Root<Ward> ward = criteriaQuery.from(Ward.class);
	 * criteriaQuery.select(ward);
	 * 
	 * ward.fetch(Ward_.personal, JoinType.LEFT); criteriaQuery.distinct(true);
	 * 
	 * TypedQuery<Ward> query = getEm().createQuery(criteriaQuery);
	 * 
	 * return query.getResultList();
	 * 
	 * }
	 */

	@Override
	public Ward getById(Long id) {

	}

}
