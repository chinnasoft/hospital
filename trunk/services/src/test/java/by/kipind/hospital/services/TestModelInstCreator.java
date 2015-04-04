package by.kipind.hospital.services;

import by.kipind.hospital.datamodel.Patient;
import by.kipind.hospital.datamodel.enam.HumanSex;
import by.kipind.hospital.services.TestRandomVal;


public class TestModelInstCreator {
	
	
	public static Patient newPatient() {
		Patient patient = new Patient();
		patient.setAddress(TestRandomVal.randomString("address-"));
		patient.setBirthDt(TestRandomVal.randomDate());
		patient.setFirstName(TestRandomVal.randomString("f_name-"));
		patient.setLastName(TestRandomVal.randomString("l_name-"));
		patient.setSex(HumanSex.FEMALE);
		patient.setSocialNumber(TestRandomVal.randomString());
		return patient;
	}
}
