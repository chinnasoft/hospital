package by.kipind.hospital.services.testUtil;

import java.util.HashSet;
import java.util.Set;

import javax.inject.Inject;

import by.kipind.hospital.datamodel.Patient;
import by.kipind.hospital.datamodel.Personal;
import by.kipind.hospital.datamodel.Visit;
import by.kipind.hospital.datamodel.Ward;
import by.kipind.hospital.services.IPatientService;
import by.kipind.hospital.services.IPersonalService;
import by.kipind.hospital.services.IVisitService;
import by.kipind.hospital.services.IWardService;

public class DBGenerator {

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

	public void startGener() {

		// создаем персонал
		int n = TestRandomVal.randomInteger(1, BASIC_SIZE); //
		for (int i = 1; i <= n; i++) {
			personal.add(personalService.saveOrUpdate(TestModelInstGenerator.getPersonal()));
		}

		// создаем пациентов
		n = TestRandomVal.randomInteger(1, BASIC_SIZE); //
		for (int i = 1; i <= n; i++) {
			patients.add(patientService.saveOrUpdate(TestModelInstGenerator.getPatient()));
		}

		// создаем палаты
		n = TestRandomVal.randomInteger(1, Math.round(BASIC_SIZE * 0.1f));
		for (int i = 1; i <= n; i++) {
			wards.add(wardService.saveOrUpdate(TestModelInstGenerator.getWard(TestRandomVal.randomSubCollection(personal, 3))));
		}

		// создаем визиты
		for (Patient patient : patients) {
			visits.addAll(visitService.saveOrUpdate(TestModelInstGenerator.getVisitsForPatient(wards, patient, TestRandomVal.randomBoolean())));
		}

	}
}
