package by.kipind.hospital.services;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"}) //сообщаем область для  
public class PersonalServiceTest {
	private static final Logger LOGGER = LoggerFactory.getLogger(PersonalServiceTest.class);

	@Inject // выполняем DI
	private PatientAccountServise PersonalService;

	@Test
	public void PersonalServiceDITest() {
		LOGGER.warn("Test log message.");
		Assert.assertNotNull(PersonalService); //тест должен пройти, если DI работает
		}
}
