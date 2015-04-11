package by.kipind.hospital.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import by.kipind.hospital.datamodel.Personal;

public interface IPersonalService {

	Personal getById(Long id);

	@Transactional
	Personal saveOrUpdate(Personal personal);

	@Transactional
	void delete(Personal personal);

	@Transactional
	void delete(List<Personal> ids);

	@Transactional
	void deleteAll();

	List<Personal> getAllPersonal();

}