package by.kipind.hospital.services;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import by.kipind.hospital.datamodel.Visit;

public interface IVisitService {

	Visit getById(Long id);

	@Transactional
	void saveOrUpdate(Visit visit);

	@Transactional
	void delete(Visit visit);

	@Transactional
	void delete(List<Visit> ids);

	@Transactional
	void deleteAll();

	List<Visit> getAllVisits(); // с ограничением

}