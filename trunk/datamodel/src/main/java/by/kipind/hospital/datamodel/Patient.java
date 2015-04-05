package by.kipind.hospital.datamodel;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import by.kipind.hospital.datamodel.enam.EHumanSex;

@Entity
public class Patient extends AbstractEntity {
	@Column
	private String socialNumber;
	@Column
	private String firstName;
	@Column
	private String lastName;
	@Column
	private Date birthDt;
	@Column
	private String address;
	@Column
	@Enumerated(EnumType.ORDINAL)
	private EHumanSex sex;

	public String getSocialNumber() {
		return socialNumber;
	}

	public void setSocialNumber(String socialNumber) {
		this.socialNumber = socialNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDt() {
		return birthDt;
	}

	public void setBirthDt(Date birthDt) {
		this.birthDt = birthDt;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public EHumanSex getSex() {
		return sex;
	}

	public void setSex(EHumanSex sex) {
		this.sex = sex;
	}

}
