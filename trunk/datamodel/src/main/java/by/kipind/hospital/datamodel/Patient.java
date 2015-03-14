package by.kipind.hospital.datamodel;

import java.util.Date;

public class Patient {
	private Long id;
	private String socialNumber;
	private String firstName;
	private String lastName;
	private Date birthDt;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
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
	
	
	
}
