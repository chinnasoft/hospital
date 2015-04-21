package by.kipind.hospital.dataaccess.impl;

import javax.persistence.NoResultException;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import by.kipind.hospital.dataaccess.ICheckupDAO;
import by.kipind.hospital.datamodel.Checkup;
import by.kipind.hospital.datamodel.Checkup_;

@Repository
public class CheckupDAO extends AbstractDAO<Long, Checkup> implements ICheckupDAO {

	protected CheckupDAO() {
		super(Checkup.class);
		// TODO Auto-generated constructor stub
	}

	public Checkup getByIdFull(Long id) {
		CriteriaBuilder cBuilder = getEm().getCriteriaBuilder();
		CriteriaQuery<Checkup> criteriaQuery = cBuilder.createQuery(Checkup.class);

		Root<Checkup> сheckup = criteriaQuery.from(Checkup.class);

		criteriaQuery.select(сheckup);
		criteriaQuery.where(cBuilder.equal(сheckup.get("id"), id));

		сheckup.fetch(Checkup_.personal, JoinType.LEFT);
		сheckup.fetch(Checkup_.visit, JoinType.LEFT);

		TypedQuery<Checkup> query = getEm().createQuery(criteriaQuery);

		try {
			Checkup result = query.getSingleResult();
			return result;
		} catch (NoResultException e) {
			return null;
		}

	}

}
