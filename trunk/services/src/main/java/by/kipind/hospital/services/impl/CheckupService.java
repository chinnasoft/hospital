package by.kipind.hospital.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import by.kipind.hospital.dataaccess.ICheckupDAO;
import by.kipind.hospital.datamodel.Checkup;
import by.kipind.hospital.services.ICheckupService;

@Service
public class CheckupService implements ICheckupService {

	private static final Logger LOGGER = LoggerFactory.getLogger(CheckupService.class);

	@Inject
	private ICheckupDAO CheckupDAO;

	@PostConstruct
	private void init() {
		// this method will be called by Spring after bean instantiation. Can be
		// used for any initialization process.
		LOGGER.info("Instance of CheckupService is created. Class is: {}", getClass().getName());
	}

	@Override
	public Checkup getById(Long id) {
		Checkup entity = CheckupDAO.getById(id);
		return entity;
	}

	@Override
	public void saveOrUpdate(Checkup checkup) {
		if (checkup.getId() == null) {
			CheckupDAO.insert(checkup);
		} else {
			CheckupDAO.update(checkup);
		}

	}

	@Override
	public void delete(Checkup checkup) {
		LOGGER.debug("Remove: {}", checkup);
		CheckupDAO.delete(checkup.getId());

	}

	@Override
	public void delete(List<Checkup> checkupsList) {
		LOGGER.debug("Remove List: {}");

		List<Long> idList = new ArrayList<Long>();

		for (Checkup checkup : checkupsList) {
			idList.add(checkup.getId());
		}
		CheckupDAO.delete(idList);

	}

	@Override
	public void deleteAll() {
		LOGGER.debug("Remove all products");
		CheckupDAO.deleteAll();
	}

	@Override
	public List<Checkup> getAllCheckups() {
		return CheckupDAO.getAll();

	}

}
