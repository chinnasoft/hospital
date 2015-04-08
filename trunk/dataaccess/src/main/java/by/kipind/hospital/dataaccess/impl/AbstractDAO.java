package by.kipind.hospital.dataaccess.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.apache.commons.lang3.Validate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import by.kipind.hospital.dataaccess.IAbstractDAO;

public class AbstractDAO<ID, Entity> implements IAbstractDAO<ID, Entity> {

	private static final Logger LOGGER = LoggerFactory.getLogger(AbstractDAO.class);

	private EntityManager em;
	private final Class<Entity> entityClass;

	protected AbstractDAO(final Class<Entity> entityClass) {
		Validate.notNull(entityClass, "entityClass could not be a null");
		this.entityClass = entityClass;
	}

	@Override
	public Entity getById(ID id) {
		return em.find(getEntityClass(), id);
	}

	@Override
	public Entity insert(final Entity entity) {
		em.persist(entity);
		return entity;
	}

	@Override
	public Entity update(Entity entity) {
		entity = em.merge(entity);
		em.flush();
		return entity;
	}

	@Override
	public void delete(final ID key) {

		/*
		 * CriteriaBuilder cBuilder = getEm().getCriteriaBuilder();
		 * CriteriaDelete<Entity> delete =
		 * cBuilder.createCriteriaDelete(getEntityClass()); Root<Entity> root =
		 * delete.from(getEntityClass());
		 * delete.where(cBuilder.equal(delete.get(),1l)); Query query =
		 * getEm().createQuery(delete); query.executeUpdate();
		 */
		em.remove(em.find(getEntityClass(), key));
	}

	@Override
	public void delete(List<ID> ids) {

		if (ids.size() > 0) {
			Query query = em.createQuery(String.format("delete from %s e where e.id in (:ids)", getEntityClass().getSimpleName()));
			query.setParameter("ids", ids);
			query.executeUpdate();
		} else {
			LOGGER.warn("Attempt to delete objects by empty parametr list", em.hashCode(), getClass().getName());
		}
	}

	@Override
	public void deleteAll() {
		/*
		 * CriteriaBuilder cBuilder = getEm().getCriteriaBuilder();
		 * CriteriaDelete<Entity> criteria =
		 * cBuilder.createCriteriaDelete(getEntityClass()); Root<Entity> root =
		 * criteria.from(getEntityClass());
		 * 
		 * Query query = getEm().createQuery(criteria); query.executeUpdate();
		 */
		final Query q1 = em.createQuery("delete from " + getEntityClass().getSimpleName());
		q1.executeUpdate();
		em.flush();
	}

	@Override
	public List<Entity> getAll() {
		CriteriaBuilder cBuilder = getEm().getCriteriaBuilder();
		CriteriaQuery<Entity> criteria = cBuilder.createQuery(getEntityClass());
		Root<Entity> root = criteria.from(getEntityClass());

		criteria.select(root);

		TypedQuery<Entity> query = getEm().createQuery(criteria);
		List<Entity> results = query.getResultList();
		return results;
	}

	@PersistenceContext
	protected void setEntityManager(final EntityManager em) {
		LOGGER.info("Set EM {} to class {}", em.hashCode(), getClass().getName());
		this.em = em;
	}

	private Class<Entity> getEntityClass() {
		return entityClass;
	}

	public EntityManager getEm() {
		return em;
	}

}
