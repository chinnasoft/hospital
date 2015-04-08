package by.kipind.hospital.dataaccess.impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.SingularAttribute;

import org.hibernate.jpa.criteria.OrderImpl;
import org.springframework.stereotype.Repository;

import by.kipind.hospital.dataaccess.IVisitDAO;
import by.kipind.hospital.datamodel.Visit;

//import by.dzhvisuhko.sample.datamodel.Product_;

@Repository
public class VisitDAO extends AbstractDAO<Long, Visit> implements IVisitDAO {

	protected VisitDAO() {
		super(Visit.class);
	}

	public Long getCount() {
		CriteriaBuilder cBuilder = getEm().getCriteriaBuilder();

		CriteriaQuery<Long> criteria = cBuilder.createQuery(Long.class);
		Root<Visit> root = criteria.from(Visit.class);

		criteria.select(cBuilder.count(root));

		TypedQuery<Long> query = getEm().createQuery(criteria);
		return query.getSingleResult();
	}

	public List<Visit> getAllVisits(SingularAttribute<Visit, ?> attr, boolean ascending, int startRecord, int pageSize) {
		CriteriaBuilder cBuilder = getEm().getCriteriaBuilder();

		CriteriaQuery<Visit> criteria = cBuilder.createQuery(Visit.class);
		Root<Visit> root = criteria.from(Visit.class);

		criteria.select(root);
		criteria.orderBy(new OrderImpl(root.get(attr), ascending));

		TypedQuery<Visit> query = getEm().createQuery(criteria);
		query.setFirstResult(startRecord);
		query.setMaxResults(pageSize);

		List<Visit> results = query.getResultList();
		return results;
	}

}
