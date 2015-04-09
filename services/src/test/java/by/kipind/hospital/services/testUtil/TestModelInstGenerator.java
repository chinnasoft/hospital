package by.kipind.hospital.services.testUtil;

import by.kipind.hospital.datamodel.Patient;
import by.kipind.hospital.datamodel.Personal;
import by.kipind.hospital.datamodel.enam.EHumanSex;
import by.kipind.hospital.datamodel.enam.EProf;

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

	public static Personal getPersonal() {
		Personal personal = new Personal();
		personal.setFirstName(randomString("f_name-"));
		personal.setSecondName(randomString("s_name-"));
		personal.setTabelNumber(randomInteger(1000, 99999));
		personal.setPass(randomString());
		personal.setDelMarker(false);
		personal.setConMarker(randomBoolean());
		personal.setProf(EProf.values()[(randomInteger(0, EProf.values().length - 1))]);
		return personal;
	}
}
