package by.kipind.hospital.services.impl;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
//import javax.persistence.metamodel.SingularAttribute;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import by.kipind.hospital.dataaccess.IProductDao;
import by.kipind.hospital.datamodel.Product;
import by.kipind.hospital.services.IProductService;

@Service
public class ProductService implements IProductService {
	private static final Logger LOGGER = LoggerFactory
			.getLogger(ProductService.class);

	@Inject
	private IProductDao dao;

	@PostConstruct
	private void init() {
		// this method will be called by Spring after bean instantiation. Can be
		// used for any initialization process.
		LOGGER.info("Instance of ProductService is created. Class is: {}",
				getClass().getName());
	}

	/*
	 * @Override public List<Product> getAllProducts(SingularAttribute<Product,
	 * ?> attr, boolean ascending, int startRecord, int pageSize) { return
	 * dao.getAllProducts(attr, ascending, startRecord, pageSize); }
	 */

	@Override
	public Product get(Long id) {
		Product entity = dao.getById(id);
		return entity;
	}

	@Override
	public void saveOrUpdate(Product product) {
		if (product.getId() == null) {
			LOGGER.debug("Save new: {}", product);
			dao.insert(product);
		} else {
			LOGGER.debug("Update: {}", product);
			dao.update(product);
		}
	}

	@Override
	public void delete(Product product) {
		LOGGER.debug("Remove: {}", product);
		dao.delete(product.getId());

	}

	@Override
	public void deleteAll() {
		LOGGER.debug("Remove all products");
		dao.deleteAll();
	}

	@Override
	public List<Product> getAllProducts() {
		return dao.getAllProducts();

	}

	@Override
	public List<Product> getAllProductsByName(String name) {
		return dao.getAllProductsByName(name);
	}

	@Override
	public Long getCount() {
		return dao.getCount();
	}
}
