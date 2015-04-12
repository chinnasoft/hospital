package by.kipind.hospital.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import by.kipind.hospital.datamodel.Ward;

public interface IWardService {

	Ward getById(Long id);

	@Transactional
	Ward saveOrUpdate(Ward ward);

	@Transactional
	void delete(Ward ward);

	@Transactional
	// Только для тестирования
	void deleteAll();

	List<Ward> getAllWards();

	// ----

}