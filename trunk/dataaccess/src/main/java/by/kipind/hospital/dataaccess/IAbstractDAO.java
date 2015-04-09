package by.kipind.hospital.dataaccess;

import java.util.List;

import javax.persistence.metamodel.SingularAttribute;

public interface IAbstractDAO<ID, Entity> {

	Entity getById(ID id);

	Entity insert(Entity entity);

	Entity update(Entity entity);

	List<Entity> getAll();

	List<Entity> getAllByField(final SingularAttribute<? super Entity, ?> attribute, final Object value);

	void delete(ID key);

	void deleteAll();

	void delete(List<ID> ids);

}
