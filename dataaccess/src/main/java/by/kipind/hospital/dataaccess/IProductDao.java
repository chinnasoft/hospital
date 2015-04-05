package by.kipind.hospital.dataaccess;
import java.util.List;

import javax.persistence.metamodel.SingularAttribute;

import by.kipind.hospital.datamodel.Product;


public interface IProductDao extends IAbstractDAO<Long, Product> {

    Long getCount();

    List<Product> getAllProducts();

    List<Product> getAllProducts(SingularAttribute<Product, ?> attr, boolean ascending, int startRecord, int pageSize);

    List<Product> getAllProductsByName(String name);

    List<Product> getAllProductsWithImages();
} 