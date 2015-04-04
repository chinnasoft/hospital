package by.kipind.hospital.dataaccess;

import java.util.List;


public interface IAbstractDAO<ID, Entity> {

	Entity getById(ID id);
	
	Entity insert(Entity entity);

	Entity update(Entity entity);
	
	List<Entity> getAll();

	void delete(ID key);

	void deleteAll();

	void delete(List<ID> ids);

	
}
