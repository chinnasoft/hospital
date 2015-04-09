package by.kipind.hospital.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import by.kipind.hospital.datamodel.Ward;

public interface IWardService {

	Ward getById(Long id);

	@Transactional
	void saveOrUpdate(Ward visit);

	@Transactional
	void delete(Ward visit);

	@Transactional
	void delete(List<Ward> ids);

	@Transactional
	void deleteAll();

	List<Ward> getAllWards();
}