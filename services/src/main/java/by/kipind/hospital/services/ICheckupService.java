package by.kipind.hospital.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import by.kipind.hospital.datamodel.Checkup;

public interface ICheckupService {

	Checkup getById(Long id);

	@Transactional
	void saveOrUpdate(Checkup checkup);

	@Transactional
	void delete(Checkup checkup);

	@Transactional
	void delete(List<Checkup> ids);

	@Transactional
	void deleteAll();

	List<Checkup> getAllCheckups();

}