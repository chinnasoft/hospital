package by.kipind.hospital.services;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import by.kipind.hospital.services.impl.VisitService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
public class VisitServiceTest extends DBGeneratorTest {

	private static final Logger LOGGER = LoggerFactory.getLogger(VisitServiceTest.class);

	@Inject
	private VisitService visitService;

	@BeforeClass
	public void prepareDB() {
		LOGGER.info("Instance of VisitService is injected. Class is: {}", visitService.getClass().getName());

	}

	@Before
	public void cleanUpData() {

	}

	@Test
	public void DITest() {
		Assert.assertNotNull(visitService); // тест должен пройти, если DI
											// работает

	}

	/*
	 * @Test public void basicCRUDForVisitTest() {
	 * 
	 * Set<Personal> pers = new HashSet<Personal>(); Personal existPers = null;
	 * int n = TestRandomVal.randomInteger(2, 5); int m =
	 * TestRandomVal.randomInteger(1, n); for (int i = 1; i <= n; i++) { if (i
	 * == m) { existPers =
	 * personalService.saveOrUpdate(TestModelInstGenerator.getPersonal());
	 * pers.add(existPers); continue; }
	 * pers.add(personalService.saveOrUpdate(TestModelInstGenerator
	 * .getPersonal())); }
	 * 
	 * Ward ward = TestModelInstGenerator.getWard(pers);
	 * visitService.saveOrUpdate(ward);
	 * 
	 * Ward wardFromDb = visitService.getByIdEager(ward.getId());
	 * 
	 * Assert.assertNotNull(wardFromDb);
	 * Assert.assertEquals(wardFromDb.getComfortLvl(), ward.getComfortLvl());
	 * Assert.assertEquals(wardFromDb.getWardNum(), ward.getWardNum());
	 * 
	 * try { // no LazyInitializationException expected Set<Personal>
	 * checkLazyPersonalFromWard = wardFromDb.getPersonal();
	 * Assert.assertEquals(wardFromDb.getPersonal().size(),
	 * ward.getPersonal().size());
	 * Assert.assertEquals((wardFromDb.getPersonal().
	 * containsAll(ward.getPersonal())), Boolean.TRUE);
	 * 
	 * } catch (LazyInitializationException e) { Assert.assertEquals(1, 2);
	 * 
	 * }
	 * 
	 * ward.getPersonal().remove(existPers); visitService.saveOrUpdate(ward);
	 * Ward wardFromDbUpdated = visitService.getByIdEager(wardFromDb.getId());
	 * 
	 * Assert.assertNotEquals(wardFromDbUpdated.getPersonal().size(),
	 * wardFromDb.getPersonal().size());
	 * 
	 * visitService.delete(wardFromDbUpdated); wardFromDbUpdated =
	 * visitService.getById(wardFromDb.getId());
	 * Assert.assertNull(wardFromDbUpdated);
	 * 
	 * }
	 * 
	 * @Test public void blockCRUDWardTest() { Set<Personal> pers = new
	 * HashSet<Personal>(); Set<Personal> existPers = new HashSet<Personal>();
	 * 
	 * int n = TestRandomVal.randomInteger(1, 50); // for (int i = 1; i <= n;
	 * i++) {
	 * pers.add(personalService.saveOrUpdate(TestModelInstGenerator.getPersonal
	 * ())); } int m = TestRandomVal.randomInteger(1, 10);
	 * 
	 * for (int i = 1; i <= m; i++) { existPers.clear();
	 * existPers.addAll(TestRandomVal.randomSubCollection(pers,
	 * TestRandomVal.randomInteger(1, 5)));
	 * visitService.saveOrUpdate(TestModelInstGenerator.getWard(existPers)); }
	 * 
	 * List<Ward> wards = visitService.getAllVisits();
	 * Assert.assertEquals(wards.size(), m);
	 * 
	 * try { // exception will be thrown because of lazy collection Personal
	 * checkLazyPersonal = TestRandomVal
	 * .randomFromCollection(wards.get(TestRandomVal.randomInteger(0,
	 * wards.size()) - 1).getPersonal()); Assert.assertEquals(1, 2); } catch
	 * (LazyInitializationException e) { Assert.assertEquals(1, 1); }
	 * 
	 * 
	 * Personal persWithWards = TestRandomVal.randomFromCollection(existPers);
	 * wards.clear(); wards = visitService.getAllPersonalWards(persWithWards);
	 * Assert.assertNotEquals(wards.size(), 0); try { // exception will be
	 * thrown because of lazy collection Personal checkLazyPersonal2 =
	 * TestRandomVal
	 * .randomFromCollection(wards.get(TestRandomVal.randomInteger(0,
	 * wards.size()) - 1) .getPersonal()); Assert.assertEquals(1, 2); } catch
	 * (LazyInitializationException e) { Assert.assertEquals(1, 1); }
	 * 
	 * }
	 */
}
