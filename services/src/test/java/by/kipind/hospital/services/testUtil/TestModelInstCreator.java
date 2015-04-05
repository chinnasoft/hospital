package by.kipind.hospital.services.testUtil;

import by.kipind.hospital.datamodel.Patient;
import by.kipind.hospital.datamodel.enam.EHumanSex;

public abstract class TestModelInstCreator {

	public static Patient newPatient() {
		Patient patient = new Patient();
		patient.setAddress(TestRandomVal.randomString("address-"));
		patient.setBirthDt(TestRandomVal.randomDate());
		patient.setFirstName(TestRandomVal.randomString("f_name-"));
		patient.setLastName(TestRandomVal.randomString("l_name-"));
		patient.setSex(EHumanSex.FEMALE);
		patient.setSocialNumber(TestRandomVal.randomString());
		return patient;
	}
}
