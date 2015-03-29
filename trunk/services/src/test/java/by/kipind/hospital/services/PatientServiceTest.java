package by.kipind.hospital.services;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import by.kipind.hospital.datamodel.Patient;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
public class PatientServiceTest {

	private Patient patient;

	@Test
	public void pstDBData() {
		//LOGGER.warn("Test log message.");
		//Assert.assertNotNull(PersonalService); //тест должен пройти, если DI работает
		
	}
}
