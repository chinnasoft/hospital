package by.kipind.hospital.services;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import by.kipind.hospital.datamodel.Product;

//import by.dzhvisuhko.sample.datamodel.Product_;

public class VisitServiceTest {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(VisitServiceTest.class);

	@Inject
	private IVisitService visitService;

	@Before
	public void cleanUpData() {
		LOGGER.info("Instance of ProductService is injected. Class is: {}",
				visitService.getClass().getName());
		// productService.deleteAll();
	}

	@Test
	public void basicCRUDTest() {
		// Product product = createProduct();
		// productService.saveOrUpdate(product);

		Product productFromDb = visitService.get(2l);
		Assert.assertNotNull(productFromDb);
		/*
		 * Assert.assertEquals(productFromDb.getName(), product.getName()); //
		 * TODO check other fields
		 * 
		 * productFromDb.setName("newName");
		 * productService.saveOrUpdate(productFromDb); Product
		 * productFromDbUpdated = productService.get(product.getId());
		 * Assert.assertEquals(productFromDbUpdated.getName(),
		 * productFromDb.getName());
		 * Assert.assertNotEquals(productFromDbUpdated.getName(),
		 * product.getName());
		 */
		/*
		 * productService.delete(productFromDbUpdated);
		 * Assert.assertNull(productService.get(product.getId()));
		 */
	}

	/*
	 * @Test public void manyToManyTest() { Product product = createProduct();
	 * 
	 * int randomTestObjectsCount = randomTestObjectsCount(); HashSet<Image>
	 * images = new HashSet<Image>(); for (int i = 0; i <
	 * randomTestObjectsCount; i++) { Image image = createImage();
	 * imageService.saveOrUpdate(image); images.add(image); }
	 * product.setImages(images); productService.saveOrUpdate(product);
	 * 
	 * // load product from DB Product productFromDb =
	 * productService.get(product.getId()); try { // exception will be thrown
	 * because of lazy collection Set<Image> lazyImagesFromProduct =
	 * productFromDb.getImages(); } catch (LazyInitializationException e) { //
	 * expected exception }
	 * 
	 * // clear images using 'empty' collection productFromDb.setImages(new
	 * HashSet<Image>()); // check logs... this "save" will trigger delete from
	 * the // "product_2_image" table
	 * productService.saveOrUpdate(productFromDb);
	 * 
	 * }
	 * 
	 * @Test public void searchTest() { Product product = createProduct();
	 * productService.saveOrUpdate(product);
	 * 
	 * List<Product> allProduct = productService.getAllProducts();
	 * Assert.assertEquals(allProduct.size(), 1);
	 * 
	 * }
	 * 
	 * @Test public void countTest() { Product product = createProduct();
	 * productService.saveOrUpdate(product);
	 * Assert.assertEquals(productService.getCount().longValue(), 1);
	 * 
	 * }
	 * 
	 * @Test public void searchTestWithPagingAndSort() { int pageSize = 10; int
	 * randomTestObjectsCount = randomTestObjectsCount() + pageSize + 1; for
	 * (int i = 0; i < randomTestObjectsCount; i++) { Product product =
	 * createProduct(); productService.saveOrUpdate(product); }
	 * 
	 * // select first 10 products ordered by name // List<Product>
	 * first10Products = productService.getAllProducts(Product_.name, true, 0,
	 * pageSize); // Assert.assertTrue(first10Products.size() == 10);
	 * 
	 * }
	 * 
	 * @Test public void searchByNameTest() { Product product = createProduct();
	 * String name = randomString("name-"); product.setName(name);
	 * productService.saveOrUpdate(product);
	 * 
	 * Product anotherProduct = createProduct();
	 * productService.saveOrUpdate(anotherProduct);
	 * 
	 * List<Product> allProduct = productService.getAllProducts();
	 * Assert.assertEquals(allProduct.size(), 2);
	 * 
	 * List<Product> allProductByName =
	 * productService.getAllProductsByName(name);
	 * Assert.assertEquals(allProductByName.size(), 1);
	 * Assert.assertEquals(allProductByName.get(0).getId(), product.getId());
	 * 
	 * }
	 * 
	 * private Image createImage() { Image image = new Image();
	 * image.setUrl(randomString("url-")); return image; }
	 */
}
