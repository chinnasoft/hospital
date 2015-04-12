package by.kipind.hospital.services;

import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import by.kipind.hospital.datamodel.Patient;
import by.kipind.hospital.datamodel.Personal;
import by.kipind.hospital.datamodel.Visit;
import by.kipind.hospital.datamodel.Ward;
import by.kipind.hospital.services.testUtil.TestModelInstGenerator;
import by.kipind.hospital.services.testUtil.TestRandomVal;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml" })
public class DBGeneratorTest {

	private static int BASIC_SIZE = 50;

	private Set<Personal> personal = new HashSet<Personal>();
	private Set<Patient> patients = new HashSet<Patient>();
	private Set<Ward> wards = new HashSet<Ward>();
	private Set<Visit> visits = new HashSet<Visit>();

	@Inject
	private IWardService wardService;
	@Inject
	private IPersonalService personalService;
	@Inject
	private IPatientService patientService;
	@Inject
	private IVisitService visitService;

	@Test
	public void generateDB() {
		visitService.deleteAll();// link: patient,ward

		wardService.deleteAll();// many_2_many:personal

		patientService.deleteAll();
		personalService.deleteAll();

		// создаем персонал
		int n = TestRandomVal.randomInteger(1, BASIC_SIZE); //
		for (int i = 1; i <= n; i++) {
			personal.add(personalService.saveOrUpdate(TestModelInstGenerator.getPersonal()));
		}
		Assert.assertEquals(n, personalService.getAllPersonal().size());

		// создаем пациентов
		n = TestRandomVal.randomInteger(1, BASIC_SIZE); //
		for (int i = 1; i <= n; i++) {
			patients.add(patientService.saveOrUpdate(TestModelInstGenerator.getPatient()));
		}
		Assert.assertEquals(n, patientService.getAllPatients().size());

		// создаем палаты
		n = TestRandomVal.randomInteger(1, Math.round(BASIC_SIZE * 0.1f));
		for (int i = 1; i <= n; i++) {
			wards.add(wardService.saveOrUpdate(TestModelInstGenerator.getWard(TestRandomVal.randomSubCollection(personal, 3))));
		}
		Assert.assertEquals(n, wardService.getAllWards().size());

		// создаем визиты
		n = 0;
		Set<Visit> visitsPerPAtient = new HashSet<Visit>();
		for (Patient patient : patients) {
			visitsPerPAtient = TestModelInstGenerator.getVisitsForPatient(wards, patient, TestRandomVal.randomBoolean());
			n = n + visitsPerPAtient.size();
			visits.addAll(visitService.saveOrUpdate(visitsPerPAtient));
		}
		Assert.assertEquals(n, visitService.getAllVisits().size());

	}
}
