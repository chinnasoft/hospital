package by.kipind.hospital.dataaccess;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.lang3.Validate;

import by.kipind.hospital.dataaccess.intrfc.IAbstractDAO;

public class AbstractDAO <ID, Entity> implements IAbstractDAO<ID, Entity> {

	private EntityManager em;
	private final Class<Entity> entityClass;
	private final Class<ID> primaryKeyClass;

	protected AbstractDAO(final Class<Entity> entityClass, final Class<ID> primaryKeyClass) {
		Validate.notNull(entityClass, "entityClass could not be a null");
		Validate.notNull(primaryKeyClass, "primaryKeyClass could not be a null");
		this.entityClass = entityClass;
		this.primaryKeyClass = primaryKeyClass;
	}

	@Override
	public Entity getById(ID id) {
		return em.find(getEntityClass(), id);
	}

	@PersistenceContext
	protected void setEntityManager(final EntityManager em) {
		this.em = em;
	}

	private Class<Entity> getEntityClass() {
		return entityClass;
	}

	private Class<ID> getPrimaryKeyClass() {
		return primaryKeyClass;
	}

}
