package by.kipind.hospital.dataaccess.intrfc;


public interface IAbstractDAO<ID, Entity> {

	Entity getById(ID id);
}
