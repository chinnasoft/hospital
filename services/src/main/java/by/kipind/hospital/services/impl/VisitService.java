package by.kipind.hospital.services.impl;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
//import javax.persistence.metamodel.SingularAttribute;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import by.kipind.hospital.dataaccess.IVisitDAO;
import by.kipind.hospital.datamodel.Product;
import by.kipind.hospital.services.IVisitService;

@Service
public class VisitService implements IVisitService {

	private static final Logger LOGGER = LoggerFactory.getLogger(VisitService.class);

	@Inject
	private IVisitDAO visitDAO;

	@PostConstruct
	private void init() {
		// this method will be called by Spring after bean instantiation. Can be
		// used for any initialization process.
		LOGGER.info("Instance of ProductService is created. Class is: {}", getClass().getName());
	}

	@Override
	public Product get(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getCount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveOrUpdate(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProductsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
