package by.kipind.hospital.services;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import by.kipind.hospital.datamodel.Patient;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"}) 
public class PatientServiceTest  {

	
	@Inject
	private IPatientService patientService;
	
	@Test
	public void pstDBData() {
		//LOGGER.warn("Test log message.");
		Assert.assertNotNull(patientService); //тест должен пройти, если DI работает
		
	}	
	@Test
	public void getDBData() {
		patientService.saveOrUpdate(TestModelInstCreator.newPatient());
		
	//	final Patient patient=patientService.get(1l);
	//	Assert.assertEquals( patient.getId(),Long.getLong("1")); 
		
	}
}
