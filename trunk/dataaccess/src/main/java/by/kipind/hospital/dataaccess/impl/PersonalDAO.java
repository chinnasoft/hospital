package by.kipind.hospital.dataaccess.impl;

import java.util.List;

import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import by.kipind.hospital.dataaccess.IPersonalDAO;
import by.kipind.hospital.datamodel.Personal;
import by.kipind.hospital.datamodel.Personal_;

@Repository
public class PersonalDAO extends AbstractDAO<Long, Personal> implements IPersonalDAO {

	private static final Logger LOGGER = LoggerFactory.getLogger(PersonalDAO.class);

	protected PersonalDAO() {
		super(Personal.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void delete(final Long key) {
		Personal personal = getEm().find(Personal.class, key);
		personal.setDelMarker(true);
		getEm().merge(personal);
		getEm().flush();

	}

	@Override
	public void delete(List<Long> ids) {

		if (ids.size() > 0) {
			Personal pers;
			for (Long long1 : ids) {
				pers = getEm().find(Personal.class, long1);
				pers.setDelMarker(true);
				getEm().merge(pers);

			}
			getEm().flush();

			/*
			 * Query delQuery = getEm().createQuery("DELETE from Personal ");
			 * 
			 * Query updateQuery =
			 * getEm().createQuery("UPDATE Personal SET tabel_number=1 "); //
			 * query.setParameter("ids", ids); // query.setParameter("delMark",
			 * true); updateQuery.executeUpdate();
			 */
		} else {
			LOGGER.warn("Attempt to delete objects by empty parametr list", getEm().hashCode(), Personal.class);
		}
	}

	@Override
	// реальная очистка таблицы
	public void deleteAll() {

		final Query q1 = getEm().createQuery(String.format("delete from %s", Personal.class.getSimpleName()));
		q1.executeUpdate();
		getEm().flush();

	}

	@Override
	public Personal getById(Long id) {
		CriteriaBuilder cBuilder = getEm().getCriteriaBuilder();

		CriteriaQuery<Personal> criteriaQuery = cBuilder.createQuery(Personal.class);
		Root<Personal> personal = criteriaQuery.from(Personal.class);

		criteriaQuery.select(personal);

		criteriaQuery.where(cBuilder.and(cBuilder.equal(personal.get(Personal_.id), id), cBuilder.equal(personal.get(Personal_.delMarker), false)));

		TypedQuery<Personal> query = getEm().createQuery(criteriaQuery);
		Personal results;
		try {
			results = query.getSingleResult();
		} catch (NoResultException e) {
			results = null;
		}
		return results;

	}

	@Override
	public List<Personal> getAll() {
		CriteriaBuilder cBuilder = getEm().getCriteriaBuilder();
		CriteriaQuery<Personal> criteriaQuery = cBuilder.createQuery(Personal.class);
		Root<Personal> personal = criteriaQuery.from(Personal.class);

		criteriaQuery.select(personal);

		criteriaQuery.where(cBuilder.equal(personal.get(Personal_.delMarker), false));

		TypedQuery<Personal> query = getEm().createQuery(criteriaQuery);
		List<Personal> results = query.getResultList();
		return results;
	}

}
