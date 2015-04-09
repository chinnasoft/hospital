package by.kipind.hospital.dataaccess.impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import by.kipind.hospital.dataaccess.IWardDAO;
import by.kipind.hospital.datamodel.Ward;
import by.kipind.hospital.datamodel.Ward_;

@Repository
public class WardDAO extends AbstractDAO<Long, Ward> implements IWardDAO {

	protected WardDAO() {
		super(Ward.class);
		// TODO Auto-generated constructor stub
	}

	public List<Ward> getAllWithPersonal() {
		CriteriaBuilder cBuilder = getEm().getCriteriaBuilder();

		CriteriaQuery<Ward> criteriaQuery = cBuilder.createQuery(Ward.class);
		Root<Ward> ward = criteriaQuery.from(Ward.class);

		criteriaQuery.select(ward);
		ward.fetch(Ward_.personal);
		criteriaQuery.distinct(true);

		TypedQuery<Ward> query = getEm().createQuery(criteriaQuery);

		return query.getResultList();
		;
	}
}
