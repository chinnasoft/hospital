package by.kipind.hospital.services;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import by.kipind.hospital.datamodel.Patient;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
public class PatientServiceTest {

	private static final Logger LOGGER = LoggerFactory
			.getLogger(PatientServiceTest.class);

	@Inject
	private IPatientService patientService;

	@Before
	public void cleanUpData() {
		LOGGER.info("Instance of ProductService is injected. Class is: {}",
				patientService.getClass().getName());
		// productService.deleteAll();
	}

	@Test
	public void pstDBData() {
		// LOGGER.warn("Test log message.");
		Assert.assertNotNull(patientService); // тест должен пройти, если DI
												// работает

	}

	@Test
	public void getDBData() {
		// patientService.saveOrUpdate(TestModelInstCreator.newPatient());

		Patient patientFromDb = patientService.getById(2l);
		Assert.assertNotNull(patientFromDb);

	}
}
