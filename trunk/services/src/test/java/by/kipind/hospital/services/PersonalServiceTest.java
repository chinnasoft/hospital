package by.kipind.hospital.services;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml"}) //сообщаем область для  
public class PersonalServiceTest {
	
	@Inject // выполняем DI
	private PersonalAccountServise PersonalService;

	@Test
	public void PersonalServiceDITest() {
		//LOGGER.warn("Test log message.");
		Assert.assertNotNull(PersonalService); //тест должен пройти, если DI работает
		}
}
