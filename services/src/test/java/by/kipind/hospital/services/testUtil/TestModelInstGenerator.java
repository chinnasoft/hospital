package by.kipind.hospital.services.testUtil;

import by.kipind.hospital.datamodel.Patient;
import by.kipind.hospital.datamodel.enam.EHumanSex;

public abstract class TestModelInstGenerator extends TestRandomVal {

	public static Patient getPatient() {
		Patient patient = new Patient();
		patient.setAddress(randomString("address-"));
		patient.setBirthDt(randomDate());
		patient.setFirstName(randomString("f_name-"));
		patient.setLastName(randomString("l_name-"));
		patient.setSex(EHumanSex.values()[(randomInteger(0, EHumanSex.values().length - 1))]);
		patient.setSocialNumber(randomString());
		return patient;
	}
}
