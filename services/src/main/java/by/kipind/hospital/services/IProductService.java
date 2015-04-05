package by.kipind.hospital.services;
import java.util.List;


import org.springframework.transaction.annotation.Transactional;

import by.kipind.hospital.datamodel.Product;


public interface IProductService {

   // List<Product> getAllProducts(SingularAttribute<Product, ?> attr, boolean ascending, int startRecord, int pageSize);

    Product get(Long id);

    Long getCount();

    @Transactional
    void saveOrUpdate(Product product);

    @Transactional
    void delete(Product product);

    @Transactional
    void deleteAll();

    List<Product> getAllProducts();

    List<Product> getAllProductsByName(String name);
}