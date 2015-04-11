package by.kipind.hospital.services.testUtil;

import java.util.Set;

import by.kipind.hospital.datamodel.Patient;
import by.kipind.hospital.datamodel.Personal;
import by.kipind.hospital.datamodel.Ward;
import by.kipind.hospital.datamodel.enam.EHumanSex;
import by.kipind.hospital.datamodel.enam.EProf;
import by.kipind.hospital.datamodel.enam.EWardComfort;

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

	public static Ward getWard(Set<Personal> pers) {
		Ward ward = new Ward();
		ward.setWardNum(randomInteger(1, 99999));
		ward.setComfortLvl(EWardComfort.values()[(randomInteger(0, EWardComfort.values().length - 1))]);
		ward.setPersonal(pers);
		return ward;
	}
}
