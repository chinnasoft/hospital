package by.kipind.hospital.services.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import by.kipind.hospital.dataaccess.IWardDAO;
import by.kipind.hospital.datamodel.Ward;
import by.kipind.hospital.services.IWardService;

@Service
public class WardService implements IWardService {

	private static final Logger LOGGER = LoggerFactory.getLogger(WardService.class);

	@Inject
	private IWardDAO WardDAO;

	@PostConstruct
	private void init() {
		// this method will be called by Spring after bean instantiation. Can be
		// used for any initialization process.
		LOGGER.info("Instance of WardService is created. Class is: {}", getClass().getName());
	}

	@Override
	public Ward getById(Long id) {
		Ward entity = WardDAO.getById(id);
		return entity;
	}

	@Override
	public void saveOrUpdate(Ward ward) {
		if (ward.getId() == null) {
			WardDAO.insert(ward);
		} else {
			WardDAO.update(ward);
		}

	}

	@Override
	public void delete(Ward ward) {
		LOGGER.debug("Remove: {}", ward);
		WardDAO.delete(ward.getId());

	}

	@Override
	public void delete(List<Ward> wardsList) {
		LOGGER.debug("Remove List: {}");

		List<Long> idList = new ArrayList<Long>();

		for (Ward ward : wardsList) {
			idList.add(ward.getId());
		}
		WardDAO.delete(idList);

	}

	@Override
	public void deleteAll() {
		LOGGER.debug("Remove all products");
		WardDAO.deleteAll();
	}

	@Override
	public List<Ward> getAllWards() {
		return WardDAO.getAll();

	}

}
