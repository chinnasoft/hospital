package by.kipind.hospital.dataaccess.impl;

import java.util.List;

import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.SingularAttribute;

import org.hibernate.jpa.criteria.OrderImpl;
import org.springframework.stereotype.Repository;

import by.kipind.hospital.dataaccess.IProductDao;
import by.kipind.hospital.datamodel.Product;

//import by.dzhvisuhko.sample.datamodel.Product_;

@Repository
public class ProductDao extends AbstractDAO<Long, Product> implements
		IProductDao {

	protected ProductDao() {
		super(Product.class);
	}

	/*
	 * 'select all' example.
	 */
	@Override
	public List<Product> getAllProducts() {
		CriteriaBuilder cBuilder = getEm().getCriteriaBuilder();

		CriteriaQuery<Product> criteria = cBuilder.createQuery(Product.class);
		Root<Product> root = criteria.from(Product.class);

		criteria.select(root);

		TypedQuery<Product> query = getEm().createQuery(criteria);
		List<Product> results = query.getResultList();
		return results;
	}

	@Override
	public Long getCount() {
		CriteriaBuilder cBuilder = getEm().getCriteriaBuilder();

		CriteriaQuery<Long> criteria = cBuilder.createQuery(Long.class);
		Root<Product> root = criteria.from(Product.class);

		criteria.select(cBuilder.count(root));

		TypedQuery<Long> query = getEm().createQuery(criteria);
		return query.getSingleResult();
	}

	/*
	 * 'select all' with sorting and paging example.
	 */
	@Override
	public List<Product> getAllProducts(SingularAttribute<Product, ?> attr,
			boolean ascending, int startRecord, int pageSize) {
		CriteriaBuilder cBuilder = getEm().getCriteriaBuilder();

		CriteriaQuery<Product> criteria = cBuilder.createQuery(Product.class);
		Root<Product> root = criteria.from(Product.class);

		criteria.select(root);
		criteria.orderBy(new OrderImpl(root.get(attr), ascending));

		TypedQuery<Product> query = getEm().createQuery(criteria);
		query.setFirstResult(startRecord);
		query.setMaxResults(pageSize);

		List<Product> results = query.getResultList();
		return results;
	}

	@Override
	public List<Product> getAllProductsByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProductsWithImages() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * 'select/where' example.
	 */
	/*
	 * @Override public List<Product> getAllProductsByName(String name) {
	 * CriteriaBuilder cBuilder = getEm().getCriteriaBuilder();
	 * 
	 * CriteriaQuery<Product> root = cBuilder.createQuery(Product.class);
	 * Root<Product> criteria = root.from(Product.class);
	 * 
	 * root.select(criteria);
	 * 
	 * root.where(cBuilder.equal(criteria.get(Product_.name), name));
	 * 
	 * TypedQuery<Product> query = getEm().createQuery(root); List<Product>
	 * results=new List() ;// = query.getResultList(); return results; }
	 */
	/*
	 * 'select all with JOIN/FETCh images' example.
	 */
	/*
	 * @Override public List<Product> getAllProductsWithImages() {
	 * CriteriaBuilder cBuilder = getEm().getCriteriaBuilder();
	 * 
	 * CriteriaQuery<Product> criteria = cBuilder.createQuery(Product.class);
	 * Root<Product> root = criteria.from(Product.class);
	 * 
	 * criteria.select(root); root.fetch(Product_.images);
	 * criteria.distinct(true);
	 * 
	 * TypedQuery<Product> query = getEm().createQuery(criteria); List<Product>
	 * results = query.getResultList(); List<Product> results; return results; }
	 */
}
