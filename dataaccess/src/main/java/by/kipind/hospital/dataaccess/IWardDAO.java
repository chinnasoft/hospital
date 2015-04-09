package by.kipind.hospital.dataaccess;

import java.util.List;

import by.kipind.hospital.datamodel.Ward;

public interface IWardDAO extends IAbstractDAO<Long, Ward> {

	public List<Ward> getAllWithPersonal();
}